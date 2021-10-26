package Clases;
//PRODUCTO CONCRETO
import javax.swing.JOptionPane;

import AbstractFactory.ServicioVuelos;

public class VuelodeNegocios implements ServicioVuelos {

	private int codigo;
	 
	 public int generarCodigo() {
	
	  int codigoVue=(int) (Math.random()*9999);
	  return codigoVue;
	 }
	 public int getCodigo() { // MIRAR DESPUES PARA EXAMEN 
	  return codigo;
	 }
	 public void setCodigo(int codigo) {
	  this.codigo = codigo;
	 }
	 @Override
	 public void asignarVuelo() {
		 JOptionPane.showMessageDialog(null," Codigo del Vuelo a PAGAR: " + getCodigo()+
				 "\n************************\n"+
				 " Se permitira escoger la fecha de vuelo una vez pagado" +
				 "\n************************\n"+
				 " Puede realizar el pago con el codigo dado en www.AAAAAA.com"+ 
				 "\n************************\n"+
				 " Precio a Pagar: $" + Math.random()*99 );

	
 }
} 
