import javax.swing.JOptionPane;

public class Principal {
static double  largo; 
static double ancho;
static double area;
	public static void main(String[] args) {
		
		pedirDatos();
		Calcular();
		imprimir();

	}
	
	public static void pedirDatos() {
		
		largo = Double.parseDouble(JOptionPane.showInputDialog("inserte el largo de la cancha"));
		ancho = Double.parseDouble(JOptionPane.showInputDialog("inserte el ancho de la cancha"));
		
	}
	
	public static void Calcular() {
		
		area = ancho * largo;
		
	}
	
	public static void imprimir () {
		
		System.out.println("el area total de la cancha es de " + area + " metros cuadrados");
		
	}

}
