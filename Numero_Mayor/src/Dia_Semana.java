import javax.swing.JOptionPane;

public class Dia_Semana {

	public static void main(String[] args) {
		
		int numdia;
		String semana= "";
		
		
		
		
		numdia = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite un número entre 1 y 7  incluyendolos"));
		
		if (numdia ==1) 
			  semana="lunes";
		else if (numdia ==2)
				 semana = "Martes";
			 else if (numdia ==3)
				 	 semana = "Miercoles";
				  else if (numdia ==4)
					  	  semana = "Jueves";
					   else if (numdia ==5)
						       semana = "Viernes";
							else if (numdia ==6)
								    semana = "Sabado";
							     else if (numdia ==7)
							    	   semana = "Domingo";	
	                                else
	                               		//JOptionPane.showMessageDialog(null, "");
	                                	semana = "¡ERROR!, número fuera del rango de día de la semana ";
		
		JOptionPane.showMessageDialog(null, "Dia : " + semana);						
           
								
	JOptionPane.showMessageDialog(null, "------Fin Programa---------");		
		
		
		
		
		
		
		
		
		
		

	}

}
