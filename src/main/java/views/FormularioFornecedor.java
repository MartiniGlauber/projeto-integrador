package views;

import controller.FornecedorController;
import factory.ControllerFactory;
import models.Endereco;
import models.Fornecedor;

public class FormularioFornecedor extends javax.swing.JInternalFrame {

	private Fornecedor fornecedor;
  private final FornecedorController fornecedorController;
  
	public FormularioFornecedor(ControllerFactory controllerFactory) {
    this.fornecedorController = controllerFactory.createFornecedorController();
		initComponents();
	}

	// <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
	private void initComponents() {

		labelFormFornecedor = new javax.swing.JLabel();
		inputCnpj = new javax.swing.JTextField();
		labelCnpj = new javax.swing.JLabel();
		inputNome = new javax.swing.JTextField();
		labelNome = new javax.swing.JLabel();
		inputEmail = new javax.swing.JTextField();
		labelEmail = new javax.swing.JLabel();
		inputFone = new javax.swing.JTextField();
		jLabel1 = new javax.swing.JLabel();
		jTextField1 = new javax.swing.JTextField();
		jLabel2 = new javax.swing.JLabel();
		jTextField2 = new javax.swing.JTextField();
		jLabel3 = new javax.swing.JLabel();
		jTextField3 = new javax.swing.JTextField();
		jLabel4 = new javax.swing.JLabel();
		inputEndereco = new javax.swing.JTextField();
		jLabel5 = new javax.swing.JLabel();
		inputNumero = new javax.swing.JTextField();
		jLabel6 = new javax.swing.JLabel();
		inputComplemento = new javax.swing.JTextField();
		jLabel7 = new javax.swing.JLabel();
		btnCadastra = new javax.swing.JButton();
		btnCancela = new javax.swing.JButton();

		labelFormFornecedor.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
		labelFormFornecedor.setText("Formulário de fornecedor");

		labelCnpj.setText("CNPJ");

		labelNome.setText("Nome");

		labelEmail.setText("E-mail");

		jLabel1.setText("Telefone");

		jLabel2.setText("CEP");

		jLabel3.setText("UF");

		jLabel4.setText("Cidade");

		jLabel5.setText("Endereço");

		jLabel6.setText("Número");

		jLabel7.setText("Complemento");

		btnCadastra.setBackground(new java.awt.Color(0, 102, 204));
		btnCadastra.setForeground(new java.awt.Color(255, 255, 255));
		btnCadastra.setText("Cadastrar");
		btnCadastra.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnCadastraActionPerformed(evt);
			}
		});

		btnCancela.setBackground(new java.awt.Color(204, 0, 0));
		btnCancela.setForeground(new java.awt.Color(255, 255, 255));
		btnCancela.setText("Cancelar");
		btnCancela.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnCancelaActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout
				.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(layout.createSequentialGroup()
								.addContainerGap(40, Short.MAX_VALUE)
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addGroup(layout.createSequentialGroup()
												.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 114,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(jLabel2))
												.addGap(130, 130, 130)
												.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(jLabel4)
														.addGroup(layout.createSequentialGroup().addComponent(jTextField3).addGap(109, 109, 109))))
										.addGroup(layout.createSequentialGroup()
												.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(inputEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 300,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(jLabel5)
														.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
																layout.createSequentialGroup()
																		.addGap(169, 169, 169)
																		.addComponent(btnCadastra, javax.swing.GroupLayout.PREFERRED_SIZE, 130,
																				javax.swing.GroupLayout.PREFERRED_SIZE)))
												.addGap(29, 29, 29)
												.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
														.addGroup(layout.createSequentialGroup()
																.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
																		.addComponent(jLabel6)
																		.addComponent(inputNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 59,
																				javax.swing.GroupLayout.PREFERRED_SIZE))
																.addGap(18, 18, 18)
																.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
																		.addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE,
																				javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
																		.addComponent(inputComplemento)))
														.addComponent(btnCancela, javax.swing.GroupLayout.PREFERRED_SIZE, 130,
																javax.swing.GroupLayout.PREFERRED_SIZE))
												.addGap(0, 109, Short.MAX_VALUE))
										.addGroup(layout.createSequentialGroup()
												.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(labelFormFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 236,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addGroup(layout.createSequentialGroup()
																.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
																		.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
																				.addComponent(labelCnpj)
																				.addGroup(layout
																						.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
																						.addComponent(inputCnpj, javax.swing.GroupLayout.Alignment.LEADING,
																								javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
																						.addComponent(inputEmail, javax.swing.GroupLayout.Alignment.LEADING))
																				.addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
																				.addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 16,
																						javax.swing.GroupLayout.PREFERRED_SIZE))
																		.addComponent(labelEmail))
																.addGap(18, 18, 18)
																.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
																		.addComponent(jLabel1)
																		.addComponent(labelNome)
																		.addComponent(inputNome, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)
																		.addComponent(inputFone))))
												.addContainerGap(40, Short.MAX_VALUE)))));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
						.addGap(32, 32, 32)
						.addComponent(labelFormFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 33,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(25, 25, 25)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(labelCnpj)
								.addComponent(labelNome))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(inputCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(inputNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(20, 20, 20)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(labelEmail)
								.addComponent(jLabel1))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(inputEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(inputFone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(22, 22, 22)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel2)
								.addComponent(jLabel3)
								.addComponent(jLabel4))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(26, 26, 26)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel5)
								.addComponent(jLabel6)
								.addComponent(jLabel7))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(inputEndereco, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(inputNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(inputComplemento, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(btnCadastra)
								.addComponent(btnCancela))
						.addGap(17, 17, 17)));

		pack();
	}// </editor-fold>//GEN-END:initComponents

	private void btnCadastraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastraActionPerformed
    
		fornecedorController.cadastra(fornecedor);
	}//GEN-LAST:event_btnCadastraActionPerformed

	private void btnCancelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelaActionPerformed
		// fechar internalFrame
	}//GEN-LAST:event_btnCancelaActionPerformed

  private Fornecedor criaFornecedor(){
    String cnpj = inputCnpj.getText();
    String nome = inputNome.getText();
    String email = inputEmail.getText();
    String fone = inputFone.getText();
    String endereco = inputEndereco.getText();
    String cep = inputEndereco.get
    String complemento = inputComplemento.getText();
    String numero = inputNumero.getText();
    
    return new Fornecedor(cnpj, nome, email, fone, new Endereco(cep, endereco, bairro, cidade, uf) );
  }
  
	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JButton btnCadastra;
	private javax.swing.JButton btnCancela;
	private javax.swing.JTextField inputCnpj;
	private javax.swing.JTextField inputComplemento;
	private javax.swing.JTextField inputEmail;
	private javax.swing.JTextField inputEndereco;
	private javax.swing.JTextField inputFone;
	private javax.swing.JTextField inputNome;
	private javax.swing.JTextField inputNumero;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JLabel jLabel7;
	private javax.swing.JTextField jTextField1;
	private javax.swing.JTextField jTextField2;
	private javax.swing.JTextField jTextField3;
	private javax.swing.JLabel labelCnpj;
	private javax.swing.JLabel labelEmail;
	private javax.swing.JLabel labelFormFornecedor;
	private javax.swing.JLabel labelNome;
	// End of variables declaration//GEN-END:variables
}
