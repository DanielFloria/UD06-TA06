/**
 * Da errores debido a múltiples scanner
 */

import java.util.Arrays;
import java.util.Scanner;

public class Ej12 {

	public static void main(String[] args) {
		int tamano = 0;
		int min = 1;
		int max = 300;
		int digito;
		int[] array1;
		String array2;
		
		pedir_tamano_de_array(tamano);
		
		array1 = new int[tamano];
		rellenar_array_aleatoriamente(array1, min, max);
		digito = validar_digito();
		array2 = encontrar_numeros_acabados_en_digito(digito, array1);
		
		
		System.out.println("El dígito elegido es " + digito);
		System.out.println("La primera array es:\n" + Arrays.toString(array1));
		System.out.println("La array final es:\n" + array2);
	}

	public static void pedir_tamano_de_array(int tamano) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribir el tamaño del array:");
		tamano = sc.nextInt();
		sc.close();
	}
	
	public static void rellenar_array_aleatoriamente(int[] array, int min, int max) {
		for(int i = 0; i < array.length; i++)
			array[i] = (int)(Math.random() * (max - min)) + min;
	}
	
	//Valida que el input se pueda convertir a Integer. Si se pasa más de un dígito coge el último.
	public static int validar_digito() {
		Scanner sc = new Scanner(System.in);
		int digito = -1;
		String digito_raw;

		while(digito == -1) {
			System.out.println("Escribir un dígito entre 0 y 9:");
			digito_raw = sc.nextLine();
			try {
				digito = Integer.valueOf(digito_raw.charAt(digito_raw.length() - 1));
			} catch(NumberFormatException e) {
				System.out.println("No es un dígito válido.");
			}
		}

		sc.close();

		return digito;
	}
	
	
	public static String encontrar_numeros_acabados_en_digito(int digito, int[] array1) {
		int[] temporal = new int[array1.length];
		int tamano_array2 = 0;
		
		for(int i = 0; i < array1.length; i++) {
			int ultimo_digito_de_elemento_array1 = array1[i] % 10; // El módulo de un entero entre diez resulta en el último dígito de un entero
			if(ultimo_digito_de_elemento_array1 == digito) {  // Se copian los valores deseados en la array temporal y el resto se convierten en 0
				temporal[i] = array1[i];
				tamano_array2++;
			} else {
				temporal[i] = 0;
			}
		}
		
		int[] array2 = new int[tamano_array2];
		for(int i = 0, j = 0; i < temporal.length; i++) { // Se pasan los valores de la array temporal a la array definitiva
			if(temporal[i] != 0) {
				array2[j] = temporal[i];
				j++;
			}
		}
		
		return Arrays.toString(array2);
	}
}
