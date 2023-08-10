package ar.edu.unlam.interfaz;

import  java.util.Scanner;

import ar.edu.unlam.dominio.MenuTemperatura;
import ar.edu.unlam.dominio.Temperatura;

public class ConversionGrados {

	public static void main(String []args) {
		
		Scanner teclado = new Scanner (System.in);
		
		
		int opcion = 0;
		
		
		do {
			System.out.println("Ingrese la temperatura en grados centigrados");
			double gradosC = teclado.nextByte();
			
			Temperatura temperatura = new Temperatura (gradosC);
			
			for(int i = 0; i < MenuTemperatura.values().length; i++) {
				System.out.println("Ingrese " + i + " para " + MenuTemperatura.values()[i]);
			}
			
			opcion = teclado.nextInt();
			
			switch(opcion)
			{
			case 0: 
				System.out.println("La temperatura en grados Farenheit es: " + temperatura.convertirFarenheit());
				break;
			case 1:
				System.out.println("La temperatura en grados Kelvin es: " + temperatura.convertirKelvin());
				break;
			}
			
		} while(opcion == 0 || opcion == 1);
		
		
		
		
		
		
		
		
		
		
			
		
			

		
		
		teclado.close();
	}
}
