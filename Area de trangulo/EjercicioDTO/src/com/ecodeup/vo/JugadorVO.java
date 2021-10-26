package com.ecodeup.vo;

public class JugadorVO{
private String pais;
private String nombre;
private String apellido;
private String goles;

public JugadorVO(String pais, String nombre, String apellido, String goles) {
this.pais=pais;
this.nombre=nombre;
this.apellido=apellido;
this.goles=goles;
}
public String getPais() {
return pais;
}
public void setPais (String pais) {
this.pais=pais;
}
public String getNombre() {
return nombre;
}
public void setNombre(String nombre) {
this.nombre = nombre;
}

public String getApellido() {
return apellido;
}
public void setApellido(String apellido) {
this.apellido = apellido;
}
public String getGoles(){
return goles;
}
public void setGoles(String goles){
this.goles=goles;
}
public String toString() {
return this.getPais() + " " + this.getNombre()+" "+this.getApellido() + " "  +this.getGoles();
}
}