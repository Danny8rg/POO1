import javax.swing.JOptionPane;

public class Campo {
	
	int ancho, largo, area;
	
	public void PedirNumeros () {
		
		ancho = Integer.parseInt(JOptionPane.showInputDialog("inserte el ancho de el campo"));
		largo = Integer.parseInt(JOptionPane.showInputDialog("inserte el largo del campo"));
	}
	
	public void GuardarDatos(int ancho, int largo) {
		this.ancho = ancho;
		this.largo = largo;
		area = ancho * largo;
	}

	
}
