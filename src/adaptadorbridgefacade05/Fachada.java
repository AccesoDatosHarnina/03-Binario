package adaptadorbridgefacade05;

import adaptadorbridgeresuelto04.Articulo;

public class Fachada {

	public void graba(Cliente cliente) {
		IAdaptador adaptadorBinario=new AdaptadorBinario();
		String path = "./cliente.cli";		
		adaptadorBinario.grabar(path, cliente,new AdecuadorCliente());
	}

	public void graba(Articulo art) {
		IAdaptador adaptadorTexto=new AdaptadorText();
		adaptadorTexto.grabar("./aric.art", art, new AdecuadorArticulo());
	}

}
