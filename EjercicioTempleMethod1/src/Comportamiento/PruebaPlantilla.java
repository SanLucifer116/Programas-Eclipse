package Comportamiento;

public class PruebaPlantilla {
	public static void main(String[] args){
	System.out.println("\t****** Cajero Automatico ******");
	// ESTO ES EN CAJERO AUTOMATICO
	// CONSIGANCIONES
	// SE LE MANDA UN VALOR DE 10000000 PARA INICIALIZAR MONTOCAJERO
	CajeroAutomatico cajeroAuto2 =new CajeroAutomatico(10000000,"F678AB", 400000, 1,600000);
	cajeroAuto2.procesar();
	CajeroAutomatico cajeroAuto3 =new CajeroAutomatico(1000000,"Z634AB", 600000, 1,200000);
	cajeroAuto3.procesar();
	
	System.out.println("======================================================\n");
	
	
	//RETIROS DE CAJERO AUTOMATICO
	
	// SE LE DA UN VALOR DE 10000000 AL MONTO DEL CAJERO
	//ESTE ENTRA
	CajeroAutomatico retiroCajeroAuto1=new CajeroAutomatico(10000000,"1193555", 800000, 2,300000);
	retiroCajeroAuto1.procesar();
	
	// retiroCajeroAuto1.getMontoCajero() TRAE EL VALOR QUE QUEDA DE MONTO DEL CAJERO DE LA PRIMERA INSTANCIA, ASI SUCESIVAMENTE CON LAS OTRAS INSTANCIAS
	//ESTE FALLA
	CajeroAutomatico retiroCajeroAuto2 =new CajeroAutomatico(retiroCajeroAuto1.getMontoCajero(),"AS21271AB", 0, 2,300000);
	retiroCajeroAuto2.procesar();
	
	//ESTE FALLA
	CajeroAutomatico retiroCajeroAuto3=new CajeroAutomatico(retiroCajeroAuto2.getMontoCajero(),"12312312", 100000, 2,350000);
	retiroCajeroAuto3.procesar();
	// ESTE ENTRA
	CajeroAutomatico retiroCajeroAuto4 =new CajeroAutomatico(retiroCajeroAuto3.getMontoCajero(),"112asd55", 800000, 2,700000);
	retiroCajeroAuto4.procesar();
	//ESTE NO ENTRA
	CajeroAutomatico retiroCajeroAuto5=new CajeroAutomatico(retiroCajeroAuto4.getMontoCajero(),"1780iiu", 800000, 2,1200000);
	retiroCajeroAuto5.procesar();
	//ESTE NO ENTRA
	// CAMBIAR VALOR A CANJEAR POR : 900000000 PARA QUE SE MUESTRE LA VALIDACION DE SALDO INSUFICIENTE DEL CAJERO
	CajeroAutomatico retiroCajeroAuto6=new CajeroAutomatico(retiroCajeroAuto5.getMontoCajero(),"112asd55", 800000, 2,900000000);
	retiroCajeroAuto6.procesar();
	
	
	System.out.println("======================================================\n");
// ESTO ES PARA CAJERO DEL BANCO
	System.out.println("\n\t****** Cajero ******");
    Cajero cajero = new Cajero ("34523GH", 25000,2,10000);
    cajero.procesar();
    
    System.out.println();
    Cajero cajero1 = new Cajero ("87695PH", 890000,1,22000);
    cajero1.procesar();
    
 
	



	}
}