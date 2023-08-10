package ar.edu.unlam.interfaz;

import java.util.Scanner;

import ar.edu.unlam.dominio.Letra;


public class Tp4Ejercicio1 {

	public static void main(String []args) {
		
		Scanner teclado = new Scanner (System.in);
		
		
		char letraIngresada = 'a';
		int num = 0;
		
		do {
			System.out.println("Ingrese una letra: ");
			letraIngresada = teclado.next().charAt(0);
			
			Letra letra = new Letra(letraIngresada);
			
			if(letra.esVocal(letraIngresada) == true) {
				System.out.println("La letra ingresada es una vocal");
			} else {
				System.out.println("La letra ingresada es una consonante");
			}
			
		}while(letraIngresada  != num);
		
		

		
		
		teclado.close();
	}
}
