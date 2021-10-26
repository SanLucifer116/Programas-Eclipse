package Clases;

public class PicantePizzaBuilder extends PizzaBuilder {

	public void buildMasa() {
		pizza.setMasa(" Crujiente ");
	}

	@Override
	public void buildSalsa() {
		pizza.setSalsa("BBQ");		
	}

	@Override
	public void buildRelleno() {
		pizza.setRelleno(" Chorizo ranchero");
	}

}
