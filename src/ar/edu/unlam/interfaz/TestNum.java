package ar.edu.unlam.interfaz;

import java.util.Scanner;

import ar.edu.unlam.dominio.DiasSemana;

public enum TestNum {;


	public static void main(String []args) {
	
	Scanner teclado = new Scanner (System.in);
		
	//System.out.println(DiasSemana.LUNES);
	//System.out.println(DiasSemana.values()[1]);
	

	/*System.out.println("Ingrese el dia de la semana: 1. LUNES, 2. MARTES, 3. MIERCOLES, 4. JUEVES, 5. VIERNES, 6. SABADO, 7. DOMINGO");
	int numIngresado = teclado.nextInt();
	DiasSemana dia = DiasSemana.values()[numIngresado - 1]; */

	//MARTES
	System.out.println("Ingrese el dia de la semana: LUNES, MARTES, MIERCOLES, JUEVES, VIERNES,SABADO, DOMINGO");
	String diaSemana = teclado.next();
	DiasSemana dia = DiasSemana.valueOf(diaSemana.toUpperCase());
	
	
	
	switch(dia) 
	{
	case LUNES:
		break;
	case MARTES:	
		break;
	case MIERCOLES:
		break;
	case JUEVES:
		break;
	case VIERNES:
	    break;
	case SABADO:
		break;
	case DOMINGO:
	    break;
	}
	
	teclado.close();
	
	}
}

 

	


	