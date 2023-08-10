package ar.edu.unlam.interfaz;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String []args) {
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Eliga: 1.Suma, 2.Resta, 3. Multiplicacion, 4.Division");
		int operacion = teclado.nextInt();
		
		System.out.println("Ingrese el primer valor: ");
		int numUno = teclado.nextInt();
		
		System.out.println("Ingrese el segundo valor: ");
		int numDos = teclado.nextInt();
		
		int resultado = 0;
		
		
		switch(operacion) 
		{
		case 1: 
		    resultado = numUno + numDos;
		    System.out.println("El resultado de la suma es " + resultado);
		    break;
		case 2:
			resultado = numUno - numDos;
			System.out.println("El resultado de la resta es: " + resultado);
			break;
		case 3:
			resultado = numUno * numDos;
			System.out.println("El resultado de la multiplicacion es: " + resultado);
			break;
		case 4:
			resultado = numUno / numDos;
			System.out.println("El resultado de la division es: " + resultado);
			break;
		default:
			System.out.println("La opcion que escogiste no existe");
			break;
		}
		
		teclado.close();
	}
}
