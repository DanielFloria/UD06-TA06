import javax.swing.JOptionPane;

public class Ej1 {

	public static void main(String[] args) {
		String eleccion = JOptionPane.showInputDialog("Escribir el número de la figura de la que se quiere calcular el área:\n1)Círculo\n2)Triángulo\n3)Cuadrado");
		switch(eleccion) {
		case "1":
			JOptionPane.showMessageDialog(null, area_circulo());
			break;
		case "2":
			JOptionPane.showMessageDialog(null, area_triangulo());
			break;
		case "3":
			JOptionPane.showMessageDialog(null, area_cuadrado());
			break;
		default:
			System.out.println("No es un número de figura válido");
			break;
		}

	}
	 
	public static double area_circulo() {
		String radio = JOptionPane.showInputDialog("Escribir el radio del círculo:");
		double area = Math.PI * Math.pow(Double.parseDouble(radio), 2);
		return area;
		
	}
	
	public static double area_triangulo() {
		String base = JOptionPane.showInputDialog("Escribir la base del triángulo:");
		String altura = JOptionPane.showInputDialog("Escribir la altura del triángulo:");
		double area = (Double.parseDouble(base) * Double.parseDouble(altura)) / 2;
		return area;
	}
	
	public static double area_cuadrado() {
		String lado = JOptionPane.showInputDialog("Escribir el lado del cuadrado:");
		double area = Math.pow(Double.parseDouble(lado), 2);
		return area;
	}

}
