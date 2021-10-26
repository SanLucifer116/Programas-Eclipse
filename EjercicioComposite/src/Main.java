
public class Main {
	public static void main(String[] args)
    {
        // Crear la carpeta principal e insertar archivos
        Menu c1 = new Menu("Menu 1");
        c1.insertarNodo( new Pizza("Pizza 1 ") );
        c1.insertarNodo( new Pizza("Pizza 2") );
        c1.insertarNodo( new Pizza("Pizza 3") );

        // Crear una subcarpeta e insertar archivos
        Menu c2 = new Menu("Menu 2");
        c2.insertarNodo( new Pizza("Pizza 4") );
        c2.insertarNodo( new Pizza("Pizza 5") );

        // Insertar la subcarpeta dentro de la principal
        c1.insertarNodo( c2 );

        // Insertar otro archivo dentro de la carpeta principal
        c2.insertarNodo( new Pizza("Pizza 6") );

        c1.mostrar();

        System.out.println("--------------------");
   
     


        // Eliminamos la subcarpeta (junto con su contenido)
        System.out.println( " Eliminamos el Menu 2");
        c1.eliminarNodo( c2 );
        System.out.println("--------------------");

        c1.mostrar();
        System.out.println("--------------------");
        
        System.out.println( " Insertamos de nuevo el Menu 2");
        
        System.out.println("--------------------");
       
        Menu c3 = new Menu("Menu 2");
        c3.insertarNodo( new Pizza("Pizza 4") );
        c3.insertarNodo( new Pizza("Pizza 5") );
        c3.insertarNodo( new Pizza("Pizza 6") );
       
        c1.insertarNodo( c3 );
     

        c1.mostrar();
    }
}
