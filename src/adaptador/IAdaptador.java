package adaptador;

public interface IAdaptador<T> {

	public T leer(String path);

	public boolean grabar(String path, T objeto);
}
