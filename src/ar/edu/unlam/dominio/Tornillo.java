package ar.edu.unlam.dominio;

public class Tornillo {

	private final char TIPO_DE_CABEZA;
	private final int LONGITUD;
	private final int CANTIDAD_DE_ROSCA;
	private int posicionActual;

	public Tornillo(char tipoDeCabeza, int longitud, int cantidadDeRosca) {
		this.TIPO_DE_CABEZA = tipoDeCabeza;
		this.LONGITUD = longitud;
		this.CANTIDAD_DE_ROSCA = cantidadDeRosca;
		this.posicionActual = 0;
	}

	public int getLongitud() {
		return this.LONGITUD;
	}

	public int getTipoCabeza() {
		return this.TIPO_DE_CABEZA;
	}

	// izquierda hasta 0 A antihorario
	// derecha hasta CANTIDAD_DE_ROSCA H horario
	public boolean girar(char sentido) {
		boolean puedeGirar = false;

		if (sentido == 'H') {

			if (this.posicionActual < this.CANTIDAD_DE_ROSCA) {
				puedeGirar = true;
			} else {
				if (this.posicionActual > 0) {
					puedeGirar = true;
					this.posicionActual--;
				}
			}

		}

		return puedeGirar;
	}

}
