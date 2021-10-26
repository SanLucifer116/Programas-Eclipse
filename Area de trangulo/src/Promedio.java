
import java.util.*;

public class Promedio {

	public static void main(String[] args) {
		
		
		double a,b,c,d, prom;
		String nom;
		
		System.out.println("Bienvenido al programa para sacar promedio por Alejandro Arteaga");

		Scanner scan = new Scanner(System.in);
		


		System.out.println( "Por Favor Digite Su Nombre");
		
		nom=scan.nextLine();
		
		System.out.println( "Bienvenido(a)" + nom);

		
		
		
		System.out.println( "Digite la Nota A");
		
		a=scan.nextDouble();
		
		System.out.println( "Digite la Nota B");
		
		b=scan.nextDouble();
		
		System.out.println( "Digite la Nota C");
		
		c=scan.nextDouble();
		
		System.out.println( "Digite la Nota D");
		
		d=scan.nextDouble();
		
		
		
		System.out.println( "Valor de A:" + a);
		
		System.out.println( "Valor de B:" + b);
		
		System.out.println( "Valor de C:" + c);
		
		System.out.println( "Valor de D:" + d);
		
		prom = (a+b+c+d)/4;
		
		
		System.out.println( "Su promedio es : " + prom);
		System.out.println( "Gracias por utilizar el programa, buen dia");
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
