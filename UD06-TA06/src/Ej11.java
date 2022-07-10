import java.util.Arrays;
import java.util.Scanner;

public class Ej11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tamano, min, max;
		int[] array1, array2;
		
		System.out.println("Escribir el tamaño del array:");
		tamano = sc.nextInt();
		sc.nextLine();
		System.out.println("Escribir valor mínimo:");
		min = sc.nextInt();
		sc.nextLine();
		System.out.println("Escribir valor máximo:");
		max = sc.nextInt();
		sc.close();
		
		array1 = new int[tamano];
		rellenar_array_aleatoriamente(array1, min, max);
		
		array2 = new int[tamano];	
		array2 = Arrays.copyOf(array1, array1.length);
		rellenar_array_aleatoriamente(array2, min, max);
		
		
		System.out.println("Array 1:\n" + Arrays.toString(array1));
		System.out.println("Array 2:\n" + Arrays.toString(array2));
		System.out.println("Array final:\n" + Arrays.toString(calcular_array_final(array1, array2)));			
	}

	public static void rellenar_array_aleatoriamente(int[] array, int min, int max) {
		for(int i = 0; i < array.length; i++)
			array[i] = (int)(Math.random() * (max - min)) + min;
	}
	
	public static int[] calcular_array_final(int[] array1, int[] array2) {
		int[] array_final = new int[array1.length];
		
		for(int i = 0; i < array_final.length; i++) 
			array_final[i] = array1[i] * array2[i];
		
		return array_final;
	}
}
