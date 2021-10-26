package FactoryMethod1;

import FactoryMethod2.IArchivo;

public class Main
{
    public static void main(String[] args)
    {
        CreadorAbstracto creator = new Creador();
        IArchivo audio = creator.crear( Creador.AUDIO );
        audio.reproducir();
        System.out.println("========================");
        IArchivo video = creator.crear( Creador.VIDEO );
        video.reproducir();
    }
}

// CREAR METODO DE ELIMINACION PARA AMBOS CASOS 