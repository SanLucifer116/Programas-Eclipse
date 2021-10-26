package AbstractFactory;

public class MesaModerna {
	public MesaModerna()
    {
        this.configurar();
 		this.eliminar();

    }
    // ------------------------------
     public void configurar()
    {
        System.out.println("Ensamblando MESA estilo MODERNA");
    }
 
    public void eliminar() {
    	
    System.out.println("Destruyendo Mesa");
		
    }
}
