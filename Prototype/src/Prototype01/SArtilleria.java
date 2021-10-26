package Prototype01;

public class SArtilleria extends Soldado
{
	public SArtilleria() {
		System.out.println("Soldado de Artilleria creado");
	}
	
	public void disparar() {
		System.out.println("El soldado de artilleria dispara");
	}
	
	
	public void retirar() {
		System.out.println("El soldado de artilleria se retira");
	}
	
	public Soldado clonar()
	{
		//Se crea una nueva instancia y se le asigna los valores de ahora para despues devolverlo aca vemos lo de Prototype ya que hereda de él
		
		SArtilleria objSArtilleria = new SArtilleria();
		objSArtilleria.setNombre(this.getNombre());
		objSArtilleria.setArma(this.getArma());
		return objSArtilleria;

	}
}