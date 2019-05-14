package iniciales;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class LeerConversor04 {
	public static void main(String[] args) {
		File archivo = new File("pruebaConversor.ddc");
		if (archivo.exists()) {
			// Flujo binario para lectura
			FileInputStream flujoR = null;
			DataInputStream conversorR = null;
			try {
				flujoR = new FileInputStream(archivo);
				conversorR = new DataInputStream(flujoR);
				//Debemos conocer la estrucutra de la informacion del archivo
				//es decir, en nque orden y de que tipo son los datos guardados
				System.out.println(conversorR.readFloat());

			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				flujoR.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
