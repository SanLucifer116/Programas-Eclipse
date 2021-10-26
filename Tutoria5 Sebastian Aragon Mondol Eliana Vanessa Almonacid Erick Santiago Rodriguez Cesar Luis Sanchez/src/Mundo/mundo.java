package Mundo;

import javax.swing.JOptionPane;

public class mundo {
	
	private double tarifabasica;
	private char temporada;
	private char aerolinea;
	private int edadpasajero;
	private char estudiante;
	private double valorpasaje;
	

	public mundo(double parifabasica, char temporada, char aerolinea, int edadpasajero, char estudiante) {
		super();
		this.tarifabasica = tarifabasica;
		this.temporada = temporada;
		this.aerolinea = aerolinea;
		this.edadpasajero = edadpasajero;
		this.estudiante = estudiante;
	}


	public mundo(double tarifabasica2, String aerolinea2, String estudiante2, int edadpasajero2) {
		// TODO Auto-generated constructor stub
	}


	public void setTarifabasica(double tarifabasica) {
		this.tarifabasica = tarifabasica;
	}


	public void setTemporada(char temporada) {
		this.temporada = temporada;
	}


	public void setAerolinea(char aerolinea) {
	 this.aerolinea = aerolinea;
		
	}		
		
	

	


	public void setEdadpasajero(int edadpasajero, double arifabasica) {
		double des=0.0;
		if (edadpasajero <18)
			des= tarifabasica*0.5;
		else
			des=0;
			
	}


	public void setEstudiante(char estudiante) {
		this.estudiante = estudiante;
	}
	
	public double calculoaerolineaA ( char temporada, double tarifabasica, int edadpasajero, char aerolinea) {
		double incre,des2;
		
		
		if (aerolinea =='A') {
			
			if (temporada == 'A')
				incre = tarifabasica*0.3;
			else 
				incre = 0;
			
			if (estudiante == 'S') 
				if (edadpasajero >=18)
					if (temporada == 'B')
						des2=tarifabasica*0.1;
					else
						des2 =0;
		
		
		
		}
		return des2;
	}	
	
	
		public double calculoaerolineaV () {
			double incre=0, rec=0;
			int pv = 1;
			pv++;
			if (aerolinea =='V') {
			
				if (temporada == 'A')
				     incre = tarifabasica*0.2;
				else 
				    incre = 0;
			
				if ( edadpasajero >=60)
					rec = 5000;
				else
					rec =0;
			
		}
			
			
			return( rec+incre);	
			
		}
		
		
	public double valorpasaje() {
		double des=0,des2=0;
				return valorpasaje= ((tarifabasica+calculoaerolineaV ())-(des+des2));
		
	}
		
		
		
	
	}


