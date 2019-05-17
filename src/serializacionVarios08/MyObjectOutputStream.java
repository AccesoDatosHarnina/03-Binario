package serializacionVarios08;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class MyObjectOutputStream extends ObjectOutputStream {
	public MyObjectOutputStream(OutputStream out) throws IOException {
		super(out);
	}
	//Para evitar que se interoduzca una cabecera a partir del segundo objeto
	//reescribo el metodo swriteStreamHeader
	@Override
	protected void writeStreamHeader() throws IOException {
		System.out.println("soy la  otra");
	}
}
