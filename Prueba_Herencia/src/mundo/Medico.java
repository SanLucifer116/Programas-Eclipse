package mundo;

public class Medico extends Empleado {
	private String Especialidad;
	private String Hospital;
	private double Aumento_Especialidad;

	public Medico (String Cedula, String Nombre,String Ciudad, double Salario, String P_Especialidad, String p_Hospital, double P_Aumento_Especialidad ) {
		super (Cedula, Nombre, Ciudad , Salario);
		Especialidad = P_Especialidad;
		Hospital = p_Hospital;
		Aumento_Especialidad = P_Aumento_Especialidad=5;
	}
	public String getEspecialidad () {
		return Especialidad;
	}
	public String getHospital () {
		return Hospital;
	}
	public double get_Aumento () {
		return Aumento_Especialidad;
	}
	
	
}
