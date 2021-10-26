package FactoryMethod1;

import FactoryMethod2.IArchivo;

public abstract class CreadorAbstracto
{
    public static final int AUDIO = 1;
    public static final int VIDEO = 0;
    // --------------------------------
     public abstract IArchivo crear(int tipo);
}