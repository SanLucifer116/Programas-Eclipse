package TemplateMethod01;

public class ClaseConcreta1 extends ClaseAbstracta
{
    public ClaseConcreta1(){ }

    // ------------------------------------
    // MANERA DE SOBREESCRIBIR EL METODO MENSAJE, ASI MOSNTRARA OTRO TEXTO AL YA ESCRITO	 
    @Override
    public void mensaje()
    {
        // Procesamos c�digo extra
        System.out.println("En ClaseConcreta1");

        // Llamamos al c�digo del m�todo implementado en la clase abstracta
        super.mensaje();
    }

    @Override
    public int multiplicar( int num )
    {
        return num * 100;
    }

    // ------------------------------------

    @Override
    public int sumar( int num )
    {
        return num + 10;
       
    }

	@Override
	public int resta(int num) {
		
		return num-10;
	}
}