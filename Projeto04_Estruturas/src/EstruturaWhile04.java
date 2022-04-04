import javax.swing.JOptionPane;

public class EstruturaWhile04 {
	public static void main(String[] args) {

		/*
		 * Nesse programa, o usuario fornece uma certa quantidade de numeros. a entrada
		 * de dados termina quando o ususario digitar o numero 0.
		 * 
		 * Cada numero informado é mostrado natela
		 * 
		 * Se o usuario digitar um numero negativo, este é ignorado.
		 * 
		 * 
		 * No final, o programa deve mostrar a soma e a quantidade de numeros
		 * informados.
		 * 
		 **/

		int quantidade = 0;
		int soma = 0;

		while (true) {

			int numero = Integer.parseInt(JOptionPane.showInputDialog("Informe um numero:"));

			if (numero == 0) {
				break; /*
						 * //interrompe a estrutura de repetição;
						 * 
						 */

			}
			if (numero < 0) {
				continue; // continuar para prox instrução.
			}

			soma += numero;
			quantidade++;

		}

		System.out.println("Soma dos numeros informados:" + soma);
		System.out.println("Quantidade de numeros informados:" + quantidade);
	}

}

        // Return sai do metodo
        // break interrompe a estrutura de repetição
        // 