package br.com.impacta.aplicacao;

import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;




public class AppCadastroFuncionario {
	
	public static void main(String[] args) {
	
		try {
			
			String conexao = 
					"jdbc:mysql://localhost:3306/db_cadastro?autoSSL=false";
			
			Class.forName
					("com.mysql.jdbc.Driver");
			
			Connection cn = 
					(Connection)DriverManager.getConnection(conexao,"root", "Imp@ct@");
			
			JOptionPane.showMessageDialog(null, "Conexão Ok");
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
	}

}
