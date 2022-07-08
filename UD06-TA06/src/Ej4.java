import java.util.Scanner;

public class Ej4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero;
		
		System.out.println("Escribe un número entero:");
		numero = sc.nextInt();
		System.out.println(calcular_factorial(numero));

		sc.close();
	}
	
	/**
	 * Va apilando los resultados en el stack hasta llegar al caso base,
	 * que sería cuando el valor de numero == 0, 
	 * realiza el producto de los resultados que va sacando del stack y devuelve el resultado total
	 */
	public static int calcular_factorial(int numero) {
		if(numero == 0) return 1; 
		else return numero * calcular_factorial(numero - 1);
	}

}
