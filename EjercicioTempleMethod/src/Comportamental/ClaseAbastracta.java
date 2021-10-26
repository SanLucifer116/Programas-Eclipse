package Comportamental;
//ESTA ES LA CLASE PADRE( CLASE ABSTRACTA), LA QUE HERADARA A SUS HIJAS
//AQUI SE ENCUENTRAN LOS METODOS QUE USARAN LAS CALASES HIJAS
public abstract class ClaseAbastracta {
	public int obtener( int num )
    {
        this.Vector();

        int vector = this.ParImpar( vector );
       

        return vector;
    }

    // -------------------

    public void Vector()
    {
    	Integer[] vector = new Integer [5];
    	vector[0]= 2;
    	vector[1]= -7;
    	vector[2]= 12;
    	vector[3]= 200;
    	vector[4]= 9;
    }

    // -------------------

    // Métodos que deberán implementar las subclases
    public abstract int ParImpar( int vector );
  
}
