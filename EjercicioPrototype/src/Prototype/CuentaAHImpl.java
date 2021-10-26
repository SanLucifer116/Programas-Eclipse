package Prototype;
// SE IPLEMENTARA LA CLONACION
public class CuentaAHImpl  implements ICuenta{

	private String tipo; //ATRIBUTO A MOSTRAR
	private double monto;// ATRIBUTO A MOSTRAR
	
	public CuentaAHImpl() {
		tipo = "Ahorro";
		
		
	}

	//METODO DE CLONACION 
	@Override
	public ICuenta Clonar() {
		CuentaAHImpl cuenta = null; // SE DECLARA VARIABLE CUENTA DE TIPO CuentaAHImpl
		
		//ESTO ES LO MAS IMPORTANTE PARA LA CLONACION
		try {
			
			cuenta=(CuentaAHImpl) clone();// SE LLLAMA AL MEOTOD CLONE PROPIO DE JAVA PARA HACER LA CLONACION DE CuentaAHImpl 
									 	  //Y GUARDARLO EN LA VARIBALE CUENTA 
		}catch (CloneNotSupportedException e) { // SI LA CLONACION NO ES ACEPTADA AROJARA ESTE MENSAJE
			e.printStackTrace(); //EXCEPCION LANZADA SI NO EXISTE " EXTENEDS CLONEABLE"
		}
		return cuenta; // SE RETORNA LA INSTANCIA CLONADA
	}
	// METODO PARA MOSTRAR LOS CONTEDIOS DEL OBJETO
	@Override
	public String toString() {
		return "CuentaAHImpl [tipo=" + tipo + ", monto=" + monto + "]";
	}
// GET Y SET PARA MONTO 
	public double getMonto() {
		return monto;
	}

	public void setMonto(double monto) {
		this.monto = monto;
	}
	
	
	

}
