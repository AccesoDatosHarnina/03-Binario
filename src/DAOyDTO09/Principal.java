package DAOyDTO09;

public class Principal {

	public static void main(String[] args) {
		Cliente cliente = new Cliente(1, "jose", true, 123.45f);
		DTO<Cliente> dtoCliente = new DTO<>("clientes.dat");
		dtoCliente.grabar(cliente);
		Cliente otro = dtoCliente.leer();
		System.out.println(otro);
	}

}
