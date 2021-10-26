package Prototype;
public class Guerrero extends Enemigo
{
    public Guerrero() {
        System.out.println("Guerrero creado");
    }
    // ------------------------------
    @Override
    public void atacar() {
        System.out.println("El guerrero ataca");
    }
    // ------------------------------
    @Override
    public void detener() {
        System.out.println("El guerrero se detiene");
    }
    // ------------------------------
    @Override
     public Enemigo clonar()
    {
        /*
         * Creamos una nueva instancia y le asignamos los valores actuales para
         * despu�s devolverlo (es tambi�n de tipo 'Prototype' ya que hereda de �l)
         */
         Guerrero objGuerrero = new Guerrero();
 
     objGuerrero.setNombre( this.getNombre() );
         objGuerrero.setArma( this.getArma() );
 
         return objGuerrero;
    }
}
