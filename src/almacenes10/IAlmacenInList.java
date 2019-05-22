package almacenes10;

public interface IAlmacenInList<T,I> {
	public T obtener(I indice);
	public boolean grabar(T t) ;
	public boolean borrar(I indice);
	
}
