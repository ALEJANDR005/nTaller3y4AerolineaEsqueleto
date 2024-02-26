package uniandes.dpoo.aerolinea.modelo;

public class Vuelo {
	private String fecha;
	private Ruta ruta;
	private Avion avion;
	
	public Vuelo(Ruta way, String date, Avion plane) {
		this.avion = plane;
		this.fecha = date;
		this.ruta = way;
	}

	public String getFecha() {
		return fecha;
	}
	public Ruta getRuta() {
		return ruta;
	}
	public Avion getAvion() {
		return avion;
	}

}
