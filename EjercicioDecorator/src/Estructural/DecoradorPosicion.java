package Estructural;

//Decorador 
public abstract   class DecoradorPosicion implements Iboton{

	
	 protected  Iboton boton;
	  public void DecoradorDesplazamiento( Iboton b )
	    {
	        this.setBoton();
	    }

	  
	  public void DecoradorPoscicion (Iboton boton) {
		  
		  this.setBoton();
	  }
	  
	  
	  
	  public Iboton getBoton() {
		  
		  
		  return boton;
	  }
	  
	  public void setBoton() {
		  
		  
		  this.boton = boton;
	  }
	  
	  public




}
