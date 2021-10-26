import javax.swing.JOptionPane;

public class NumerosPrimos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,x,res, conceros;
		boolean bolstatus = true;
		String  otro= " ";
		
		do {
	          conceros = 0; 	
				do {
			
					num= Integer.parseInt(JOptionPane.showInputDialog(null , " Digite un Número  "));
				}while (num <=0);
			
				for (x=1; x<=num; x++) {
					res = num % x;
					if (res==0)
						conceros++;
				}
			
			
				if (conceros <=2)
					JOptionPane.showMessageDialog(null, "El Número " +  num  + " es Primo");
				else 
					JOptionPane.showMessageDialog(null, "El Número " + num + " No es Primo" );
				
			
				do {
					 otro = JOptionPane.showInputDialog(null, " Inresar Otro Número S/N")	;
				  	
					 bolstatus =! ((otro.equalsIgnoreCase("S")) || (otro.equalsIgnoreCase("N")));
				  
				   	}while (bolstatus);
				 	
		} while( (otro.equalsIgnoreCase("S") ));


	}

}
