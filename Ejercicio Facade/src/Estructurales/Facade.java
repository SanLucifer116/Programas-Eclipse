package Estructurales;

public class Facade {

	
	
	private AgregarIngredientes ingre;
	private PrepararPizza pizza;
	private CocinarPizza cpizza;
	private Emplatar emplatar;
	
	public Facade()
    {
		
		ingre = new AgregarIngredientes();
		pizza= new PrepararPizza();
		cpizza = new CocinarPizza();
		emplatar = new Emplatar();
		
		
    }
	
    public void PrepararPizza() {
    	
    	ingre.comprobar();
    	pizza.comprobar();
    	cpizza.comprobar();
    	emplatar.EmplatarPizza();
    	
    	
    }


	
}
