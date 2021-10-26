
package estructurales.adapter.adapter01;

public class Main
{
    public static void main(String[] args)
    {
        Adaptador conversor = new Adaptador();

        conversor.ingresarPesetas( 6000 );
        conversor.ingresarPesetas( 5000 );
        conversor.ingresarPesetas( 1000 );

        System.out.println( "Total euros: " + conversor.getSaldo() );
    }
}
