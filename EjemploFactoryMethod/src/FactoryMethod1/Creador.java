package FactoryMethod1;

import FactoryMethod2.ArchivoAudio;
import FactoryMethod2.ArchivoVideo;
import FactoryMethod2.IArchivo;

public class Creador extends CreadorAbstracto
{
    public void Creador() {
    }
    // -------------------------------------------
    @Override
     public IArchivo crear(int tipo)
    {
        IArchivo objeto;
        switch( tipo )
        {
            case AUDIO:
                objeto = new ArchivoAudio();
                break;
            case VIDEO:
                objeto = new ArchivoVideo();
                break;
            default:
                objeto = null;
        }
        return objeto;
    }
}