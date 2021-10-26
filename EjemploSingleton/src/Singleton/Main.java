package Singleton;
public class Main
{
    public static void main(String[] args)
    {
        for(int num=0; num<=5; num++)
        {
            Coche.getInstancia();
        }
    }
}