package ValueObject;

public class Jugador_VO {

private int Goles;
private String Pais;
private String NomJug;




	public Jugador_VO(int goles, String pais, String nomJug) {
		super();
		Goles = goles;
		Pais = pais;
		NomJug = nomJug;
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
	
	
	
	
	public String getNomJug() {
		return NomJug;
	}
	
	
	
	
	public void setNomJug(String nomJug) {
		NomJug = nomJug;
	}
	


















}
