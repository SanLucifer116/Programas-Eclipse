package Clases;


public class Main {
	 public static void main(String[] args){
		 Director objFabrica = new Director();
		 
		 PizzaBuilder hawai = new HawaiPizzaBuilder();
		 PizzaBuilder picante = new PicantePizzaBuilder();

		 objFabrica.construir(hawai);
		 Pizza pizzahawai =hawai.getPizza();
		 
		 
		 objFabrica.construir(picante);
		 Pizza pizzapicante = picante.getPizza();
	
		 mostrarCaracteristicas(pizzahawai);
		 mostrarCaracteristicas(pizzapicante);
		 
   }
	 
	 public static void mostrarCaracteristicas( Pizza pizza )
	    {
	       
	        System.out.println( "Salsa: " + pizza.getSalsa() );
	        System.out.println( "Masa: " + pizza.getMasa() );
	        System.out.println( "Relleno: " + pizza.getRelleno() );
	   

	        System.out.println("===================================");
	    }
	 
	
}
