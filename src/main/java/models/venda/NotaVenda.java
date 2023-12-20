package models.venda;

import java.time.LocalDate;
import models.nota.Nota;

import models.produto.Produto;

public class NotaVenda extends Nota {

	public NotaVenda(String numero, LocalDate data) {
		super(numero, data);
	}

	public NotaVenda(String numero, LocalDate data, Produto... produtos) {
		super(numero, data);
		addItens(produtos);
	}
}
