package Interfaz;                                                                                                                  
                                                                                                                                
public class Pelicula {                                                                                                         
	                                                                                                                            
	private String titulo;                                                                                                      
	private String protagonista;                                                                                                
	private String genero;                                                                                                      
	private int duracion;                                                                                                       
	private double costoProduccion;                                                                                             
	private String tresD;                                                                                                       
	                                                                                                                            
	                                                                                                                            
	                                                                                                                            
	public Pelicula(String pTitulo, String pProtagonista, String pGenero, int pDuracion, double pCostoProduccion,  String pTresD) {
	}
	{                                                                                                                           
	titulo = getTitulo();	                                                                                                        
	protagonista = getProtagonista();                                                                                               
	genero = getGenero();                                                                                                           
	duracion = getDuracion();                                                                                                       
	costoProduccion = getCostoProduccion();                                                                                         
	tresD = isTresD();                                                                                                             
		                                                                                                                        
	}                                                                                                                           
                                                                                                                                
                                                                                                                                
                                                                                                                                
	public String getTitulo() {                                                                                                 
		return titulo;                                                                                                          
	}                                                                                                                           
                                                                                                                                
                                                                                                                                
                                                                                                                                
	public String getProtagonista() {                                                                                           
		return protagonista;                                                                                                    
	}                                                                                                                           
                                                                                                                                
                                                                                                                                
                                                                                                                                
	public String getGenero() {                                                                                                 
		return genero;                                                                                                          
	}                                                                                                                           
                                                                                                                                
                                                                                                                                
                                                                                                                                
	public int getDuracion() {                                                                                                  
		return duracion;                                                                                                        
	}                                                                                                                           
                                                                                                                                
                                                                                                                                
                                                                                                                                
	public double getCostoProduccion() {                                                                                        
		return costoProduccion;                                                                                                 
	}                                                                                                                           
                                                                                                                                
                                                                                                                                
                                                                                                                                
	public String isTresD() {                                                                                                   
		return tresD;                                                                                                           
	}                                                                                                                           
	                                                                                                                            
	public double calcularImpuesto() {                                                                                          
		                                                                                                                        
		double impuesto = costoProduccion*0.19;                                                                                 
		                                                                                                                        
		return impuesto;                                                                                                        
		                                                                                                                        
	}                                                                                                                           
	                                                                                                                            
	                                                                                                                            
	public double calcularAumentoCostoProd() {                                                                                  
		double incre, incre2=0;                                                                                                 
		                                                                                                                        
		 if (duracion >100)                                                                                                     
		 	incre = costoProduccion*0.09;                                                                                       
		 else                                                                                                                   
			 if ((duracion > 90) && (duracion <=100 ))                                                                          
				 incre = costoProduccion*0.05;                                                                                  
			 else                                                                                                               
		 			incre =0;                                                                                                   
		 if (tresD=="S")                                                                                                        
		 	incre2	 = costoProduccion*0.01;                                                                                    
	return (costoProduccion + incre + incre2);                                                                                  
		                                                                                                                        
	}                                                                                                                           
	                                                                                                                            
	                                                                                                                       
	                                                                                                                            
	                                                                                                                            
}	                                                                                                                            
	                                                                                                                            
	                                                                                                                            
	                                                                                                                            
	                                                                                                                            
	                                                                                                                            
	                                                                                                                            
	                                                                                                                                                                                                                                       
	                                                                                                                            
	                                                                                                                            
	                                                                                                                            
	                                                                                                                            
	                                                                                                                            
                                                                                                                             
                                                                                                                                