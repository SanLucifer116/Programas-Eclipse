package FactoryMethod2;
public class ArchivoVideo implements IArchivo
{
    public ArchivoVideo() {
    }
    // -----------------------------
    @Override
     public void reproducir() {
        System.out.println("Reproduciendo archivo de vídeo...");
    }
}