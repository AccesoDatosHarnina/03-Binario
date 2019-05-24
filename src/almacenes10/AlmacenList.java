package almacenes10;

import java.util.ArrayList;

//Para buscar por posicion dentro de la lista uso Integer
public class AlmacenList<T, Integer> implements IAlmacenInList<T, Integer> {

	private DAO dao = new DAO();
	private String path;
	private ArrayList<T> lista;

	public AlmacenList(String path) {
		super();
		assert path != null && !path.isEmpty();
		// El path es a la lista
		this.path = path;
		// Y esa lista puede estar almacenada
		lista = (ArrayList) dao.leer(path);
		// O existe
		// O no existe
		// y tengo que hacer programacion defensiva
		if (lista == null) {
			lista = new ArrayList<>();
			assert dao.grabar(path, lista);

		}
	}

	@Override
	public T obtener(Integer indice) {
		return this.lista.get((int) indice);
	}

	@Override
	public boolean grabar(T t) {
		assert t != null;
		// grabar en la lista
		// Suponemos que funciona porque no se nos ocurre ningun fallo (por ahora)
		boolean add = this.lista.add(t);
		boolean retorno = true;
		if (!dao.grabar(path, this.lista)) {
			this.lista.remove(t);
			retorno = false;
		}
		return retorno;
	}

	@Override
	public boolean borrar(Integer indice) {
		assert indice != null && (int) indice > 0;
		T remove = this.lista.remove((int) indice);
		boolean retorno = false;
		if (remove != null) {
			retorno=true;
			if (!dao.grabar(path, this.lista)) {
				this.lista.add((int)indice,remove);
				retorno=false;
			}
		}
		return retorno;
	}
	// Esto empieza a ser una parte del DTO
}
