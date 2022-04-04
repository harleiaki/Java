package br.com.impacta.aplicação;

import javax.swing.JOptionPane;

import br.com.impacta.classes.Automovel;

public class AppAutomovel01 {
	public static void main(String[] args) {

		// declarando variavel

		// tipo nome
		Automovel auto = new Automovel();
		auto.lerDados("Honda", "Civic", 2020, "EBB1234");
		
		//auto.setAno(1959);
		
		
		
		//double resultado = somar(4, 2);
		String texto = auto.mostrar();
		//System.out.println(texto);
		System.out.println(texto);
		
		//Automovel.paisOrigem = "Argentina";
		JOptionPane.showMessageDialog(null,auto.mostrar());
		
		
		//Automovel.PAIS_ORIGEM = "Colombia";
		JOptionPane.showMessageDialog(null,auto.mostrar());
		
		//JOptionPane.showMessageDialog(null, texto);
		//JOptionPane.showMessageDialog(null, texto,"Relatório", JOptionPane.ERROR_MESSAGE);
		
		//int n = Integer.parseInt(JOptionPane.showInputDialog("Informe um numero:"));

		
		//TIPO PRIMITIVO NAO PODE RECEBER NULLO.
		// int j = (Integer) null;
		
		//APENAS CLASSE PODE SER NULLO.		
		Integer j = null;		
		
		
	}
}