package Clases;
//ABSTARCT BUILDER
public abstract class PizzaBuilder {
 
	protected Pizza pizza; // SE CARACTERIZA O SE SABE QUE ES UN CONSTRUTOR ABSTARCTO 
							//POR TENER COMO ATRIBUTO A UN OBJETO DE LA CLASE PRODUCTO
	
	public Pizza getPizza() {
		
		
		return this.pizza;
		
	}
	
	public void crearPizza() {
		
		//se instancia
		this.pizza = new Pizza();		
		
	}
	
	
	// SE ENCAGRA DE ASIGNAR VALORES PREDETERMIDANOS PERO NO LOS DEFINE,
	//SOLO DELCARA EL PROTOTIPO DE LOS METODOS 
	public abstract void buildMasa();
	public abstract void buildSalsa();
	public abstract void buildRelleno();

	
	
	
	
}
