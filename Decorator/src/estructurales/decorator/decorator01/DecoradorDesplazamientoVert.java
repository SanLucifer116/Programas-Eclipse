package estructurales.decorator.decorator01;

public class DecoradorDesplazamientoVert extends DecoradorDesplazamiento
{
    public DecoradorDesplazamientoVert( IVentana v )
    {
        super( v );
    }

    // ---------------------------

    @Override
    public void dibujar(int col, int fila)
    {
        // Dibujar la ventana
        this.getVentana().dibujar(col, fila);

        // Agregar barra de desplazamiento
        this.dibujarBarraDespVertical();
    }

    // ---------------------------

    private void dibujarBarraDespVertical()
    {
        System.out.println("Agregada barra de desplazamiento vertical");
    }
}