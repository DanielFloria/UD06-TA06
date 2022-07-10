import java.util.Arrays;
import java.util.Scanner;

public class Ej10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tamano, min, max;
		int[] array_final;
		
		System.out.println("Escribir el tamaño del array:");
		tamano = sc.nextInt();
		sc.nextLine();
		System.out.println("Escribir valor mínimo:");
		min = sc.nextInt();
		if(min < 2) min = 2;
		sc.nextLine();
		System.out.println("Escribir valor máximo:");
		max = sc.nextInt();
		sc.close();
		
		array_final = new int[tamano];
	
		obtener_primos_en_rango(min, max, array_final);
		mostrar_valor_mayor(array_final);
	}
	
	public static void obtener_primos_en_rango(int min, int max, int[] array_final) {
		boolean[] criba = new boolean[max + 1];
		int cantidad_primos = 0;
		int[] primos_disponibles_en_rango;
		
		// Rellena array donde se realizará la criba
		for(int i = 0; i < criba.length; i++)
			criba[i] = true;
		
		// Marca como false las posiciones correspondientes a los números que són múltiplos de otro a partir de 2
		for(int i = 2; i < max; i++) { 
			for(int j = 2; i * j <= max; j++) {
				criba[i * j] = false;
			}
		}
		
		// Cuenta la cantidad de números primos dentro del rango solicitado
		for(int i = min; i <= max; i++) {
			if(criba[i] == true) cantidad_primos++;
		}
		
		// Añade cada número primo dentro del rango a un nuevo array
		primos_disponibles_en_rango = new int[cantidad_primos];
		
		for(int i = min, j = 0; i <= max; i++) {
			if(criba[i] == true) {
				primos_disponibles_en_rango[j] = i;
				j++;
			}
		}
		
		// Pasa números primos aleatorios al array final
		for(int i = 0; i < array_final.length; i++) {
			array_final[i] = primos_disponibles_en_rango[(int)(Math.random() * (primos_disponibles_en_rango.length))];
		}		
		
		// Muestra valores de los arrays usados
		System.out.println("Array para realizar la criba:\n" + Arrays.toString(criba));
		System.out.println("Array donde pasar cada número primo dentro del rango:\n" + Arrays.toString(primos_disponibles_en_rango));
		System.out.println("Array con la cantidad requerida de números primos aleatorios:\n" + Arrays.toString(array_final));
	}
	
	// Ordena valores del array para encontrar el valor mayor
	public static void mostrar_valor_mayor(int[] array_final) {
		Arrays.sort(array_final);
		System.out.println("El valor mayor del array final es " + array_final[array_final.length - 1]);
	}
}
