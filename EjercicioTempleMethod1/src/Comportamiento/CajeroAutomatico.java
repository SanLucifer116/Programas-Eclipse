package Comportamiento;
//CLASE QUE HEREDA DE CUENTABANCARIA
public class CajeroAutomatico extends CuentaBancaria{
	private double montoCajero;
	static final double valorMaximoRetirar=1000000;
	//CONSTRUCTOR QUE RECIBE LOS PARAMETROS PARA REALIZAR PROCESO DE CONSIGNACION O RETIRO
	// SE AGREGA MONTOCAJERO PARA INICIALIZAR EL ATRIBUTO EN EL CONSTRUCTOR 
	public CajeroAutomatico(double montoCajero ,String cuenta, double saldo, int tipoOperacion, double valorACanjear) {
		super(cuenta, saldo, tipoOperacion, valorACanjear);
		this.montoCajero = montoCajero;
	}
	
	
//	
	public double getMontoCajero() {
		return montoCajero;
	}
	public void setMontoCajero(double montoCajero) {
		this.montoCajero = montoCajero;
	}
	
	@Override
	// SOBREESCRITURA DEL METODO RETIRAR, SE VALIDARA EL VALOR A RETIRAR, EL SALDO DISPONIBLE EN CUENTA, MONTO DEL CAJERO Y VALOR MAXIMO A RETIRAR
	//SE HACE UNA SOBREESCRITURA DE RETIRAR YA QUE AL SER UN CAJERO AUTOMÁTICO TIENE CIERTO LIMITE DE DINERO
	public void retirar() {
		System.out.println("Monto Cajero: " + montoCajero);
		System.out.println("Tipo de Transacción: Retiro");
		System.out.println("Saldo Actual: "+this.getSaldo());
		System.out.println("Valor a Canjear:"+this.getValorACanjear());
		

		if (montoCajero >=this.getValorACanjear() ) {
			if (this.getValorACanjear() <= valorMaximoRetirar) {
				if (this.getValorACanjear() <= this.getSaldo()) {
					this.setSaldo(this.getSaldo() - this.getValorACanjear());
					montoCajero -= this.getValorACanjear();
					System.out.println("Nuevo Monto Cajero: " + montoCajero);

				} else {
					System.out.println("\tSu Saldo es Insuficiente!");

				}
			} else {
				System.out.println("\tTrasacción Rechazada, Excede al Monto Máximo de Retrio");

			}
		} else {
			System.out.println("\tSaldo Insuficiente por Parte del Cajero");

		}

	}
	
	@Override
	public void consignar() { 
		// PARA NO VOLVER A ESCIRBIR LAS INTRUCIONES QUE ESTAN EN CONSIGNAR DE LA CLASE PADRE SE REALIZA LO SIGUIETE:
		super.consignar();
		// LUEGO SE ADICIONA LA SOBREESCRITURA
		montoCajero = montoCajero+this.getValorACanjear();
		
		
	}


	//AL SER CAJERO AUTOMATICO SOLICITARA EL INGRESO DE DATOS/ SE SOBREESCRIBE 
	@Override
	public void saludar() {
		System.out.println("      \n  \t¡Bienvenido a su Cajero Automatico!"+"\n"+
							"               ¡Mensaje de Advertencía!\n"+ 
				            "  Por su Seguridad no deje que terceros manipulen su tarjeta \n\n" );
		

	}




	

}
