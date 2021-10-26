package Builder01;
//CONSTRUCTOR CONCRETO
//HEREDAN DE BUILDER COCHE
public class ConstructorCocheBase extends BuilderCoche
{
    public ConstructorCocheBase() {
    }

    // ------------------------------
    @Override
    public void construirCarroceria() {
        this.coche.setCarroceria( "Carrocer�a de baja protecci�n" );
    }

    
    
    @Override
    public void construirMotor() {
        this.coche.setMotor( "Motor de potencia m�nima" );
    }

    // ------------------------------

  
    // ------------------------------

    @Override
    public void construirAireAcond() {
        this.coche.setAireAcond( false );
    }

    // ------------------------------

    @Override
    public void construirElevalunas() {
        this.coche.setElevalunasElec( false );
    }
}