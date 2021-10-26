package Estructural;

public class Main {
	public static void main(String[] args)
    {
		
        // Crear un objeto de tipo 'AbstraccionRefinada' indicándole un 'ImplementadorConcreto'
		Figura fig = new ElaborarFiguras(new Circulo());
		fig.dibujar();

        System.out.println("_______________________"); 
        // Ahora le indicamos que use otra implementación para obtener el rectangulo
		fig.setColor(new Rectangulo());
		fig.dibujar();
		
		
        System.out.println("_______________________"); 

		
		
		
    }
}
