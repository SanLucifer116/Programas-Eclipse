package estructurales.bridge.bridge01;

public class Main
{
    public static void main(String[] args)
    {
        // Crear un objeto de tipo 'AbstraccionRefinada' indic�ndole un 'ImplementadorConcreto'
        ElaborarAlimento lasagna = new ElaborarLasagna( new Carne() );
        lasagna.obtener();

        // Ahora le indicamos que use otra implementaci�n para obtener la de verduras
        lasagna.setImplementador( new Verduras() );
        lasagna.obtener();
    }
}