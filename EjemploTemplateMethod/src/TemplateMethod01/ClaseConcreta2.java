package TemplateMethod01;

public class ClaseConcreta2 extends ClaseAbstracta
{
    public ClaseConcreta2(){}

    // ------------------------------------
   // MANERA DE SOBREESCRIBIR EL METODO MENSAJE, ASI MOSNTRARA OTRO TEXTO AL YA ESCRITO	 
    @Override
    public void mensaje()
    {
        // Procesamos código extra
        System.out.println("En ClaseConcreta2");

        // Llamamos al código del método implementado en la clase abstracta
        super.mensaje();
    }

    @Override
    public int multiplicar( int num )
    {
        return num * 1000;
    }

    // ------------------------------------

    @Override
    public int sumar( int num )
    {
        return num + 100;
    }

	@Override
	public int resta(int num) {

		return num-10;
	}
}