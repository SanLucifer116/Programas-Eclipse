package Interfaz;

import javax.swing.JOptionPane;

import Mundo.mundo;

// SEBASTIAN ARAGON MONDOL, ELIANA VANESSA ALMONACID, CESAR LUIS SANCHEZ, ERICK SANTIAGO RODRIGUEZ

public class InterfazEmpresaTursitica {

	public static void main(String[] args) {
		double tarifabasica, valorpasaje =0, vlrtotal=0;
		String temporada;
		String aerolinea;
		String estudiante;
		int edadpasajero, pa =0, pv=0;
		boolean bolstatus = true;
		String otro= " ";
		

		do {
			
			tarifabasica = Double.parseDouble(JOptionPane.showInputDialog("Tarifa Basica"));
			do {
				temporada  = JOptionPane.showInputDialog(null, " Es temporada alta?  S/N")	;
			  	
				 bolstatus =! ((temporada.equalsIgnoreCase("S")) || (temporada.equalsIgnoreCase("N")));
			  
			   	}while (bolstatus);
			
			do {
				aerolinea  = JOptionPane.showInputDialog(null, " A= Alas/ V= Volar")	;
			  	
				 bolstatus =! ((aerolinea.equalsIgnoreCase("A")) || (aerolinea.equalsIgnoreCase("V")));
			  
			   	}while (bolstatus);
			
					
			do {
				estudiante = JOptionPane.showInputDialog(null, "Es estudiante ? S= Si/ N= No");
			  	
				 bolstatus =! ((estudiante.equalsIgnoreCase("S")) || (estudiante.equalsIgnoreCase("N")));
			  
			   	}while (bolstatus);
			
			edadpasajero = Integer.parseInt(JOptionPane.showInputDialog("Edad del pasajero"));
			
			
			JOptionPane.showMessageDialog(null, " Valor pasaje" + valorpasaje );
			
			
			
			do {
				 otro = JOptionPane.showInputDialog(null, " Vender otro tiquete? S/N")	;
			  	
				 bolstatus =! ((otro.equalsIgnoreCase("S")) || (otro.equalsIgnoreCase("N")));
			  
			   	}while (bolstatus);
			 	
			
			
		
		
		
		}while( (otro.equalsIgnoreCase("S") ));
									
			
			mundo mundo1= new mundo (tarifabasica, aerolinea, estudiante,edadpasajero );
			
		JOptionPane.showMessageDialog(null, " El total de pasajes vendidos por la aerolinea Alas es: " +mundo1.calculoaerolineaA () + "\n El total de pasajes vendidos por la aerolinea Volar es:"+ mundo1.calculoaerolineaV() 
				+ "\n El valor total vendido por la agencia es de:" + mundo1.valortotal()	);
		
			
			
			
			
		
		
		
		
		
		
	}

}
