package Prototype01;
public class Main
{
    public static void main(String[] args)
    {
         GestorSoldado objGP = new GestorSoldado();
        // Obtenemos el soldado original
         Soldado g1 = objGP.getSoldado("Soldado1");
        System.out.println("==============================");
        // Mostramos los datos
        System.out.println("El Soldado original se llama [" + g1.getNombre() + "]");
        System.out.println("Su arma es [" + g1.getArma() + "]");
        System.out.println("==============================");
        // Obtener un segundo Soldado (clon del anterior)
         Soldado g2 = objGP.getClon("Soldado2");
        // Mostrar los datos  (ambos tienen datos similares)
        System.out.println("Clon del Soldado creado:");
        System.out.println("Su nombre es [" + g2.getNombre() + "]");
        System.out.println("Su arma es [" + g2.getArma() + "]");
        System.out.println("==============================");
        // Modificamos el Guerrero clonado
        g2.setNombre("Soldado2");
        g2.setArma("M16");
        // Mostrar los datos de ambos Guerreros (ambos tienen diferentes datos)
        System.out.println("Despues de modificar el clon, ahora se llama [" + g2.getNombre() + "]");
        System.out.println("Su arma es [" + g2.getArma() + "]\n");
        System.out.println("El nombre del Soldado original es [" + g1.getNombre() + "]");
        System.out.println("Su arma es [" + g1.getArma() + "]");
        System.out.println("==============================");
        // Modificamos el Guerrero original
        g1.setNombre("Soldado-1");
        g1.setArma("M4");
        // Mostrar los datos de ambos Guerreros tras la modificación (ambos tienen diferentes datos)
        System.out.println("Tras modificar el original, ahora es [" + g1.getNombre() + "]");
        System.out.println("Su arma es [" + g1.getArma() + "]\n");
        System.out.println("El nombre del clon es [" + g2.getNombre() + "]");
        System.out.println("Su arma es [" + g2.getArma() + "]");
    }
}