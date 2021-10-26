package Pizza;


public abstract class CreadorAbstracto{
	
	public static final int PIZZACONPIÑA= 0;
	public static final int PIZZAPICANTE = 1;
	public static final int PIZZARANCHERA = 2;
	
	 public abstract Pizza crear(int tipo);
}
