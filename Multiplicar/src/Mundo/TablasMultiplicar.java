package Mundo;




public class TablasMultiplicar{
	private int numero;

	public TablasMultiplicar(int pnumero) {
		super();
		this.numero = pnumero;
	}

	public int getNumero() {
		return numero;
	}
	
	public  String generartabla(int pnumero) {
		String tabla = "Tabla de Multiplicar del " + pnumero + "\n"; 
		for (int i = 1; i < 11; i++) {
			tabla+=pnumero+" X "+i+" = "+(pnumero*i)+"\n";
			
		}
		
		return tabla; 
	}
	

	public int sumatoria(int pnumero) {
		int suma = 0;
		for (int i = 1; i < 11; i++) {
			suma=(pnumero*i+suma);
		}
		
		return suma;
	}
	
}