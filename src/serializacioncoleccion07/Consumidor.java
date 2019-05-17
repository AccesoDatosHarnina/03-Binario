package serializacioncoleccion07;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Consumidor {

	public static void main(String[] args) {
		ArrayList<Cliente> clientes = null;
		ObjectInputStream deserilizador = null;
		try {
			deserilizador=new ObjectInputStream(new FileInputStream("cliente.dat"));
			clientes=(ArrayList<Cliente>) deserilizador.readObject();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			deserilizador.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(clientes);
	}

}
