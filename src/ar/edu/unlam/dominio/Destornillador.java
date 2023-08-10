package ar.edu.unlam.dominio;

public class Destornillador {

	private final char TIPO_DE_CABEZA;

	public Destornillador(char tipoDeCabeza) {
		this.TIPO_DE_CABEZA = tipoDeCabeza;
	}

	public void desatornillar(Tornillo tornillo) {
		if (this.esCompatible(tornillo)) {

			boolean puedeGirar = tornillo.girar('A');

			while (puedeGirar == true) {
				puedeGirar = tornillo.girar('A');
			}
		}

	}

	public void atornillar(Tornillo tornillo) {
		if (this.esCompatible(tornillo)) {

			boolean puedeGirar = tornillo.girar('H');

			while (puedeGirar == true) {
				puedeGirar = tornillo.girar('H');
			}
		}

	}

	public void desatornillar(Tornillo tornillo, Tarugo tarugo) {

	}

	

	private boolean esCompatible(Tornillo tornillo) {
		return tornillo.getTipoCabeza() == this.TIPO_DE_CABEZA;
	}

	

}
