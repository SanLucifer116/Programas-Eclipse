package FactoryMethod2;
public class ArchivoAudio implements IArchivo
{
    public ArchivoAudio() {
    }
    // -----------------------------
    @Override
     public void reproducir() {
        System.out.println("Reproduciendo archivo de audio...");
    }
}