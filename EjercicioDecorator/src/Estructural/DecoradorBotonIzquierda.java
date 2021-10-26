package Estructural;



public class DecoradorBotonIzquierda extends DecoradorPosicion {
	 public DecoradorBotonIzquierda (Iboton b) {
		  
		  super ( );
	  }
	  
	  public void dibujar(boolean dere, boolean izque)
	  {
	      // Dibujar la ventana
		 getBoton().decorar(dere, izque);
	      // Agregar barra de desplazamiento
	      this.dibujarBarraDespHorizontal();
	  }
	  private void dibujarBarraDespHorizontal()
	  {
	      System.out.println("Agregar seccion del boton en izquierda");
	  }
}
