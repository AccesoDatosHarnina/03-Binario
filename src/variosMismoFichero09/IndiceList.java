package variosMismoFichero09;

import java.util.List;

public class IndiceList<K> implements Indice<K> {
	private List<K> indice;

	public IndiceList(List<K> indice) {
		super();
		this.indice = indice;
	}

	@Override
	public int obtener(K k) {
		return indice.indexOf(k);
	}

	@Override
	public boolean establecer(K k) {
		return indice.add(k);
	}

	public List<K> getLista() {
		return indice;
	}

	public void borrar(K k) {
		// TODO Auto-generated method stub
		
	}

}
