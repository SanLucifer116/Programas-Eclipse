package estructurales.flyweight.flyweight01;

import java.util.ArrayList;
import java.util.List;

public class FabricaDeLineas
{
    private List<ILineaLigera> lineas;

    // --------------------

    public FabricaDeLineas()
    {
        this.lineas = new ArrayList<ILineaLigera>();
    }

    // --------------------

    public ILineaLigera getLine( String color )
    {
        // Comprobar si hemos creado una l�nea con el color solicitado, y devolverla en tal caso
        for(ILineaLigera linea : this.lineas)
        {
            if( linea.getColor().equals(color) )
            {
                System.out.println("L�nea de color [" + color + "] encontrada, la devolvemos");
                return linea;
            }
        }

        // Si no ha sido creada la creamos ahora, la agregamos a la lista y la devolvemos
        System.out.println("Creando una l�nea de color [" + color + "]");

        ILineaLigera linea = new Linea( color );
        this.lineas.add( linea );

        return linea;
    }
}