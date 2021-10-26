package estructurales.bridge.bridge01;


public class Verduras implements IElaborar
{
    public Verduras() {
    }

    // --------------------------

    @Override
    public void procesar()
    {
        // Operaciones necesarias
        // ...

        System.out.println("\tlasgana de verduras elaborada");
    }
}