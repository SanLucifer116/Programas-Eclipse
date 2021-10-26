package Prototype;
public class Hechicero extends Enemigo
{
    public Hechicero() {
        System.out.println("Hechicero creado");
    }
    // ------------------------------
    @Override
    public void atacar() {
        System.out.println("El hechicero ataca");
    }
    // ------------------------------
    @Override
    public void detener() {
        System.out.println("El hechiero se detiene");
    }
    // ------------------------------
    @Override
     public Enemigo clonar()
    {
        /*
         * Creamos una nueva instancia y le asignamos los valores actuales para
         * despu�s devolverlo (es tambi�n de tipo 'Prototype' ya que hereda de �l)
         */
         Hechicero objHechicero = new Hechicero();
 
     objHechicero.setNombre( this.getNombre() );
         objHechicero.setArma( this.getArma() );
 
         return objHechicero;
    }
}