package br.com.impacta.aplicacao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;


public class AppCadastroFuncionario {
	
	public static void main(String[] args) {
	
		try {
			
			String conexao = 
					"jdbc:mysql://localhost:3306/db_cadastro?autoSSL=false ";
			
			Class.forName
					("com.mysql.jdbc.Driver ");
			
			Connection cn = 
					(Connection)DriverManager.getConnection(conexao,"root", "Imp@ct@");
			
			
			//incluindo um novo funcionário
			String sql = "INSERT INTO TBFUNCIONARIOS(DOCUMENTO, NOME, IDADE," + 
							"SEXO, CARGO, SALARIO) VALUES (?,?,?,?,?,?)";
			
			
			String documento = 
					JOptionPane.showInputDialog("Informe os documentos: ");
			String nome = 
					JOptionPane.showInputDialog("Informe o nome: ");
			int idade = Integer.parseInt(
					JOptionPane.showInputDialog("Informe a idade: "));
			String sexo = 
					JOptionPane.showInputDialog("Informe o sexo (M ou F): ");
			String cargo = 
					JOptionPane.showInputDialog("Informe o cargo: ");
			double salario = Double.parseDouble(
					JOptionPane.showInputDialog("Informe o salário: "));
			
			
			PreparedStatement stmt = cn.prepareStatement(sql);
			stmt.setString(1,documento);
			stmt.setString(2,nome);
			stmt.setInt	  (3,idade);
			stmt.setString(4,sexo);
			stmt.setString(5,cargo);
			stmt.setDouble(6,salario);
			
			stmt.executeUpdate();
					JOptionPane.showMessageDialog(null, "Funcionário incluído com sucesso! ");
	
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}
}
