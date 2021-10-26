package Comportamiento;
//CLASE ABSTRATA QUE HERADARÁ A LAS CLASES CONCRETAS
public abstract class CuentaBancaria {
	private String cuenta="";
	private double saldo = 0;
	private int tipoOperacion =1;
	private double valorACanjear=0;

	public CuentaBancaria() {
		//super();// SIRVE PARA INICIALIZAR EL OBJETO CON LOS DATOS DADOS POR DEFECTO DE LA CLASE
	}
	
	public CuentaBancaria(String cuenta, double saldo, int tipoOperacion, double valorACanjear) {
		//super();//SIRVE PARA INICIALIZAR EL OBJETO CON LOS DATOS DADOS POR DEFECTO DEL USUIARIO
		this.cuenta = cuenta;
		this.saldo = saldo;
		this.tipoOperacion = tipoOperacion;
		this.valorACanjear = valorACanjear;
	}



	public String getCuenta() {
		return cuenta;
	}

	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public int getTipoOperacion() {
		return tipoOperacion;
	}

	public void setTipoOperacion(int tipoOperacion) {
		this.tipoOperacion = tipoOperacion;
	}

	public double getValorACanjear() {
		return valorACanjear;
	}

	public void setValorACanjear(double valorACanjear) {
		this.valorACanjear = valorACanjear;
	}
	
	

	public void consignar(){ // AUMNETA SALDO DE LA CUENTA
		System.out.println("Tipo de Transacción: Consignación");
		System.out.println("Su saldo anterior es: " + this.saldo);
		System.out.println("Valor consignación: " + this.valorACanjear);
		saldo += valorACanjear;
	}
	
	public void retirar() {
		
		System.out.println("Tipo de Transacción: Retiro");
		System.out.println("Su saldo anterior es: " + this.saldo);
		System.out.println("Valor Retiro: " + this.valorACanjear);

		if(valorACanjear <= saldo){
			saldo -= valorACanjear; // SE TRABAJAN COMO VARIABLES PORQUE SU AMBIETO Ó ESCOPE ES EN LA CLASE
		} else {
			System.out.println("No se puede retirar ese monto, Saldo insuficiente");
		}
		
	}
	
	public void consultarSaldo(){ //CONSULTAR SALDO DE CUENTA PARA PERSONA
	
		System.out.println("Su saldo actual es: " + this.saldo);
	}
	

	//METODOS ABASTRACTOS
	public abstract void saludar();
	


	//METODO PLANTILLA 
	public void procesar(){ // RECIBE LA CUENTA, VALOR A CONSIGNAR O RETIRAR Y TIPO DE OPERACION A REALIZAR 
		saludar();
		
		switch(tipoOperacion){
			case 1:
				consignar();
				break;
			case 2:
				retirar();
				break;
			default:
				System.out.println("Opcion no valida");
		}
		consultarSaldo();// SE PODRA CONSULTAR EL SALDO DESPUES DE CONSIGNACION O RETIRO
	}
}
