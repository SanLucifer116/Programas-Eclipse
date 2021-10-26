package TemplateMethod01;

public abstract class ClaseAbstracta
{
  // PROCESO PARA MOSTRAR EN PANTALLA
	//METODO PLANTILLA 
    public int obtener( int num )
    {
        this.mensaje();

        int numero = this.multiplicar( num );
        numero = this.sumar( numero );
        numero = this.resta(numero);

        return numero;
    }

    // -------------------

    public void mensaje()
    {
        System.out.println("Vamos a realizar las operaciones...");
    }

    // -------------------

    // Métodos que deberán implementar las subclases
    public abstract int multiplicar( int num );
    public abstract int sumar(  int num  );
    public abstract int resta(int num);
}