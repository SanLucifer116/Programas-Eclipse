package estructurales.facade.facade01;

public class Main
{
    public static void main(String[] args)
    {
        ComprobarLiquidos liquidos = new ComprobarLiquidos();
        liquidos.comprobar();

        ComprobarAsiento asiento = new ComprobarAsiento();
        asiento.comprobar();

        ComprobarEspejos espejos = new ComprobarEspejos();
        espejos.comprobar();

        Arrancar arrancar = new Arrancar();
        arrancar.encenderContacto();

        System.out.println("\nProceso finalizado.");
    }
}