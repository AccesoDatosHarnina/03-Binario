package sistemavalidacion;

import java.util.regex.Pattern;

public class Modelo {
	private String telefono;

	public Modelo(String telefono) {
		super();
		assert telefono!=null&&validaTelefono(telefono).resultad;
		this.telefono = telefono;
	}

	public static Respuesta validaTelefono(String telefono) {
		return new Respuesta(Pattern.matches("[67]\\d{8}", telefono),"el telefono no es valido");
	}
}
