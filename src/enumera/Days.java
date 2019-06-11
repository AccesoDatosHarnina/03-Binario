package enumera;

public enum Days {
	lunes(-1, "Lunes");
	
	private int plusDays;
	private String nombre;

	private Days(int plusDays, String nombre) {
		this.plusDays = plusDays;
		this.nombre = nombre;
	}

	public int getPlusDays() {
		return plusDays;
	}

	public String getNombre() {
		return nombre;
	}

}
