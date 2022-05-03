
public class AritmethicOps {

	public static void main(String[] args) {
		int uno = 10-5;
		int dos = 55+45;
		int tres = -3;
		int cuatro = 5*5;
		int cinco = 25/7;
		float seis = 25f/7f;
		int siete = 25%4;
		
		int numero = 0;
		
		System.out.println(uno+" "+dos+" "+tres+" "+
		cuatro+" "+cinco+" "+seis+" "+siete);
		
		System.out.println(increment(numero));
		System.out.println(decrease(numero));
	}
	
	public static int increment(int numero) {
		return ++numero;
	}
	
	public static int decrease(int numero) {
		return --numero;
	}

}
