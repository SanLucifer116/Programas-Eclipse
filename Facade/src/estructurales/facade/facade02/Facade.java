package estructurales.facade.facade02;

import estructurales.facade.facade01.Arrancar;
import estructurales.facade.facade01.ComprobarAsiento;
import estructurales.facade.facade01.ComprobarEspejos;
import estructurales.facade.facade01.ComprobarLiquidos;

public class Facade
{
    private ComprobarLiquidos liquidos;
    private ComprobarAsiento asiento;
    private ComprobarEspejos espejos;
    private Arrancar arrancar;

    // --------------------------------

    public Facade()
    {
        this.liquidos = new ComprobarLiquidos();
        this.asiento  = new ComprobarAsiento();
        this.espejos  = new ComprobarEspejos();
        this.arrancar = new Arrancar();
    }

    // --------------------------------

    public void arrancarCoche()
    {
        liquidos.comprobar();
        asiento.comprobar();
        espejos.comprobar();
        arrancar.encenderContacto();
    }
}
