package Prototype01;

public class STactico extends Soldado {

	public STactico() {
		System.out.println("Soldado tactico creado");
	}
	
	public void disparar() {
		System.out.println("El soldado tactico empienza a disparar");
	}
	
	public void retirar() {
		System.out.println("El soldado tactico empieza a retirarse");
	}
	
	public Soldado clonar()
	{
		//Se crea una nueva instancia y se le asigna los valores de ahora para despues devolverlo aca vemos lo de Prototype ya que hereda de éll 

		STactico objSTactico = new STactico();
		objSTactico.setNombre(this.getNombre());
		objSTactico.setArma(this.getArma());
	return objSTactico;
	}
}
