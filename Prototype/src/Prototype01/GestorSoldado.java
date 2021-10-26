package Prototype01;
import java.util.Hashtable;
public class GestorSoldado {
		//Esto es para almacernar los onjetos que se van creando
	private Hashtable<String, Soldado> hSoldados = new Hashtable<String, Soldado>();
	
	public GestorSoldado()
	{
		//Se crea un soldado tactico 
		Soldado h1 = new STactico();
		h1.setNombre("Francotirador1");
		
		//se guarda
		this.addSoldado( h1.getNombre(), h1 );
		
		//Se crea un Soldado de artilleria 
		Soldado g1= new SArtilleria();
		g1.setNombre("Soldado1");
		g1.setArma("Ak47");
		
		//Se guarda
		this.hSoldados.put(g1.getNombre(), g1 );		
	}
	
	public void addSoldado( String nombre, Soldado objSoldado )
	{
		this.hSoldados.put(nombre, objSoldado);
	}
	
	
	public Soldado getSoldado( String nombre )
	{
		Soldado objPrototipo = (SArtilleria) hSoldados.get( nombre );
		return objPrototipo;
	}
	
	
	public Soldado getClon( String nombre)
	{
		//Localizar el objeto deseado
		Soldado objPrototipo = (SArtilleria) hSoldados.get( nombre );
		
		//Devolver clon
		return (Soldado) objPrototipo.clonar();
	}
	}
	
