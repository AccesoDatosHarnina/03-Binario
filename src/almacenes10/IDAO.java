package almacenes10;

public interface IDAO {
	
	public Object leer(String path);

	public boolean grabar(String path, Object t);
}
