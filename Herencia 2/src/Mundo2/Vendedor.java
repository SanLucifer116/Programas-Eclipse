package Mundo2;

public class Vendedor extends Empleado {
	
	
	private double valorComision, salariobasic, valorventa;
	public Vendedor(String cedula, String nombre, double salario,  double pSalariobasic, double pValorVenta){
	super(cedula, nombre, salario);
	
	valorventa =  pValorVenta;
	salariobasic = pSalariobasic;
	}
	public double getValorComision() {
		return valorComision;
	}
	public double getSalario() {
		return salariobasic;
	}
	
	public double getValorventa() {
		return valorventa;
	}
	public double calcularComsion(){
		double comision=0.0;
		
		if ( valorventa <=1000000)
			comision = valorventa * 0.05;
		else if (valorventa > 1000000)
			comision = valorventa * 0.1;
			else
				comision= valorventa*0.2;
		return ( salariobasic + comision );
				

	
	

 }
	@Override
	public double calcularSalario() {
		// TODO Auto-generated method stub
		return 0;
	}
}