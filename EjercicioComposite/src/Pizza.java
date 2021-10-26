

public class Pizza extends Nodo {
	public Pizza( String nombre )
    {
        this.setTipoNodo( Nodo.PIZZA );
        this.setNombrePizza( nombre );
    }

    // ----------------------------

	@Override
	public void mostrar() {
        System.out.println( "Archivo: [" + this.getNombrePizza() + "]" );		
	}

}
