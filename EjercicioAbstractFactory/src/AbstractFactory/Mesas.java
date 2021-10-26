package AbstractFactory;

public abstract class Mesas {
	private String texto;
    // -------------------------------
    public String getTexto() {
        return this.texto;
    }
    // -------------------------------
    public void setTexto(String texto) {
        this.texto = texto;
    }
    // -------------------------------
    public void dibujar()
    {
        System.out.println("Espere un momento, Construyendo Mesas");
    }
    // -------------------------------
    // Método a implementar por las clases que hereden
     public abstract void configurar();
     public abstract void eliminar();

}
