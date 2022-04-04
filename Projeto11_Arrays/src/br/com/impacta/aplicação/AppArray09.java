package br.com.impacta.aplicação;

public class AppArray09 {
	public static void main(String[] args) {
		
		int[][] numPessoas = new int[3][4];
		
		//O JAVA NÃO CONSIDERA MATRIZ
		
		numPessoas[0][0] = 3;
		numPessoas[0][1] = 5;
		numPessoas[0][2] = 9;
		numPessoas[0][3] = 7;
		
		numPessoas[1][0] = 4;
		numPessoas[1][1] = 6;
		numPessoas[1][2] = 1;
		numPessoas[1][3] = 8;
		
		numPessoas[2][0] = 11;
		numPessoas[2][1] = 25;
		numPessoas[2][2] = 16;
		numPessoas[2][3] = 47;
		
		for(int i =0; i<numPessoas.length; i++) {
			
			for (int j = 0; j < numPessoas[i].length; j++) {
				System.out.print(numPessoas[i][j] + "\t");
			}
			
			System.out.println();
		}
	
	}

}
