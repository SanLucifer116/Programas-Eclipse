package DemoDto;

import ValueObject.Mascota_VO;
import BusinessObject.Mascotas_BO;


public class Dto {
    
    public static void main(String[] args) {
    
    //CREA EL OBJETO 
    	System.out.println("MASCOTAS EN EL SISTEMA");
    	Mascotas_BO mascotaBO = new Mascotas_BO();
        mascotaBO.obtenerClientes().forEach(System.out::println);
    
        
    // ACTUALIZAR DATOS MASCOTA
        System.out.println("****");
        Mascota_VO mascota = mascotaBO.ObtenerMascota(2);
        mascota.setRaza(" Canario");
        mascotaBO.actualizarCliente(mascota);
    
    
    // OBTIENE LAS MASCOTAS
    
        System.out.println("****");
    	mascota=mascotaBO.ObtenerMascota(2);
    	System.out.println(mascota);

        
    
   //ELIMINAR MASCOTA
    	
    	    	
    	System.out.println("****");
    	mascota=mascotaBO.ObtenerMascota(2);
    	mascotaBO.EliminarMascota(mascota);
     
    
    
    
        
     }
    
   
   }