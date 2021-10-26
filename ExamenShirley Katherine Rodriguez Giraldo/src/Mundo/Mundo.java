package Mundo;

public class Mundo {

	private int estado, numhijos, anti;
	private double sueldo;
	
	
	public Mundo(int pEstado, int pNumhijos, int pAnti, double pSueldo) {
		super();
		this.estado = pEstado;
		this.numhijos = pNumhijos;
		this.anti = pAnti;
		this.sueldo = pSueldo;
	}


	public void setEstado(int estado) {
		this.estado = estado;
	}


	public void setNumhijos(int numhijos) {
		this.numhijos = numhijos;
	}


	public void setAnti(int anti) {
		this.anti = anti;
	}


	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
	
	public double bonificacion(int estado, int numhijos, int anti, double sueldo) {
	double	boni=0, boni2=0;
	
	if (estado == 1)
		if (numhijos >0)
			boni = numhijos*10000;
		else 
			boni = 0;
	else if (numhijos > 0)
		boni = numhijos*5000;
	
	if (anti >2)
		boni2 = numhijos*3000;
	else 
		boni2 = 0;
	
	return (sueldo + boni + boni2);
	}
	
	

}
