package br.com.impacta.aplicacao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class AppConsultaFuncionarios {
	public static void main(String[] args) {
		
		try {
			
			String conexao = 
					"jdbc:mysql://localhost:3306/db_cadastro?autoSSL=false";
			
			Class.forName
					("com.mysql.jdbc.Driver");
			
			Connection cn = 
					(Connection)DriverManager.getConnection(conexao,"root", "Imp@ct@");
			
			String sql = "SELECT * FROM TBFUNCIONARIOS";
			
			PreparedStatement stmt = cn.prepareStatement(sql);
			
			stmt.executeQuery();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
