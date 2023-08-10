package ar.edu.unlam.interfaz;

import ar.edu.unlam.dominio.Destornillador;
import ar.edu.unlam.dominio.Tarugo;
import ar.edu.unlam.dominio.Tornillo;
import java.util.Scanner;

public class PruebaTornillo {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		char tipoDeCabeza = 'H';
		
		Tornillo phillip = new Tornillo ('H',10,15);
		
		Destornillador paraPhillip = new Destornillador(tipoDeCabeza);
		
		Tarugo tarugo = new Tarugo(10);
		
		
		char opcion = 0;
		int tarugo1 = 0;
		
		do {
			System.out.println("Ingrese H para atornilllar o A para desatornillar");
			
			opcion = teclado.next().toUpperCase().charAt(0);
			tarugo1 = teclado.nextInt();
			
			switch(opcion) {
			case 'H':
				paraPhillip.atornillar(phillip);
				break;
			case 'A':
				paraPhillip.desatornillar(phillip);
				break;
			case 'S':
				System.out.println("Hasta luego!");
				break;
			}
			
		}while(opcion != 'S');
		
		
		
		
		
		
		
		
		teclado.close();
	}
}
