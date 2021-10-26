package Estructurales;

public class Adaptador implements IAdaotador{

	// CLASE PARA ADAPTAR LA CLASE INCOMPATIBLE, EN ESTE CASO, GUITARRA
	GuitarraAcustica acustica = new GuitarraAcustica();
	
	
	
	public Adaptador() {
    }



	@Override
	public void encerder() {
		acustica.tocarGuitarra(); // COMO SE ADAPTA AL METODO
		
	}



	@Override
	public void apagar() {
		acustica.dejarGuitarra();  // COMO SE ADAPTA AL METODO		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
