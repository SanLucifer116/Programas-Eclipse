import javax.swing.JOptionPane;

public class Numero_Mayor {

	public static void main(String[] args) {
		
		int a,b,c,may=0, sw=0;
		
		
		
		JOptionPane.showMessageDialog(null, "Progrma que define cual número es mayor");
		a =Integer.parseInt(JOptionPane.showInputDialog(null, "Digite un numero A"));
		b =Integer.parseInt(JOptionPane.showInputDialog(null, "Digite un numero B"));
		c =Integer.parseInt(JOptionPane.showInputDialog(null, "Digite un numero C"));
		
		
		if ((a==b) && (b==c)) {
			JOptionPane.showMessageDialog(null, "Ningun numero es mayor");
			sw = 1;
		}
		else if	 (a>b)
			    if (b>c)
			    	may=a;
			    else
			    	may=a;
	
			else if (b>c)
			
				    may=b;
		
				else if (c>b)
				   
						may=c;
		if (sw ==0)
		
			JOptionPane.showMessageDialog(null, may+ " Es el numero mayor");
		
		
		JOptionPane.showMessageDialog(null, "<----------Fin Programa----------->");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
