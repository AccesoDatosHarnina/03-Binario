
public class adaptaSimple {

	public static void main(String[] args) {
		Europea europea = new Europea();
		Mia mia = new Mia();
		// europea.calculaCoste(mia.calculateSpeed(9876, 12), 10);
		// Es la forma mas sencilla de adpater
		// tambien se llama wrapper
		europea.calculaCoste(new Adapter().convierteMillasEnKM(mia.calculateSpeed(9878, 134)), 12);
	}
}

class Adapter {
	public float convierteMillasEnKM(float millas) {
		return (float) (millas / 0.998);
	}
}

class Europea {
	// En Km
	public float calculaCoste(float velocidadKm, float precio) {
		return velocidadKm * precio;
	}
}

class Mia {
	// En millas
	public float calculateSpeed(float meters, float time) {
		double mille = 1609.34;
		return (float) ((meters / mille) / time);
	}
}