package com.ecodeup.bo;

import java.util.ArrayList;
import java.util.List;

import com.ecodeup.vo.JugadorVO;

public class JugadorBO {
List<JugadorVO> jugadores;

public JugadorBO(){
jugadores=new ArrayList<>();
JugadorVO jugador1= new JugadorVO(“Argentina”, “Lionel” , “Messi”, “4”);
JugadorVO jugador2=new JugadorVO(“Colombia” , “James”, “Rodriguez”, “0”);
JugadorVO jugador3=new JugadorVO(“Brasil” , “ “Neymar” , “Junior” , “ 5”);
JugadorVO jugador4=new JugadorVO(“Colombia” , “Luis” , “Diaz” , “6”);
jugadores.add(jugador1);
jugadores.add(jugador2);
jugadores.add(jugador3);
jugadores.add(jugador4);
}
public void eliminarJugador(JugadorVO jugador) {
jugadores.remove(jugador.getPais());
System.out.println(“Jugador”+jugador.getPais()+”Eliminado correctamente”);
}
public List <JugadorVO>obtenerJugadores(){
return jugadores;
}
public JugadorVO obtenerJugador(String pais){
return jugadores.get(pais);
}
public void actualizarJugador(JugadorVO jugador) {
jugadores.get(jugador.getPais()).setNombre(jugador.getNombre());
jugadores.get(jugador.getPais()).setApellido(jugador,getApellido());
jugadores.get(jugador.getPais()).setGoles(jugador,getGoles());
System.out.println(“Jugador pais: “ + jugador.getPais()+”Actualizado correctamente”);
}
}