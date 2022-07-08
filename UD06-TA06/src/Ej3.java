import java.util.Scanner;

public class Ej3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero = sc.nextInt();
		sc.close();
		
		if(es_numero_primo(numero) == true) System.out.println("Es un numero primo");
		else System.out.println("No es un numero primo");
	}
	
	
	public static boolean es_numero_primo(int numero) {
		for(int i = 2; i < numero; i++) {
			if(numero % i == 0) return false;
		}
		return true;
	}
}
