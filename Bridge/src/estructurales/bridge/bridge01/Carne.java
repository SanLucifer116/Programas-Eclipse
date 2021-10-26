package estructurales.bridge.bridge01;

public class Carne implements IElaborar
{
    public Carne() {
    }

    // --------------------------

    @Override
    public void procesar()
    {
        // Operaciones necesarias
        // ...

        System.out.println("\tlasgana de carne elaborada");
    }
}