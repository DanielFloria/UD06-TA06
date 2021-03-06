import java.util.Arrays;

import javax.swing.JOptionPane;

public class Ej12 {

	public static void main(String[] args) {
		int tamano;
		int min = 1;
		int max = 300;
		int digito;
		int[] array1;
		String array2;
		
		tamano = Integer.parseInt(JOptionPane.showInputDialog("Escribir el tama?o del array:"));
		
		array1 = new int[tamano];
		rellenar_array_aleatoriamente(array1, min, max);
		digito = validar_digito();
		array2 = encontrar_numeros_acabados_en_digito(digito, array1);
		
		
		System.out.println("El d?gito elegido es " + digito);
		System.out.println("La primera array es:\n" + Arrays.toString(array1));
		System.out.println("La array final es:\n" + array2);
	}
	
	public static void rellenar_array_aleatoriamente(int[] array, int min, int max) {
		for(int i = 0; i < array.length; i++)
			array[i] = (int)(Math.random() * (max - min)) + min;
	}
	
	// Valida que el input se pueda convertir a Integer. Si se pasa m?s de un d?gito coge el ?ltimo.
	public static int validar_digito() {
		int digito = -1;
		String digito_raw;

		while(digito == -1) {
			digito_raw = JOptionPane.showInputDialog("Escribir un d?gito entre 0 y 9:");
			digito_raw = digito_raw.substring(digito_raw.length() - 1); 
			try {
				digito = Integer.valueOf(digito_raw);
			} catch(NumberFormatException e) {
				System.out.println("No es un d?gito v?lido.");
			}
		}

		return digito;
	}
	
	
	public static String encontrar_numeros_acabados_en_digito(int digito, int[] array1) {
		int[] temporal = new int[array1.length];
		int tamano_array2 = 0;
		
		for(int i = 0; i < array1.length; i++) {
			int ultimo_digito_de_elemento_array1 = array1[i] % 10; // El m?dulo de un entero entre diez resulta en el ?ltimo d?gito de un entero
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
