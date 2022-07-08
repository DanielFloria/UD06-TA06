import java.util.Scanner;

public class Ej2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe cuántos números generar:");
		int cantidad = sc.nextInt();
		System.out.println("Escribe el número mínimo del rango:");
		int min = sc.nextInt();
		System.out.println("Escribe el número máximo del rango:");
		int max = sc.nextInt();
		sc.close();

		for(int i = 0; i < cantidad; i++) {
			System.out.println(generar_numero(min, max));
		}
	}
	
	/**
	 * Math.random da un valor entre 0.00 y 1; 
	 * si diera 0.00 devolvería el valor mínimo, 
	 * y si diera 1 devolvería el valor máximo. 
	 *
	 */
	public static int generar_numero(int min, int max) {		
		return (int)((Math.random() * (max - min)) + min);
	}

}
