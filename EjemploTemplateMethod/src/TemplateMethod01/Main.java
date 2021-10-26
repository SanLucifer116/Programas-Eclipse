package TemplateMethod01;

public class Main
{
    public static void main(String[] args)
    {
        ClaseConcreta1 cc1 = new ClaseConcreta1();
        ClaseConcreta2 cc2 = new ClaseConcreta2();

        // Obtener el resultado de multiplicar 3 por 100 y restarle 10
        //Luego sumamos 10 para que de 300
        int num1 = cc1.obtener(3);
        System.out.println( "num1: " + num1 );

        // Obtener el resultado de multiplicar 3 por 1000 y restarle 10
        // Y SUMAMOS 100 PARA QUE DE 50090
        int num2 = cc2.obtener(50);
        System.out.println( "num2: " + num2 );
    }
}