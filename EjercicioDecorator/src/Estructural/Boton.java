package Estructural;
//ComponenteConcreto 
public class Boton  implements Iboton {
	
	public Boton(){
		
	}

	@Override
	public void decorar(int dere, int izque) {
        System.out.println("Configrando botones en  [" + dere + "], [" + izque + "]" );

	} 

	
}
