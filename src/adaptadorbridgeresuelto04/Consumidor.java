package adaptadorbridgeresuelto04;

import adaptadorbridgeresuelto04.Articulo;

public class Consumidor {
	public static void main(String[] args) {
		Cliente cliente=new Cliente(1, "javierito", true, 12.5f);
		AdaptadorBinario adaptadorBinario=new AdaptadorBinario();
		String path = "./cliente.cli";		
		adaptadorBinario.grabar(path, cliente,new AdecuadorCliente());
		
		Articulo art=new Articulo(3,"brocha");
		AdaptadorText adaptadorTexto=new AdaptadorText();
		adaptadorTexto.grabar("./aric.art", art, new AdecuadorArticulo());
	}
}
