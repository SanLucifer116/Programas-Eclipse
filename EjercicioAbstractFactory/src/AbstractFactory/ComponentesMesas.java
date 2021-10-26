package AbstractFactory;

public class ComponentesMesas implements Componentes  {
	public ComponentesMesas() {
    }
    // -------------------------------
     public Boton getBoton() {
        return new BotonAzul();
    }
    // -------------------------------
     public Lista getLista() {
        return new ListaAzul();
    }
}
