package sistemavalidacion;

public class Controller {
	public Respuesta validarCliente(String e) {
		return Modelo.validaTelefono(e) ;
	}
}
