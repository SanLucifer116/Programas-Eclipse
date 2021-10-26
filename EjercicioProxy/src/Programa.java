

public class Programa {
	 private String nombreDoc;
	    private String texto;

	    private JuegoProxy juegProxy;

	    // ---------------------------

	    public Programa( String nombreDoc )
	    {
	        this.setNombreJuego( nombreDoc );
	        this.InstalarPrograma();
	        this.Instalar();
	    }

	    // ---------------------------

	    public String getNombreJueg()
	    {
	        return this.nombreDoc;
	    }

	    // ---------------------------

	    public void setNombreJuego( String nombreDoc )
	    {
	        this.nombreDoc = nombreDoc;
	    }

	    // ---------------------------

	    public void InstalarPrograma()
	    {
	        // Aquí cargaríamos el archivo y obtendríamos su contenido

	        this.texto = "Datos del Programa";
	        this.juegProxy = new JuegoProxy( "Programa.exe" );

	        System.out.println("Programa instalado en Disco c");
	    }

	    // ------------------------

	    public void Instalar()
	    {
	        System.out.println("Abriendo Programa...\n");
	    }

	    // ------------------------

	    // Supongamos que este método es un evento que se lanza al hacer scroll
	    public void hacerScroll()
	    {
	        System.out.println("El usuario ha hecho scroll...");

	        juegProxy.instalarJuego();
	    }
}
