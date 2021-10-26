package Estructural;

public class ElaborarFiguras extends Figura {

	public ElaborarFiguras(Color color) {
		super(color);
	
	}

	@Override
	public void dibujar() {
        System.out.println("Preparando Figura...");
		this.getColor().pintar();
	}

}
