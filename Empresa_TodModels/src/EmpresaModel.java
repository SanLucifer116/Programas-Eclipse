
import javax.swing.*;


public class EmpresaModel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String sexo= " ", otro= " ", sex = " ";
		int edad, mujer=0, hombre=0, h=0, cg=0 , sw=0, auxedad=0, final1;
		double altura, peso1 = 0, acualt=0, auxpeso=0, phs,  proest, pfs;
		boolean bolstatus = true ;
		
		
		
		do {
	  		edad = Integer.parseInt (JOptionPane.showInputDialog(null, "Ingrese edad del participante "));
	  		altura =  Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese altura del participante "));
	  		do {
	  			sex = JOptionPane.showInputDialog("Digite genero M = Masculino F = Femenino");
	  			sex= sex.toUpperCase();
	  			bolstatus = !((sex.equalsIgnoreCase("F")) || (sex.equalsIgnoreCase("M")));
	  		}while( bolstatus);
	  	
	   		
	   			
	   		acualt += altura; cg++;
	  		switch (sex) { 
		   		case "F": 
		   			peso1 =  Double.parseDouble (JOptionPane.showInputDialog(null, "Ingrese peso de la participante "));
		   			if ((edad >=17) && (edad <=20))
		   				if  (peso1 <= 55) 
		   					if ((altura >= 1.70) && (altura <= 1.75) ) {
		   						mujer++;
		   						if (sw ==0) {
		   							auxpeso=peso1; auxedad=edad; sw = 1;
		   						} else if (auxedad>edad) {
		   							auxpeso=peso1; auxedad=edad;
		   						}
		   							
		   						
		   					}
		   		case "M":
		   			h++;
		   			if ((edad >=18) && (edad <=21))
		   				if (altura >= 1.75) 
		   					hombre++;
		   			
		   			
	   	}
	  		
	   	do {
		 otro = JOptionPane.showInputDialog(null, " Inresar Otro Participante S/N")	;
	  	
		 bolstatus =! ((otro.equalsIgnoreCase("S")) || (otro.equalsIgnoreCase("N")));
	  
	   	}while (bolstatus);
	 	
	}while( (otro.equalsIgnoreCase("S") ));
		
		 phs= (hombre*100)/(mujer+hombre);
		 pfs = (mujer*100)/(mujer+hombre);
		 proest= acualt/cg;
		
   JOptionPane.showMessageDialog(null, 
  " Se Presentaron : " + cg + " Personas " +  "\n" +
  " La mujer seleccionada tiene el peso de: " + auxpeso + " y la Edad de " + auxedad + " años" + "\n" +
  " De las " +  cg  + "Que se Presentaron, se Seleccionaron " + (mujer+hombre) +  "\n" +
  " El Total de Mujeres Selecciondas es : " +  mujer +  "\n" +
  " Porcentaje de Hombres Seleccionados es : " +  phs +  "\n" +
  " Estatura Promedio de Todos los Aspirantes es : " +  proest +  "\n" +
  " La mujer seleccionada tiene el peso de : " + auxpeso + " y la Edad de " + auxedad );

	}
	
}
	
