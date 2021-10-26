package Modelo;

public class Jugador {


	private int Goles;
	private String Pais;
	private String NombreJug;
	
	
	public Jugador(int goles, String pais, String nombreJug) {
		super();
		Goles = goles;
		Pais = pais;
		NombreJug = nombreJug;
	}


	public int getGoles() {
		return Goles;
	}


	public void setGoles(int goles) {
		Goles = goles;
	}


	public String getPais() {
		return Pais;
	}


	public void setPais(String pais) {
		Pais = pais;
	}


	public String getNombreJug() {
		return NombreJug;
	}


	public void setNombreJug(String nombreJug) {
		NombreJug = nombreJug;
	}
	
	
	public String toString() {
		return this.getPais()+" "+this.getNombreJug();
		}
	




}
