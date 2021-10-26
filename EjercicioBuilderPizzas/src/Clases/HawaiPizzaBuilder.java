package Clases;
// CONSTRUCOTR CONCTRETO QUE HEREDA DE CONSTRUCTOR ABASTRACTO ( ABSTRACT BUILD)
public class HawaiPizzaBuilder extends PizzaBuilder {

	@Override
	public void buildMasa() {
		pizza.setMasa(" Suave");
	}

	@Override
	public void buildSalsa() {
		pizza.setSalsa(" Dulce");		
	}

	@Override
	public void buildRelleno() {
		pizza.setRelleno(" Jamon y Piña ");
	}

}
