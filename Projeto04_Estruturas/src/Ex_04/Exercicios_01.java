package Ex_04;

public class Exercicios_01 {
	public static void main(String[] args) {
		for(int i=2; i<=500; i++) {
			if(Primo(i))
				System.out.println("Primo:"+i);
		}
	}
	public static boolean Primo(int numero) {
		for(int j=2; j<numero; j++) {
			if(numero % j == 0)
		return false;
	}
	return true;
}
}
