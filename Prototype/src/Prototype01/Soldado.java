package Prototype01;

public abstract class Soldado 
{
		private String nombre= " ";
		private String arma = " Groza ";
		
		
		public String getNombre () {
			return this.nombre;
		}
		
		
		public void setNombre( String nombre) {
			this.nombre = nombre;
		}
		
		
		public String getArma() {
		        return this.arma;
		    }
		
		public void setArma( String arma) {
		        this.arma = arma;
		    }
	
		//Metodos que deberan ser construidos pors clases que se hereden de estas
		
		public abstract Soldado clonar();
		public abstract void disparar();
		public abstract void retirar();
	}
