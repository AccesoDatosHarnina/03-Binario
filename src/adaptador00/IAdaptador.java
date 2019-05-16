package adaptador00;

public interface IAdaptador<T> {

	public T leer(String path);

	public boolean grabar(String path, T objeto);
}
