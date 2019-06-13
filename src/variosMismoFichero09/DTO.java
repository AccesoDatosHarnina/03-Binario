package variosMismoFichero09;

public interface DTO<K, T> {

	public boolean grabar(T t,K k);

	public T leer(K k);
}
