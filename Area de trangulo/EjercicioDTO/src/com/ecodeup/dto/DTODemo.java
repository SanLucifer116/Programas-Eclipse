package com.ecodeup.dto;

import com.ecodeup.bo.JugadorBO;
import com.ecodeup.vo.JugadorVO;

public class DTODemo {
public static void main (String [] args) {

JugadorBO jugadorBusinessObject = new JugadorBO();

jugadorBusinessObject.obtenerJugadores().forEach(System.out::println);
}
}