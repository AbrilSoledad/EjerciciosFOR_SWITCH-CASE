package ar.edu.unlam.dominio;

public class Distancia {

	public static final double DECAMETRO = 10.0;
	public static final double HECTOMETRO = 100.0;
	public static final double KILOMETRO = 1000.0;
	private double metros;

	public Distancia(double metros) {
		this.metros = metros;
	}

	public double getMetros() {
		return metros;
	}

	public void setMetros(double metros) {
		this.metros = metros;
	}

	public void setMetros(double metros, byte unidad) {

	}

	public double getDECAMETRO(double metros) {
		return metros / DECAMETRO;
	}

	public double getHECTOMETRO(double metros) {
		return metros / HECTOMETRO;
	}

	public double getKILOMETRO(double metros) {
		return metros / KILOMETRO;
	}

}
