package ar.edu.unlam.interfaz;

import java.util.Scanner;

public class EjemploFor2 {

	public static void main(String []args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("ingrese la base: ");
		int base = teclado.nextInt();
		
		System.out.println("ingrese el exponente: ");
		int exponente = teclado.nextInt();
		
		long resultado = 1;
		for(int i = 0; i < exponente; i++)
			resultado = resultado * base;		
		
		
		System.out.println("el resultado de " + base + " elevado a " + exponente + " es " + resultado);
		
		
		System.out.println("");
		
		//decremento, evaluo, ejecuto
		
		long answer = 1;
		for(int i = exponente; i > 0; i--) 
			answer = answer * base;		
		
		
		System.out.println("el resultado de " + base + " elevado a " + exponente + " es " + answer);
		
		
		
		teclado.close();
	}
}
