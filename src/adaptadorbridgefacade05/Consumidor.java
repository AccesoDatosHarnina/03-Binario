package adaptadorbridgefacade05;

import adaptadorbridgeresuelto04.Articulo;

public class Consumidor {
	public static void main(String[] args) {
		Cliente cliente=new Cliente(1, "javierito", true, 12.5f);
		Fachada fachada=new Fachada();
		fachada.graba(cliente);
		Articulo art=new Articulo(3,"brocha");
		fachada.graba(art);
		
	}
}
