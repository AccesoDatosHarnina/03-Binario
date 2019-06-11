package variosMismoFichero;

public interface DTO<K, T> {

	public boolean grabar(T t,K k);

	public T leer(K k);
}
