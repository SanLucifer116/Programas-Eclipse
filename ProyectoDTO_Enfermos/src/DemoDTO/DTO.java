package DemoDTO;


import BusinessObject.Enfermos_BO;

import ValueObject.Enfermos_VO;


    public class DTO {
        public static void main(String[] args) {
        	System.out.println("USUARIOS EN EL SISTEMA");
        	Enfermos_BO enfermosBO = new Enfermos_BO();
        	enfermosBO.obtenerUsuario().forEach(System.out::println);
        	
        	System.out.println("****");
// ACTUALIZAR       	
        	Enfermos_VO enfermo = enfermosBO.ObtenerUsuario(0);
        	enfermo.setNombre(" Juan Samper"); 
        	enfermosBO.ActualizarUsuario(enfermo);
 //OBTENER       	
        	System.out.println("****");
        	enfermo=enfermosBO.ObtenerUsuario(0);
        	System.out.println(enfermo);

// ELIMINAR 
        	System.out.println("****");
        	enfermo=enfermosBO.ObtenerUsuario(0);
        	enfermosBO.eliminarUsuario(enfermo);

        	
        	
        	
        	
      }
        
        
    }     
        
        
        
        
        
        
        
        
        
        
        
        
        

    
