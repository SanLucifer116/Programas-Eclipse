package Metodos;

public class Metodos {

	
	private int ecivil,  antiguo ,canthijos;
	private  double sueldobase;
	
	
	public Metodos(int pEcivil, int pAntiguo, int pCanthijos, double pSueldobase) {
		super();
		this.ecivil = pEcivil;
		this.antiguo = pAntiguo;
		this.canthijos = pCanthijos;
		this.sueldobase = pSueldobase;
	}


	public void setEcivil(int ecivil) {
		this.ecivil = ecivil;
	}


	public void setAntiguo(int antiguo) {
		this.antiguo = antiguo;
	}


	public void setCanthijos(int canthijos) {
		this.canthijos = canthijos;
	}


	public void setSueldobase(double sueldobase) {
		this.sueldobase = sueldobase;
	}
	
	
	public double bonisalario(int ecivil,int antiguo,int canthijos) {
		
		double bonhijos=0, bonanti  = 0;
		if (antiguo >2)
			bonanti = canthijos*3000;
		else if (antiguo <=2)
			bonanti = 0;
		
		switch (ecivil) {
		case 1:
			if (canthijos >=1)
				bonhijos = 10000*canthijos;
		
		case 2:
			if (canthijos >=1)
				bonhijos = 5000*canthijos;	
		}	
		return (bonanti + bonhijos);
				
		}
			
	}
	
	
	
	
	

