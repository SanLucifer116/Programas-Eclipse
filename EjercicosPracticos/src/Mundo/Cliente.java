package Mundo;

import java.util.Calendar;

public class Cliente {
	
	private String ncuenta;
	private String nombre;
	private String tipotrans;
	//private Calendar fecha;
	private double valtrans;
	private double nuvsaldo;
	
	public Cliente (String pNcuenta, String pNombre, String pTipotrans, double pValtrans, double pNuvsaldo) 

	{
				
	ncuenta = pNcuenta;
	nombre = pNombre;
	tipotrans = pTipotrans;
	//fecha = pFecha;
	valtrans = pValtrans;
	nuvsaldo = pNuvsaldo;
			
	}

	public String getNcuenta() {
		return ncuenta;
	}

	public String getNombre() {
		return nombre;
	}

	public String getTipotrans() {
		return tipotrans;
	}

//	public Calendar getFecha() {
	//	return fecha;
	//}
	public double getValtrans() {
		return valtrans;
	}

	public void setValtrans(double valtrans) {
		this.valtrans = valtrans;
	}
	
	
	public double getNuvsaldo(double saldo) {
		return nuvsaldo =( saldo + getValtrans());
		
	}

	
	


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}



