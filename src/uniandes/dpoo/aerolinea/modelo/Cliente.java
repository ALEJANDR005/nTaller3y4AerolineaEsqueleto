package uniandes.dpoo.aerolinea.modelo;

import org.json.JSONObject;
import java.util.ArrayList;
import java.util.List;

public   class Cliente {
	public static class ClienteCorporativo {
        public static final String CORPORATIVO = "Corporativo";
        public static final int GRANDE = 1;
        public static final int MEDIANA = 2;
        public static final int PEQUENA = 3;

        private String nombreEmpresa;
        private int tamanoEmpresa;
        
        public ClienteCorporativo(String nombreEmpresa, int tamano) {
            this.nombreEmpresa = nombreEmpresa;
            this.tamanoEmpresa = tamano;
        }
        public String getNombreEmpresa() {
            return nombreEmpresa;
        }
        public int getTamanoEmpresa() {
            return tamanoEmpresa;
        }
        public String getTipoCliente() {
            if (tamanoEmpresa == GRANDE) {
                return "Grande";
            } else if (tamanoEmpresa == MEDIANA) {
                return "Mediana";
            } else if (tamanoEmpresa == PEQUENA) {
                return "Pequeña";
            } else {
                return "Desconocido";
            }
        }
        public String getIdentificador() {
            return nombreEmpresa + "-" + tamanoEmpresa;
        }
        public static ClienteCorporativo cargarDesdeJSON(JSONObject cliente) {
            String nombre = cliente.getString("nombreEmpresa");
            int tamano = cliente.getInt("tamanoEmpresa");
            return new ClienteCorporativo(nombre, tamano);
        }
        public JSONObject salvarEnJSON() {
            JSONObject clienteJSON = new JSONObject();
            clienteJSON.put("nombreEmpresa", nombreEmpresa);
            clienteJSON.put("tamanoEmpresa", tamanoEmpresa);
            return clienteJSON;
        }
    public abstract class ClienteAbstracto {
    	String identificador;
    	public ClienteAbstracto(String identificador) {
    		
    	}
    	private List<Tiquete> tiquetes = new ArrayList<>();

        public void agregarTiquete(Tiquete tiquete) {
            tiquetes.add(tiquete);
        }

		public String getIdentificador() {
			return identificador;
		}
		public int calcularValorTotalTiquetes() {
	        int valorTotal = 0;
	        for (Tiquete t : tiquetes) {
	            valorTotal += t.getValor();
	        }
	        return valorTotal;
	    }
		public void usarTiquetes(Vuelo vuelo) {
	    }

		
    public class ClienteNatural{
    	public String NATURAL = "Natural";
    	private String nombre;
    	
    	public void ClenteNatural(String NATURAL, String nombre) {
    		this.nombre = nombre;
    		this.NATURAL = "Natural";
    		
    		
    	}
    	public String getIdentificador() {
			return identificador;
		}
    	public String getTipoCliente() {
            if (tamanoEmpresa == GRANDE) {
                return "Grande";
            } else if (tamanoEmpresa == MEDIANA) {
                return "Mediana";
            } else if (tamanoEmpresa == PEQUENA) {
                return "Pequeña";
            } else {
                return "Desconocido";
            }
        }
		public String getNombre() {
			return nombre;
		}
		
    	
    }
    }

		
        

	
	}

	public String getIdentificador() {
		
		return null;
	}
}