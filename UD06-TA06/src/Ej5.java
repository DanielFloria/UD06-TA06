import java.util.Scanner;

public class Ej5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe un número en base decimal");
		int decimal = sc.nextInt();
		sc.close();
		System.out.println(decimal_a_binario(decimal));
	}
	
	/**
	 * Se asigna a un String el resto de la division del decimal entre 2 hasta que no se puede dividir más
	 * y se revierte el orden del String para dar el binario resultante
	 */
	public static String decimal_a_binario(int decimal) {
		String binario = "";
		String binario_reverso = "";
		while(decimal > 0) {
			int resto = decimal % 2;
			binario_reverso += resto;
			decimal = (decimal - resto) / 2;
		}
		
		for(int i = binario_reverso.length() - 1; i >= 0; i--) {
			binario += binario_reverso.charAt(i);
		}
				
		return binario;
	}

}
