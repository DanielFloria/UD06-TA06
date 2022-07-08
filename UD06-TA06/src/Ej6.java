import javax.swing.JOptionPane;

public class Ej6 {

	public static void main(String[] args) {
		String numero = JOptionPane.showInputDialog("Escribe un número:");
		JOptionPane.showMessageDialog(null, numero + " tiene " + cifras(numero) + " cifras.");
	}

	public static int cifras(String numero) {
		return numero.length();
	}
}
