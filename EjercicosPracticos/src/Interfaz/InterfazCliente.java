package Interfaz;

import java.util.Calendar;

import javax.swing.JOptionPane;

import Mundo.Cliente;

public class InterfazCliente {

	public static void main(String[] args) {
		
		String pNcuenta, pNombre, pTipotrans, otro, trans = " ";
	//	Calendar pFecha = null  ;
		double pValtrans, pNuvsaldo = 0, res= 0, nuvsaldo = 0;
		boolean  bolstatus;
	  double saldo = 100000;
		
		do {
			
			pNcuenta = JOptionPane.showInputDialog(null, "Digite Número de Cuenta");
			pNombre = JOptionPane.showInputDialog(null, "Digite Nombre");
		
			
					
			do {
				pTipotrans = JOptionPane.showInputDialog(null, " Tipo de transaccion C/R")	;
			  	
				 bolstatus =! ((pTipotrans.equalsIgnoreCase("C")) || (pTipotrans.equalsIgnoreCase("R")));
				 pTipotrans= pTipotrans.toUpperCase();
			   }while (bolstatus);
			
			pValtrans = Double.parseDouble(JOptionPane.showInputDialog(null, " Digite Monto"));
			

			switch (trans) {
			case "C":
			{
				nuvsaldo = nuvsaldo; 
				
			}	
			
			case ("R" ): 
				
					if ( pValtrans < 20000) 
						JOptionPane.showMessageDialog(null, " El Monto a Retirar no Esta Permitido");
				    if (res < 20000) 
									JOptionPane.showMessageDialog(null, "No hay Saldo Suficiente");
					else {
							
							
						}
				    	
			}
			
			Cliente clint = new Cliente (pNcuenta, pNombre, pTipotrans,pValtrans, pNuvsaldo );
			JOptionPane.showMessageDialog(null, " Número de la cuenta: "+clint.getNcuenta()+
					"\nNombre del cliente: "+ clint.getNombre()+"\nTipo de Transaccion: "+clint.getTipotrans()+"\nValor Transaccion: "+pValtrans+"\nSaldo Actual: "+pNuvsaldo);    

			
			do {
				 otro = JOptionPane.showInputDialog(null, " Inresar Otro Transaccion S/N")	;
			  	
				 bolstatus =! ((otro.equalsIgnoreCase("S")) || (otro.equalsIgnoreCase("N")));
			  
			   	}while (bolstatus);
			 	
		
		
			
		}while ((otro.equalsIgnoreCase("S")));
		
	}
}		


// "\nFecha: "+ clint.getFecha()