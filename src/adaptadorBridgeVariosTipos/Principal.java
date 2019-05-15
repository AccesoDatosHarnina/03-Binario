package adaptadorBridgeVariosTipos;

public class Principal {
	public static void main(String[] args) {
		Cliente cliente=new Cliente(1, "javierito", true, 12.5f);
		Adaptador2 adaptador=new Adaptador2();
		String path = "./cliente.cli";
		
		adaptador.grabar(path, cliente,new AdecuadorCliente());
		Articulo art=new Articulo(3,"brocha");
		adaptador.grabar("./aric.art", art, new AdecuadorArticulo());
	}
}
