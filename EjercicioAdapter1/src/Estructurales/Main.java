package Estructurales;


public class Main {
    public static void main(String[] args)
    {
    	IAdaotador gE = new GuitarraElectrica(); // SE LLAMA LAS CLASES AL MAIN PARA IMPRIMIR
    	gE.encerder();
    	gE.apagar();
        System.out.println( "------------------------" );
    	IAdaotador gA = new Adaptador();// SE LLAMA LAS CLASES AL MAIN PARA IMPRIMIR
    	gA.encerder();
    	gA.apagar();
        System.out.println( "------------------------" );


        System.out.println( "-Fin Proceso!!!-" );
    }
}
