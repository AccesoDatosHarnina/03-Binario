package adaptadorbridgefacade05;

import java.io.Closeable;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class AdecuadorArticulo implements Adecuador {

	private void insertaCampo(String objeto, FileWriter flujoW, boolean last) throws IOException {
		flujoW.write(objeto);
		if (!last) {
			flujoW.write(":");
		} else {
			flujoW.write("\n");
		}
	}

	@Override
	public boolean graba(Closeable flujoW, Object objeto) {
		boolean retorno=false;
		FileWriter flujoMio=(FileWriter)flujoW;
		Articulo articulo=(Articulo)objeto;
		try {
			insertaCampo(String.valueOf(articulo.getNumeroID()), flujoMio,false);
			insertaCampo(String.valueOf(articulo.getNombre()), flujoMio,false);
			retorno = true;
		} catch (IOException e) {
		}
		return retorno;
	}

	@Override
	public void recupera(Closeable flujoR, ArrayList lista) {
		// TODO Auto-generated method stub
		
	}

	
	}

