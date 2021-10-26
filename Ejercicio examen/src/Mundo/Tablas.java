package Mundo;

import javax.swing.JOptionPane;

public class Tablas {



private int numfinal;

public Tablas ( int pNumFinal) {

numfinal = pNumFinal;

}

public int getNumfinal() {
	return numfinal;
}



public String generarTablaNumeros(int numfinal) {
	int i , cuad=1, cubo=1;
	String str= "";
	
	for (i =1 ; i<=numfinal; i++) {
		
		//cuad = i*i;
		
	for ( i = 1 ;i <=2 ; i++) {
		
		cuad = cuad*i;
	}
	for ( i = 1 ;i <=3 ; i++) {
		
		cubo = cubo*i;
	}	
		
		
		
		
		//cubo = i*i*i;
		
		str = str + (" Número: " + i + " Su cuadrado: " + cuad + " Su cubo: " + cubo + "\n");
	
	}
	
	return str;
	
	
}







}
