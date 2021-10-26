package Estructural;

//SEPARAMOS LA ABSTRACCION DE LA IMPLEMENTACIN
public abstract class Figura {
	
	Color color; // MEDIANTE ESTE OBJETO " color " QUE PERMITIRIA ACEDER A LOS METODOS Y/O SUBCLASES DE LA INTERFAZ " COLOR"
 	
	public Figura(Color color ) {
	
	this.color=color;
	}
	public Color getColor()
    {
        return this.color;
    }
	public void setColor( Color color )
    {
        this.color = color;
    }

	
	public abstract void dibujar();
}
