package variosMismoFichero;

import java.util.List;

public class DTOList<K, T> implements DTO<K, T> {

	// Un dao para los datos
	private DAO<T> datos;
	// un dao para el indice
	private DAO<List<K>> indiceDAO;
	// las rutas
	private String pathDatos;
	private String pathIndice;
	// El indice de trabajo
	private IndiceList<K> indice;

	public DTOList(String pathDatos, String pathIndice, List<K> lista) {
		super();
		assert pathDatos != null && pathIndice != null && lista != null && lista.isEmpty();
		this.pathDatos = pathDatos;
		this.pathIndice = pathIndice;
		datos = new DAO<T>();
		indiceDAO = new DAO<List<K>>();
		// Primero intento obtener la lista del archivo
		List<K> leer = indiceDAO.leer(pathIndice);
		if (leer == null) {
			leer = lista;
			// grabo el nuevo indice
			indiceDAO.grabar(pathIndice, leer);
		}
		// O tenemos una lista que representa lo almacenado o una lista nueva
		indice = new IndiceList<K>(leer);
	}

	@Override
	public boolean grabar(T t, K k) {
		boolean retorno = false;
		if (datos.grabar(pathDatos, t, true)) {
			indice.establecer(k);
			if (indiceDAO.grabar(pathIndice, indice.getLista())) {
				retorno = true;
			} 
		}
		return retorno;
	}

	@Override
	public T leer(K k) {
		int obtener = indice.obtener(k);
		T leer = datos.leer(pathDatos, obtener);
		return leer;
	}

}
