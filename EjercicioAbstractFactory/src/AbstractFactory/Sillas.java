package AbstractFactory;

public abstract  class Sillas {
	private String texto;
	
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
        System.out.println("Espere un momento, Construyendo Sillas");
    }
    // -------------------------------
    // Método a implementar por las clases que hereden
     public abstract void configurar();
     public abstract void eliminar();

}
