package br.com.impacta.gui;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

import br.com.impacta.classes.DocumentoCnpj;
import br.com.impacta.classes.DocumentoCpf;
import br.com.impacta.classes.Funcionario;
import br.com.impacta.dal.FuncionariosDao;
import br.com.impacta.enumeracoes.Sexo;
import br.com.impacta.interfaces.Documento;

public class CadastroFuncionarios extends JFrame {

	private JPanel contentPane;
	private JTextField txtDocumento;
	private JTextField txtNome;
	private JTextField txtIdade;
	private JTextField txtCargo;
	private JTextField txtSalario;

	JComboBox<Funcionario> cmbFuncionario = new JComboBox();
	JComboBox<Sexo> cmbSexo = new JComboBox();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
					CadastroFuncionarios frame = new CadastroFuncionarios();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CadastroFuncionarios() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 465, 384);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 398, 278);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblDocumento = new JLabel("Documento:");
		lblDocumento.setBounds(10, 11, 77, 14);
		panel.add(lblDocumento);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(10, 36, 77, 14);
		panel.add(lblNome);
		
		JLabel lblIdade = new JLabel("Idade:");
		lblIdade.setBounds(10, 61, 46, 14);
		panel.add(lblIdade);
		
		JLabel lblCargo = new JLabel("Cargo:");
		lblCargo.setBounds(10, 128, 46, 14);
		panel.add(lblCargo);
		
		JLabel lblSalrio = new JLabel("Sal\u00E1rio:");
		lblSalrio.setBounds(10, 169, 46, 14);
		panel.add(lblSalrio);
		
		txtDocumento = new JTextField();
		txtDocumento.setBounds(84, 8, 164, 20);
		panel.add(txtDocumento);
		txtDocumento.setColumns(10);
		
		txtNome = new JTextField();
		txtNome.setBounds(84, 36, 164, 20);
		panel.add(txtNome);
		txtNome.setColumns(10);
		
		txtIdade = new JTextField();
		txtIdade.setBounds(84, 61, 77, 20);
		panel.add(txtIdade);
		txtIdade.setColumns(10);
		
		JLabel lblSexo = new JLabel("Sexo:");
		lblSexo.setBounds(10, 91, 46, 14);
		panel.add(lblSexo);
		
		
		cmbSexo.addItem(Sexo.MASCULINO);
		cmbSexo.addItem(Sexo.FEMININO);		
		cmbSexo.setBounds(84, 92, 91, 22);
		panel.add(cmbSexo);
		
		txtCargo = new JTextField();
		txtCargo.setBounds(84, 125, 111, 20);
		panel.add(txtCargo);
		txtCargo.setColumns(10);
		
		txtSalario = new JTextField();
		txtSalario.setBounds(84, 166, 111, 20);
		panel.add(txtSalario);
		txtSalario.setColumns(10);
		
		JButton btnIncluirFuncionario = new JButton("Incluir Funcion\u00E1rio");
		btnIncluirFuncionario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					
					//Obtendo o documento.					
					Documento documento;					
					String doc = txtDocumento.getText();
					
					if(doc.length() == 11) {
						documento = (Documento) new DocumentoCpf(doc);
					}
					else if (doc.length() == 14) {
						documento = (Documento) new DocumentoCnpj(doc);
					}
					else {						
                        throw new Exception("O documento informado não é CPF nem CNPJ");						
					}	
					
					//obtendo o nome
					String nome = txtNome.getText();
					
					//obtendo a idade.
					int idade = Integer.parseInt(txtIdade.getText());
										
					//obtendo o sexo.					
					Sexo sexo = (Sexo)cmbSexo.getSelectedItem();
					
					//obtendo o cargo.
					String cargo = txtCargo.getText();
					
					//obtendo o salario.
					double salario = Double.parseDouble(txtSalario.getText());
					
					//instanciando a classe Funcionario.
					Funcionario funcionario = new Funcionario(
							nome,idade, sexo, cargo, documento,salario						
							
							);				
					
					
					//adicionando o objeto funcionario no banco de dados.
					new FuncionariosDao().incluir(funcionario);
					
					
					
					//apresentando os dados.
					JOptionPane.showMessageDialog(CadastroFuncionarios.this, funcionario.mostrar());
					
					
					
					
				} catch (Exception e2) {
					
					JOptionPane.showMessageDialog(CadastroFuncionarios.this,
							              "Erro: " + e2.getMessage(),
					                      "Erro",
					                      JOptionPane.ERROR_MESSAGE							
							);					
					
				}
				
				
			}
		});
		btnIncluirFuncionario.setBounds(10, 208, 121, 23);
		panel.add(btnIncluirFuncionario);
		
		JButton btnNewButton = new JButton("Gerar Arquivo");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try {
					
					
					
					//Obtendo o documento.					
					Documento documento;					
					String doc = txtDocumento.getText();
					
					if(doc.length() == 11) {
						documento =  new DocumentoCpf(doc);
					}
					else if (doc.length() == 14) {
						documento =  new DocumentoCnpj(doc);
					}
					else {						
                        throw new Exception("O documento informado não é CPF nem CNPJ");						
					}	
					
					//obtendo o nome
					String nome = txtNome.getText();
					
					//obtendo a idade.
					int idade = Integer.parseInt(txtIdade.getText());
										
					//obtendo o sexo.					
					Sexo sexo = (Sexo)cmbSexo.getSelectedItem();
					
					//obtendo o cargo.
					String cargo = txtCargo.getText();
					
					//obtendo o salario.
					double salario = Double.parseDouble(txtSalario.getText());
					
					StringBuilder sb = new StringBuilder();
					
					sb.append(nome).append(";")
					.append(idade).append(";")
					.append(sexo).append(";")
					.append(doc).append(";")
					.append(cargo).append(";")
					.append(salario).append("\n");
					
					FileWriter writer =
							new FileWriter
					("C:\\Users\\21no0728\\Documents\\Curso_Java\\Arquivos\\funcionarios.csv", true);
					
					
					writer.write(sb.toString());
					writer.close();
					
					
					JOptionPane.showMessageDialog(CadastroFuncionarios.this,"Dados gerados com sucesso!");
					
					
					} catch (Exception e2) {
					
					JOptionPane.showMessageDialog(CadastroFuncionarios.this,
							              "Erro: " + e2.getMessage(),
					                      "Erro",
					                      JOptionPane.ERROR_MESSAGE							
							);					
					
				}
				
				
				
				
			}
		});
		btnNewButton.setBounds(155, 208, 112, 23);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Gerar Lista");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				try {
					
				
					FileReader reader =
							new FileReader
							("C:\\Users\\21no0728\\Documents\\Curso_Java\\Arquivos\\funcionarios.csv");
				
					
					BufferedReader buffer = new BufferedReader(reader);
					
					List<Funcionario> funcionarios = new ArrayList<>();
					
					
					while(true) {
						
						String linha = buffer.readLine();
						
						if(linha == null || linha.length() == 0) {
							break;
						}
						
						//cada linha do excel representa um objeto funcionario.
						
						String [] itens = linha.split(";");
						
						Funcionario f= new Funcionario(
								itens[0],
								Integer.parseInt(itens[1]),
								itens[2].equals("MASCULINO") ? Sexo.MASCULINO : Sexo.FEMININO,
										itens[3],
								itens[4].length() == 11 ? new DocumentoCpf(itens[4]) : 
														  new DocumentoCnpj(itens[4]),
								
								Double.parseDouble(itens[5]));
						
						
								funcionarios.add(f);
						
					}
						
						//for na lista de funcionarios
						
						//adicionar cada funcionario no combobox.
								cmbFuncionario.removeAllItems();
								for(Funcionario funcionario : funcionarios) {
									cmbFuncionario.addItem(funcionario);
								}
						
						
				} catch (Exception e2) {
					
					JOptionPane.showMessageDialog(CadastroFuncionarios.this,
							              "Erro: " + e2.getMessage(),
					                      "Erro",
					                      JOptionPane.ERROR_MESSAGE				);					
					
				
				
				
				
				
				}}
		});
				
			
		btnNewButton_1.setBounds(297, 208, 91, 23);
		panel.add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("Funcionarios Cadastrados");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(0, 253, 195, 14);
		panel.add(lblNewLabel);
		
		
		cmbFuncionario.setBounds(20, 288, 147, 22);
		contentPane.add(cmbFuncionario);
	}
}