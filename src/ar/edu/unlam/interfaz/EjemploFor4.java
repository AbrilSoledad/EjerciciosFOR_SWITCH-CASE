package ar.edu.unlam.interfaz;

public class EjemploFor4 {

	public static void main(String []args) {
		
		//muestra: 10, 8, 6, 4, 2
		
		int bandera = 0;
		
		int i = 0;
		
		for(i = 10; i > 0; i--) {
			if(i%2 == 0) {
				bandera = 1;
			}
		}
		
//--------------------------------------------------------------------------------//
		
		int banderaa = 0;
		String divisores = "";
		int a = 0;
		for(a = 10; a > 0; a--) {
			if(a%2 == 0) {
				divisores+= a + "";
				//10, 5, 2, 1
			  }
			}
		
		
		
	}
}
