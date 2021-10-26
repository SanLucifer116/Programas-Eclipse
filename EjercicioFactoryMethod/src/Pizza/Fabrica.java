package Pizza;

public class Fabrica extends  CreadorAbstracto{
	
	
	
	public void Creador() {
	}
    // -------------------------------------------

	@Override
	public Pizza crear(int tipo) {
		
		Pizza objeto;
		switch( tipo )
        {
		
        	case PIZZACONPI�A:
        		objeto = new PizzaConPi�a();
        		break;
		
        	case PIZZAPICANTE:
        		objeto = new PizzaPicante();
        		break;
        		
        	case PIZZARANCHERA:
        		objeto = new PizzaRanchera();
        		break;
        	default:
                objeto = null;
        }
       	return objeto;
	}

}
	
	
	

