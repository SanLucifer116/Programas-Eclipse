package Mundo2;


	public class Profesor extends Empleado {
		private int numHoras;
		private double valorHora;
		public Profesor(String cedula, String nombre, double salario, int pNumHoras, double pValorHora){
		super(cedula, nombre, salario);
		numHoras=pNumHoras;
		valorHora=pValorHora;
		}
		public int getNumHoras(){
		return numHoras;
		}
		public double getValorHora(){
		return valorHora;
		}
		public double calcularSalario(){
		return numHoras * valorHora;
		}
		
		}
		
		// Ejercicio: Crear la clase Vendedor, a partir de Empleado

