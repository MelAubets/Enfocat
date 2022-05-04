import java.lang.Math;

public class Rainbow {

	public static void main(String[] args) {
		System.out.println(colors());
		System.out.println(colors());
		System.out.println(colors());
		System.out.println(colors());
		System.out.println(colors());
		System.out.println(colors());
		System.out.println(colors());
	}
	
	public static String colors() {
		String red = String.valueOf((int) (Math.random()*255));
		String green = String.valueOf((int) (Math.random()*255));
		String blue = String.valueOf((int) (Math.random()*255));

		String color =red+";"+green+";"+blue;
		
		return "\033[48;2;"+color+"m                         \033[0m";
	}
}
