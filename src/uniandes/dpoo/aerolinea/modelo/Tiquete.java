package uniandes.dpoo.aerolinea.modelo;

import java.util.HashSet;

public class Tiquete {
	private String codigo;
	private int tarifa;
	private boolean usado;
	
	public Tiquete(String codigo,int tarifa, Vuelo vuelo,Cliente clienteComprador, boolean usado) {
		this.codigo = codigo;
		this.tarifa = tarifa;
		this.usado = usado;
		
		}
		public String getCodigo() {
			return codigo;
		}
		public int getTarifa() {
			return tarifa;
		}
		public boolean isUsado() {
			return usado;
		}
		public int getValor() {
			
			return 0;
		}
		public void marcarComoUsado() {
			
		}
		public boolean esUsado() {
			return usado;
			
		}
	public class GeneradorTiquetes{
		private HashSet<String> codigos = new HashSet<String>();
		
		public Tiquete generarTiqueteVuelo(Vuelo vuelo, Cliente cliente, int tarifa) {
			return null;
			
		}
		public void registarTiquete(Tiquete unTiquete) {
			
		}
		public boolean validarTiquete(String codigoTiquete) {
			return false;
			
		}
		
	}

}
