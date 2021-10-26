package AbstractFactory;

public class ComponentesSillas implements Componentes {
	{
        public ComponentesSillas() {
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
}
