package AbstractFactory;

public class SillaModerna extends Sillas {

	public SillaModerna()
    {
        this.configurar();
 		this.eliminar();

    }
    // ------------------------------
     public void configurar()
    {
        System.out.println("Ensamblando SILLA estilo MODERNA");
    }
 
    public void eliminar() {
    	
    System.out.println("Destruyendo Silla");
		
    }

	
	
}
