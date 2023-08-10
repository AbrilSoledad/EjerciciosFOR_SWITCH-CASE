package ar.edu.unlam.dominio;

public class Letra {
	
	
	private char vocales;
	
	public Letra(char vocales) {
		this.vocales = vocales;
	}

	public boolean esVocal(char vocales) {
		switch(this.vocales) {
		       case 'a':
		       case 'A':
		    	   break;
		       case 'e':
		       case 'E':
		    	   break;
		       case 'i':
		       case 'I':
		    	   break;
		       case 'o':
		       case 'O':
		    	   break;
		       case 'u':
		       case 'U':	
		    	   break;
		default:
			return false;
		
		}
		return true;
		
	}
	
	
}
