package adaptador;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Adaptador implements IAdaptador<Cliente> {

	@Override
	public Cliente leer(String path) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean grabar(String path, Cliente objeto) {
		assert path != null && objeto != null;
		File file = new File(path);
		boolean retorno = false;
		FileOutputStream flujoW = null;
		try {
			flujoW = new FileOutputStream(file);
			DataOutputStream conversorW = new DataOutputStream(flujoW);
			conversorW.writeInt(objeto.getNumero());
			conversorW.writeUTF(objeto.getNombre());
			conversorW.writeBoolean(objeto.isPreferente());
			conversorW.writeFloat(objeto.getSaldo());
			retorno = true;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			try {
				flujoW.close();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}
		return retorno;
	}

}
