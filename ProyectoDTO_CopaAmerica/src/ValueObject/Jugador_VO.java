package ValueObject;

public class Jugador_VO {

private int Goles;
private String Pais;
private String NombreJug;



    public Jugador_VO(int Goles, String Pais, String NombreJug ) {
    	this.Goles = Goles;
    	this.Pais = Pais;
        this.NombreJug = NombreJug;
   
      
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
	
	@Override
	   public String toString() {
	        return this.getGoles()+ " " + this.getPais() + " " + this.getNombreJug() ;
	    }



















}
