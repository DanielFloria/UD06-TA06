import javax.swing.JOptionPane;

public class Ej7 {

	public static void main(String[] args) {
		String euros_string = JOptionPane.showInputDialog("Escribe la cantidad en euros:");
		String moneda = JOptionPane.showInputDialog("Elige el número correspondiente a la moneda a la que quieras convertir los euros:\n"
				+ "1)Libras\n2)Dólares\n3)Yenes");
		convertir_euros(euros_string, moneda);
	}

	public static void convertir_euros(String euros_string, String moneda) {
		double euros = Double.parseDouble(euros_string);
		double libra = 0.86;
		double dolar = 1.28611;
		double yen = 129.852;
		
		switch(moneda) {
		case "1":
			JOptionPane.showMessageDialog(null, euros * libra);
			break;
		case "2":
			JOptionPane.showMessageDialog(null, euros * dolar);
			break;
		case "3":
			JOptionPane.showMessageDialog(null, euros * yen);
			break;
		default:
			JOptionPane.showMessageDialog(null, "No se ha elegido una opción válida");
			break;
		}
	}
}
