import java.util.Scanner;

public class Ej8 {

	public static void main(String[] args) {
		int[] array = new int[10];
		rellenar_array(array);
		mostrar_array(array);

	}

	public static void rellenar_array(int[] array) {
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < array.length; i++) {
			System.out.println("Escribe el número para esta posición:");
			int numero = sc.nextInt();			
			array[i] = numero;	
		}
		sc.close();
	}
	
	public static void mostrar_array(int[] array) {
		for(int i = 0; i < array.length; i++) {
			System.out.println("Posición: " + i + ", valor: "  + array[i]);
		}
	}
}
