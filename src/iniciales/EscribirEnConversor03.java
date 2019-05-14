package iniciales;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class EscribirEnConversor03 {
	public static void main(String[] args) {
		File archivo = new File("pruebaConversor.ddc");
		// El flujo de salida binaria
		FileOutputStream flujoW = null;
		// Introducimos el conversor
		DataOutputStream conversorW = null;
		// para poder escribir datos que no sean de tipo byte
		try {
			flujoW = new FileOutputStream(archivo);
			conversorW = new DataOutputStream(flujoW);
			System.out.println("tamano del float "+Float.BYTES);
			float valor = 455678.45f;
			conversorW.writeFloat(valor);
		} catch (FileNotFoundException e) {
			System.out.println("no puedo crear el archivo");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("no puedo escribir en el archivo");
			e.printStackTrace();
		}
		try {
			flujoW.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
