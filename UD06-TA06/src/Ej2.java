import java.util.Scanner;

public class Ej2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe cu�ntos n�meros generar:");
		int cantidad = sc.nextInt();
		System.out.println("Escribe el n�mero m�nimo del rango:");
		int min = sc.nextInt();
		System.out.println("Escribe el n�mero m�ximo del rango:");
		int max = sc.nextInt();
		sc.close();

		for(int i = 0; i < cantidad; i++) {
			System.out.println(generar_numero(min, max));
		}
	}
	
	/**
	 * Math.random da un valor entre 0.00 y 1; 
	 * si diera 0.00 devolver�a el valor m�nimo, 
	 * y si diera 1 devolver�a el valor m�ximo. 
	 *
	 */
	public static int generar_numero(int min, int max) {		
		return (int)((Math.random() * (max - min)) + min);
	}

}
