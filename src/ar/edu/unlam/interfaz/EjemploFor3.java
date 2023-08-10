package ar.edu.unlam.interfaz;

import java.util.Scanner;

public class EjemploFor3 {

	public static void main(String []args) {
		
		Scanner teclado = new Scanner(System.in);
		
		//values: todos los enum
		//valueOf("AGREGAR").ordinal(): te la posicion del enum agregar
		
		for (int i = 0; i < OpcionesMenu.values().length; i++) {
			System.out.println("Ingrese " + i + " para " + OpcionesMenu.values()[i]);
		}
		
		
		System.out.println("");
		
		int opcion = teclado.nextInt();
		
		switch(opcion) {
		case 0:
			System.out.println("logica para agregar");
			break;
		case 1:
			System.out.println("logica para editar");
			break;
		case 2:
			System.out.println("logica para consultar");
			break;
		case 3:
			System.out.println("logica para eliminar");
			break;
		case 4:
			System.out.println("logica para salir");
			break;
		default:
			System.out.println("opcion invalida");
			break;
		}
		
		
		
		teclado.close();
	}
}
