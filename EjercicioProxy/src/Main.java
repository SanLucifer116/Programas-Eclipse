public class Main {
	public static void main( String[] args )
    {
        // Abrimos un documento que puede contener una sola imagen
        Programa pro = new Programa(" Programa.exe");

        try     // Necesario al usar Thread
        {
            // Pausamos la ejecución del programa durante 3 segundos
            Thread.sleep( 2000 );

            // Simulamos que el usuario hace scroll
            pro.hacerScroll();
        }
        catch( Exception e )
        {
            System.out.println("Ha ocurrido un error");
        }
    }
}
