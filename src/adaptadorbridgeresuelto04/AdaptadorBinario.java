package adaptadorbridgeresuelto04;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class AdaptadorBinario implements IAdaptador{



	public boolean grabar(String path, Object objeto, Adecuador adecuador) {
		assert path != null && objeto != null;
		File file = new File(path);
		boolean retorno = false;
		FileOutputStream flujoW = null;
		try {
			flujoW = new FileOutputStream(file);
			retorno = adecuador.graba(flujoW, objeto);
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			flujoW.close();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		return retorno;
	}

	@Override
	public ArrayList leer(String path, Adecuador adecuador) {
		// TODO Auto-generated method stub
		return null;
	}

}
