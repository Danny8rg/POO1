

public class procesos {
	Campo Campos[] =  new Campo[1];
	public void inicio() {
		
		Campo Cancha = new Campo();
		Cancha.PedirNumeros();
		Cancha.GuardarDatos(0,0,0);
		Campos[0] = Cancha;
		
		
	}
	
	public void imprimir() {
		
		System.out.println(Campos[0]);
		
	}
	
}
