package DAOyDTO09;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.File;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DAO1Test {
	String elemento = "nueva cosa";
	String ruta = "./MiArchivo.dat";
	File archivo;
	DAO1 gestor = null;

	@BeforeEach
	void setUp() throws Exception {
		archivo = new File(ruta);
		gestor = new DAO1();
	}

	@AfterEach
	void tearDown() throws Exception {
		archivo.delete();
	}

	@Test
	void testGrabar() {
		assertTrue(gestor.grabar(ruta, elemento));
		assertTrue(archivo.exists());
	}

	@Test
	void testLeer() {
		// Este debe dar error de assert
		// assertNull(gestor.leer(ruta));
		assertTrue(gestor.grabar(ruta, elemento));
		assertEquals(elemento, gestor.leer(ruta));
	}
}
