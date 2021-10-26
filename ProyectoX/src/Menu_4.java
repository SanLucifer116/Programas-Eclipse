import javax.swing.JOptionPane;

public class Menu_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,m, opcion,num,c,mult,rv1, Nf,Nc,vres,tv1 ;
		String cadena = "";
		String cadena1 = "";
		double ec1, resultado,rs,res,rsm ,mat1, multires, altura, peso1 = 0;
		
   
  
   //                         MENU PRINCIPAL 
 
	   do {
	   	do
	   	{
		   	
			opcion =  Integer.parseInt(JOptionPane.showInputDialog(null, 
				" 1. Sumar dos Vectores" +  "\n" + 
				" 2. Sumar dos Matrices"  + "\n" +
				" 3. Multiplicar un vector por un numero leido" + "\n" +
				" 4. Empresa TolModels" + "\n" +
				" 5. Salir del programa\n" + "Seleccione Opción deseada (1-5) : ")); 		
				
	   	}while( (opcion< 1) || (opcion >5));
	   	
	   	
	   	switch (opcion)
	   	{
		     case 1: 
		   		rv1= Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el tamaño de los Vectores"));
		   		int[] v1 = new int[rv1];
		   		int[] v2 = new int[rv1];
		   		int[] v3 = new int[rv1];
		   		for ( int x=0; x<v1.length; x++) 
		   			v1[x]= Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el numero de la posicion v1[" + x +"]"  ));
		   			
			  	for ( int x2=0; x2< v2.length; x2++) 
					v2[x2]= Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el numero de la posicion v2[" + x2+"]"));
		   			   		
			   	for ( int x3=0; x3<v3.length; x3++) {
			   		v3[x3]= sumarvec(v1[x3], v2[x3]);
			   		 cadena  = cadena +( v1[x3]  + " + " + v2[x3]+ " = "  + v3[x3] + "\n");
			   		   		   		
			   	}
			   			
				   		JOptionPane.showMessageDialog(null, cadena, " Contenido y suma de vectores", JOptionPane.INFORMATION_MESSAGE);
				   	 
			   	break;	
			   		
		   	
		   		
		   		
		   	case 2:
		   		Nf= Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el número de filas para las matrices"));
		   		Nc= Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el número de columnas para las matrices "));
		   		int[][] m1 = new int[Nf][Nc];
		   		int[][] m2 = new int[Nf][Nc];
		   		int[][] m3 = new int[Nf][Nc];
		   				   		
		   		llenarmat( m1,m2);
		   		calculo( m1,m2,m3,Nf,Nc);
		   		barrido( m3,m1,m2);
	
		   		break;
		   		
		   	case 3: 
		   		tv1= Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el tamaño del vector"));
		   		num= Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el número multiplicador"));
		   		int[] vec1 = new int[tv1];
		   		int[] vecres = new int[tv1];
		   		llenarvec (num, vec1);
		   		cadena = multvec(vec1,num,vecres);
		   		
		   		JOptionPane.showMessageDialog(null, cadena, "Resultado multiplicacion",JOptionPane.INFORMATION_MESSAGE );
		   		 
		  	case 4: 
		  		
	   	}// Switch
	   	
	   	
	   	
	   	
	   	
	   }while( (opcion >=1) && (opcion<=4));
	
	 
   
	}// main	   

	private static String toUpperCase(char sexo) {
		// TODO Auto-generated method stub
		return null;
	}

	//                                                            *METODOS*
	 private static Object v1(int x) 
	 {
		// TODO Auto-generated method stub
		return null;
	}

	public static int sumarvec(int  n1 , int  n2)
	   {
		   return (n1+n2);  
	   }
	//suma de matrices
	
	public static void llenarmat(int mat[][],int mat2[][])
	{
		int i,j;
		for ( i=0; (i< mat.length); i++)
			for ( j=0; (j<mat.length); j++) {
				mat[i][j]= Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el numero de la posicion mat [" + i + "  "+ j +"]"  ));
				mat2[i][j]= Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el numero de la posicion mat [" + i + "  "+ j +"]"  ));
			}
	}
	
	public static void calculo(int mat[][],int mat2[][],int mat3[][],int Nf, int Nc)
	{
		int i,j;
		for ( i=0; (i< mat.length); i++)
			for ( j=0; (j<mat.length); j++) 
				mat3[i][j]=  mat[i][j]+ mat2[i][j];
			
	}//calculo
	
	public static void barrido(int mat3[][], int mat[][], int mat2[][] )
{
		int i,j;
		String cadena = " ";
		for ( i=0; (i< mat3.length); i++)
			for ( j=0; (j<mat3.length); j++) 
				cadena  = cadena +( mat[i][j]  + " + " +  mat2[i][j]+ " = "  + mat3[i][j] + "\n");
				
		JOptionPane.showMessageDialog(null, cadena, " Contenido de las matrices", JOptionPane.INFORMATION_MESSAGE);
}	


	public static void llenarvec (int rv1, int v1[])
	{
		int x1;
		for ( x1=0; x1<rv1; x1++) 
			v1[x1]= Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el numero de la posicion v1[" + x1 +"]"  ));
	}
	
	
	
	public static String  multvec (int v[] , int num, int vr[] )
	{
		int x;
		String cad= " ";
		for (x=0; x<v.length; x++) {
			vr[x]=(v[x]*num);
		   cad = cad +( v[x]  + " x " + num + " = "  + vr[x] + "\n"); 
		}
		 return (cad);
	}	
	
	

			
//   		}
		
}

