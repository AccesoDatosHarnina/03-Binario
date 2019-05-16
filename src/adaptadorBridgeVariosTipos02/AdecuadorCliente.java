package adaptadorBridgeVariosTipos02;

import java.io.DataOutputStream;
import java.io.IOException;

public class AdecuadorCliente implements Adecuador {

	@Override
	public boolean graba(DataOutputStream conversorW, Object objeto) {
		boolean retorno = true;
		Cliente cliente = (Cliente) objeto;
		try {
			conversorW.writeInt(cliente.getNumero());
			conversorW.writeUTF(cliente.getNombre());
			conversorW.writeBoolean(cliente.isPreferente());
			conversorW.writeFloat(cliente.getSaldo());
		} catch (IOException e) {
			retorno = false;
		}
		return retorno;
	}

}
