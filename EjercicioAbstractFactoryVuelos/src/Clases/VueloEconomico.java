package Clases;
import javax.swing.JOptionPane;

import AbstractFactory.ServicioVuelos;
//PRODUCTO CONCRETO

public class VueloEconomico implements ServicioVuelos {
	 private int codigo;
	 public int generarCodigo() {
	  int codigoVue=(int) (Math.random()*9);
	  return codigoVue;
	 }
 	 public int getCodigo() {
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
				 " Precio a Pagar: $" + Math.random()*9 );
	 }

	
}
