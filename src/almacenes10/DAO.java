package almacenes10;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class DAO implements IDAO {

	// Observad que esto funciona para almacenar un único elemento en un fichero

	private FileInputStream abrir(String path) {
		File file = new File(path);
		assert file.exists();
		FileInputStream flujoR = null;
		try {
			flujoR = new FileInputStream(path);
		} catch (FileNotFoundException e) {
		}
		return flujoR;
	}

	@Override
	public Object leer(String path) {
		Object t = null;
		FileInputStream flujoR = abrir(path);
		// Si todos los fallos se pueden tratar aqui el que usa esto
		// lo tiene muy limpio
		if (flujoR != null) {
			try {
				ObjectInputStream adaptador = new ObjectInputStream(flujoR);
				t = (Object) adaptador.readObject();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				flujoR.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return t;
	}

	// No pueden ser exactamente iguales como lo hago?
	// La razón es que las sobrecargas en Java sólo está permitido para los métodos
	// con diferentes firmas.
	// El tipo de retorno no es parte de la firma de método, por lo tanto no puede
	// ser utilizado para distinguir las sobrecargas.
	// La firma es el nombre del metodo mas el tipo de sus parametros
	// Por lo tanto lo unico que puedo hacer es cambiar el nombre o el parametro
	private FileOutputStream abrir(String path, boolean adicion) {
		FileOutputStream flujoW = null;
		File file = new File(path);
		try {
			flujoW = new FileOutputStream(file, adicion);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return flujoW;
	}
	// Y esto funcionaría?
	// private void abrir(FileInputStream fichero);
	// private void abrir(FileOutputStream fichero);

	@Override
	public boolean grabar(String path, Object object) {
		assert path != null && object != null;
		File file = new File(path);
		boolean retorno = true;
		FileOutputStream flujoW = abrir(path, false);
		try {
			ObjectOutputStream adaptador = null;
			adaptador = new ObjectOutputStream(flujoW);
			adaptador.writeObject(object);
		} catch (IOException e) {
			e.printStackTrace();
			retorno = false;
		}
		try {
			flujoW.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			retorno = false;
		}
		return retorno;
	}

}
