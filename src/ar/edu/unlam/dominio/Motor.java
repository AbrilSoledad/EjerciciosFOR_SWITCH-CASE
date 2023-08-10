package ar.edu.unlam.dominio;

public class Motor {
	
	public static final int NO_DEFINIDO = 0;
	public static final int BOMBA_DE_AGUA = 1;
	public static final int BOMBA_DE_GASOLINA = 2;
	public static final int BOMBA_DE_HORMIGON = 3;
	public static final int BOMBA_DE_PASTA_ALIMENTICIA = 4;
	
	
	
	public TiposBomba tipoBomba;
	private String tipoFluido;
	private String combustible;
	
	
	public Motor() {
		this.tipoBomba = TiposBomba.NO_DEFINIDO;
		this.tipoFluido = "liquido";
		this.combustible = "Nafta";
	}

	public TiposBomba getTipoBomba() {
		return this.tipoBomba;
	}

	public void setTipoBomba(TiposBomba tipoBomba) {
		this.tipoBomba = tipoBomba;
	}

	public String getTipoFluido() {
		return tipoFluido;
	}

	public void setTipoFluido(String tipoFluido) {
		this.tipoFluido = tipoFluido;
	}

	public String getCombustible() {
		return combustible;
	}

	public void setCombustible(String combustible) {
		this.combustible = combustible;
	}
	
	
	public String dimeTipoMotor() {
		String respuesta = "";
		switch(this.tipoBomba){
		case NO_DEFINIDO:
			respuesta= "No hay establecido un valor definido para el tipo de bomba";
			break;
		case AGUA:
			respuesta = "La bomba es una bomba de agua";
			break;
		case GASOLINA:
			respuesta = "La bomba es una bomba de gasolina";
			break;
		case HORMIGON:
			respuesta = "La bomba es una bomba de hormigon";
			break;
		case PASTA_ALIMENTICIA:
			respuesta = "La bomba es una bomba de pasta alimenticia";
			break;
				
		}
		return respuesta;
	}
	
	
	
}
