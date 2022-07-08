import java.util.Scanner;

public class Ej9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe el tamaño deseado del array:");
		int tamano = sc.nextInt();
		int[] array = new int[tamano];
		
		int min = 0;
		int max = 9;
		
		sc.close();
		
		rellenar_array(array, min, max);
		mostrar_array_y_suma(array);

	}
	
	public static void rellenar_array(int[] array, int min, int max) {
		for(int i = 0; i < array.length; i++) {
			array[i] = (int)(Math.random() * (max - min)) + min;
		}
	}

	public static void mostrar_array_y_suma(int[] array) {
		int suma = 0;
		for(int i = 0; i < array.length; i++) {
			System.out.println("Posición: " + i + ", valor: "  + array[i]);
			suma += array[i];
		}
		System.out.println("\nLa suma total de los valores del array es " + suma);
	}
}
