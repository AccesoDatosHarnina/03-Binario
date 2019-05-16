package AdaptadorAsecas01;

public class Principal {
	public static void main(String[] args) {
		Cliente cliente=new Cliente(1, "javierito", true, 12.5f);
		Adaptador adaptador=new Adaptador();
		String path = "./cliente.cli";
		adaptador.grabar(path, cliente);
	}
}
