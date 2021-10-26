package Builder01;
//CONSTRUCTOR ABSTRACTO
public abstract class BuilderCoche
{
    protected Coche coche;

    // ------------------------------

    public Coche getCoche() {
        return this.coche;
    }

    // ------------------------------

    public void crearNuevoCoche() {
        this.coche = new Coche();
    }

    // ------------------------------------

    // M�todos que deber�n ser constru�dos por las clases que hereden de �sta
    public abstract void construirMotor();
    public abstract void construirCarroceria();
    public abstract void construirAireAcond();
    public abstract void construirElevalunas();
}