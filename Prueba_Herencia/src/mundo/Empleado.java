package mundo;
public abstract class Empleado{
private String Cedula;
private String Nombre;
private String Ciudad;
private double Salario;

public Empleado(String P_Cedula, String P_Nombre,  String P_Ciudad,double P_Salario)
{
Cedula = P_Cedula;
Nombre= P_Nombre;
Ciudad = P_Ciudad;
Salario = P_Salario;
}

public String getCedula()
{
return Cedula;
}
public String getNombre()
{
return Nombre;
}
public String getCiudad()
{
return Ciudad;
}
public double getSalario()
{
return Salario;
}
public void setSalario(double P_Salario)
{
Salario = P_Salario;
}
}

