package Controlador;

import Modelo.Serie;
import Vista.SerieView;



	public class SerieController {
    

    private Serie modelo;
    private SerieView vista;

    public SerieController ( Serie pModelo, SerieView pVista){
 
     modelo = pModelo;
     vista = pVista;
  
 
    }


 	public int getMin() {
        return modelo.getMin();
    }

    public void setMin(int min) {
        this.modelo.setMin(min);
    }

    public String getNombre() {
        return modelo.getNombre();
    }

    public void setNombre(String nombre) {
        this.modelo.setNombre(nombre);
    }

    public int getA�o() {
        return modelo.getA�o();
    }

    public void setA�o(int a�o) {
        this.modelo.setA�o(a�o);
    }




	public void ActualizarVista(){
 
	 vista.imprimirDatosCliente(modelo.getMin(),modelo.getNombre(), modelo.getA�o());
 
 
 
 }
}