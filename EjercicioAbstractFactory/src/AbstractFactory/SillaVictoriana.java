package AbstractFactory;

public class SillaVictoriana extends Sillas {
	public SillaVictoriana()
    {
        this.configurar();
 		this.eliminar();

    }
    // ------------------------------
     public void configurar()
    {
        System.out.println("Ensamblando SILLA estilo VICTORIANA\"");
    }
 
    public void eliminar() {
    	
    System.out.println("Silla Construida Satisfactoriamente");
		
    }
}
