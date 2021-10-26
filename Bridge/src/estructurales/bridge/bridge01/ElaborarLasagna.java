package estructurales.bridge.bridge01;

public class ElaborarLasagna extends ElaborarAlimento
{
    public ElaborarLasagna( IElaborar implementador )
    {
        this.setImplementador( implementador );
    }

    // ------------------------

    @Override
    public void obtener()
    {
        System.out.println("Preparando lasagna...");

        this.getImplementador().procesar();
    }
}