package ar.edu.unlam.interfaz;

import java.util.Scanner;
import ar.edu.unlam.dominio.Distancia;
import ar.edu.unlam.dominio.MenuDistancia;

public class PruebaDistancia {
	
	//almacena el valor de la distancia en metros,para poder expresar la misma en otras unidades

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int convertir = 1;
		
	do {System.out.println("Ingrese una distancia en metros");
	double metros = teclado.nextDouble();
	
	 for (int i = 0; i < MenuDistancia.values().length; i++) {

		System.out.println("Ingrese " + i + " " + MenuDistancia.values()[i]);
	}
     convertir = teclado.nextInt();
		
		Distancia distancia = new Distancia(metros);
        
       
        switch(convertir) {
        case 0:
        	System.out.println("SALIR");
        	break;
        case 1:
        	System.out.println(distancia.getDECAMETRO(metros));
        	break;
        case 2:
        	System.out.println(distancia.getHECTOMETRO(metros)); 
        	break;
        case 3:
        	System.out.println(distancia.getKILOMETRO(metros)); 
        	break;
        default:
        	System.out.println("Opcion invalida");
        	break;
        }
        
	}while(convertir != 0);
        
		teclado.close();
	}
}
