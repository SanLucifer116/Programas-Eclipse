// COMPONETNE

public abstract class Nodo{
	
	
	    public static final int PIZZA = 1;
	    public static final int MENU = 2;

	    protected String nombre = "";
	    protected int tipoNodo;

	    // ----------------------------

	    public String getNombrePizza()
	    {
	        return this.nombre;
	    }

	    // ----------------------------

	    public void setNombrePizza( String nombre )
	    {
	        this.nombre = nombre;
	    }

	    // ----------------------------

	    public int getTipoNodo()
	    {
	        return this.tipoNodo;
	    }

	    // ----------------------------

	    public void setTipoNodo( int tipoNodo )
	    {
	        this.tipoNodo = tipoNodo;
	    }

	    // ----------------------------

	    // Método a implementar por las clases que hereden
	    public abstract void mostrar();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
