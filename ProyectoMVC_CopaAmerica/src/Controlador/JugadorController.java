
package Controlador;

import Modelo.Jugador;
import Vista.JugadorView;

public class JugadorController {
    
    private JugadorView vista;
    private Jugador modelo;

    public JugadorController(Jugador modelo, JugadorView vista) {
    this.modelo = modelo;
    this.vista = vista;

    }

    public String Pais() {
    return modelo.getPais();
    }
    public void setPais(String Pais) {
    this.modelo.setPais(Pais);
    }
    
    public String NombreJug() {
    return modelo.getNombreJug();	
    }
    
    public void setNombreJug(String NombreJug) { 	
    this.modelo.setNombreJug(NombreJug);
    }

    public int Goles() {
    return modelo.getGoles();	
    }
    
    public void setGoles(int Goles) { 	
    this.modelo.setGoles(Goles);
    }



    public void actualizarVista() {
    vista.imprimirDatosCliente(modelo.getPais(),modelo.getNombreJug(),modelo.getGoles());
    }

	
    










}
    



