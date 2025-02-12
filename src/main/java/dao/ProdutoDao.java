package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import models.produto.DadosBasicosProduto;
import models.produto.Formato;
import models.produto.Produto;

public class ProdutoDao {

  private final Connection con;

  public ProdutoDao(Connection con) {
    this.con = con;
  }

  public void cadastra(DadosBasicosProduto dados) {
    String sql = "INSERT INTO produto (codigo, descricao, formato) VALUES (?, ?, ?)";

    try (PreparedStatement ps = con.prepareStatement(sql)) {
      ps.setString(1, dados.codigo());
      ps.setString(2, dados.descricao());
      ps.setInt(3, dados.formato().getCodigo());

      ps.execute();

    } catch (SQLException e) {
      throw new RuntimeException(e);
    }
  }

  public void edita(DadosBasicosProduto dados) {
    String sql = "UPDATE produto SET descricao = ?, formato = ? WHERE codigo = ?";

    try (PreparedStatement ps = con.prepareStatement(sql)) {
      ps.setString(1, dados.descricao());
      ps.setInt(2, dados.formato().getCodigo());
      ps.setString(3, dados.codigo());
      ps.execute();

    } catch (SQLException e) {
      throw new RuntimeException(e);
    }
  }

  public void exclui(String codigo) {
    String sql = "UPDATE produto SET ativo = FALSE WHERE codigo = ?";

    try (PreparedStatement ps = con.prepareStatement(sql)) {
      ps.setString(1, codigo);

      ps.execute();
    } catch (SQLException e) {
      throw new RuntimeException(e);
    }
  }

  public List<Produto> listaTodos() {
    String sql = "SELECT codigo, descricao, preco_custo, preco_venda, formato, estoque, ativo FROM produto WHERE ativo = TRUE";
    try (PreparedStatement ps = con.prepareStatement(sql)) {
      List<Produto> produtos = transformaResultSet(ps);
      return produtos;
    } catch (SQLException e) {
      throw new RuntimeException(e);
    }
  }

  public Produto buscaPorCodigo(String codigo) {
    String sql = "SELECT codigo, descricao, preco_custo, preco_venda, formato, estoque, ativo FROM produto WHERE codigo = ?";
    try (PreparedStatement ps = con.prepareCall(sql)) {
      ps.setString(1, codigo);
      List<Produto> produtos = transformaResultSet(ps);

      if (produtos.isEmpty())
        throw new RuntimeException("Nenhum produto encontrado para o código " + codigo);

      return produtos.toArray(new Produto[1])[0];

    } catch (SQLException e) {
      throw new RuntimeException(e);
    }
  }

  private List<Produto> transformaResultSet(PreparedStatement ps) {
    List<Produto> produtos = new ArrayList<>();
    try (ResultSet rs = ps.executeQuery()) {
      while (rs.next()) {
        String codigo = rs.getString("codigo");
        String descricao = rs.getString("descricao");
        float precoCusto = rs.getFloat("preco_custo");
        float precoVenda = rs.getFloat("preco_venda");
        String nomeFormato = rs.getString("formato");
        double estoque = rs.getFloat("estoque");
        var ativo = rs.getBoolean("ativo");

        Formato formato = Formato.valueOf(nomeFormato.toUpperCase());
        Produto p = new Produto(codigo, descricao, formato, estoque, precoVenda, precoCusto, ativo);
        produtos.add(p);
      }
      return Collections.unmodifiableList(produtos);
    } catch (SQLException e) {
      throw new RuntimeException(e);
    }
  }
}
