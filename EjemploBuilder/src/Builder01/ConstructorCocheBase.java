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
        this.coche.setCarroceria( "Carrocería de baja protección" );
    }

    
    
    @Override
    public void construirMotor() {
        this.coche.setMotor( "Motor de potencia mínima" );
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