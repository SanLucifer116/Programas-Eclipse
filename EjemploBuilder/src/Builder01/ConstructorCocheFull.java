package Builder01;
//CONSTRUCTOR CONCRETO
//HEREDAN DE BUILDER COCHE

public class ConstructorCocheFull extends BuilderCoche
{
    public ConstructorCocheFull() {
    }

    // ------------------------------

    @Override
    public void construirMotor() {
        this.coche.setMotor( "Motor de potencia alta" );
    }

    // ------------------------------

    @Override
    public void construirCarroceria() {
        this.coche.setCarroceria( "Carrocer�a de alta protecci�n" );
    }

    // ------------------------------

    @Override
    public void construirAireAcond() {
        this.coche.setAireAcond( true );
    }

    // ------------------------------

    @Override
    public void construirElevalunas() {
        this.coche.setElevalunasElec( true);
    }
}