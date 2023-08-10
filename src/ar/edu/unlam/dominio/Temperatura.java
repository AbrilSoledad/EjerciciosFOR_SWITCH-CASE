package ar.edu.unlam.dominio;

public class Temperatura {

	public final byte CELCIUS = 0;
	public final byte FARENHEIT = 1;
	public final byte KELVIN = 2;
	private double valor;

	
	public Temperatura(double valor) {
		this.valor = valor;
	}


	//metodos
	
	public double getValor() {
		
		return valor;
	}

	
	
	public void setValor(double valor) {
		this.valor = valor;
		
	}


	public double convertirFarenheit() {
		double convertirAFarenheit = (this.valor * 1.8) + 32;
		
		return convertirAFarenheit;
	}


	public double convertirKelvin() {
		double convertirAKelvin = this.valor + 273.15;
		
		return convertirAKelvin;
	}
	
	
	
    
	
	
	
	
	
}
