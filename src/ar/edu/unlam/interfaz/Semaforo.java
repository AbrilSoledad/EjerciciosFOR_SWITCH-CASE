package ar.edu.unlam.interfaz;

import java.util.Scanner;

public class Semaforo {

	public static void main(String []args) {
		
	Scanner teclado = new Scanner (System.in);	
		
		char color = 0;
		
		System.out.println("Ingrese el color que alimenta al semaforo");
		System.out.println("'r': Rojo, 'a': Amarillo, 'v': Verde");
	    color = teclado.next().charAt(color);
		
		switch(color)
		{
		case 'r':
		case 'R':
			System.out.println("El semaforo esta en ROJO");
			break;
		case 'a':
		case 'A':
			System.out.println("El semaforo esta en  AMARILLO");
			break;
		case 'v':
		case 'V':
			System.out.println("El semaforo esta en VERDE");
			break;
		default:
			System.out.println("La condicion no  existe");
		
		}

		
		
		
	   teclado.close();
	}
}
