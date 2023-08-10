package ar.edu.unlam.interfaz;

import ar.edu.unlam.dominio.Motor;
import ar.edu.unlam.dominio.TiposBomba;

public class PruebaMotor {

	public static void main(String []args) {
		
		Motor motor = new Motor();
		
		System.out.println("Tipo de bomba: " + motor.dimeTipoMotor());
		
		motor.setTipoBomba(TiposBomba.GASOLINA);
		System.out.println("Tipo de bomba: " + motor.dimeTipoMotor());
		
		motor.setTipoBomba(TiposBomba.HORMIGON);
		System.out.println("Tipo de bomba: " + motor.dimeTipoMotor());
		

	}
}
