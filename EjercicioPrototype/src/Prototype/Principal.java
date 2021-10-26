package Prototype;

public class Principal {

	public static void main(String[] args) {
		CuentaAHImpl cuentaAhorro = new CuentaAHImpl();
		cuentaAhorro.setMonto(10500);
		CuentaAHImpl cuentaAhorro2 = new CuentaAHImpl();
		cuentaAhorro2.setMonto(500);
		//================================================
		//SE INSTANCIA LA CUENTA CLONADA
		//SE REALIZA UN CASTEO DE CuentaAHImpl PARA QUE PUEDA RECONCER LA INSTANCIA 
	    // Y ASI PUEDA CLONAR ENVIANTO AL METODO Clonar() 
		CuentaAHImpl cuentaClonada = (CuentaAHImpl) cuentaAhorro.Clonar();
		
		
        System.out.println("Cuenta de Ahorro: ");
        System.out.println(cuentaAhorro);
        System.out.println("================ ");

        System.out.println("Cuenta de Ahorro 2 : ");
        System.out.println(cuentaAhorro2);
        System.out.println("================ ");

        System.out.println("Cuenta de Ahorro Clonada: ");
        System.out.println(cuentaClonada);




	}

}
