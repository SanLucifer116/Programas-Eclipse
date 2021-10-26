package Comportamiento;
//CLASE QUE HEREDA DE CUENTABANCO
public class Cajero extends CuentaBancaria{
	
	//CONSTRUCTOR QUE RECIBE LOS PARAMETROS PARA REALIZAR PROCESO DE CONSIGNACION O RETIRO
	public Cajero(String cuenta, int saldo, int tipoOperacion, int valorACanjear) {
		super(cuenta, saldo, tipoOperacion, valorACanjear);
	}

	//AL SER CAJERO AUTOMATICO SOLICITARA EL INGRESO DE DATOS/ SE SOBREESCRIBE 
	@Override
	public void saludar() {
		System.out.println("\n\t¡Bienvenido, gracias por preferirnos!" +"\n");
		
	}

}
