

public class JuegoProxy implements Juego {
	private JuegoReal juego = null;
	private String nombreJuego = "";
	    
	    
	    
	    
	    
	    
    public JuegoProxy( String nombreImagen )
    {
        this.nombreJuego = nombreJuego;
    }

	@Override
	public void instalarJuego() {
		 if(this.juego == null)
	        {
	            this.juego = new JuegoReal( nombreJuego );
	        }

	        this.juego.instalarJuego();
		
	}
}
