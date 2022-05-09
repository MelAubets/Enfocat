import java.io.PrintStream;

public class PrintfEx {

	public static void main(String[] args) {
		String[] noms = {"Mel","Aubets","Serra"};
		int numero1 = 22;
		double numero2 = 17.1829327;

		System.out.printf("%1$s\t%2$s\t%3$s\n", noms);
		System.out.printf("%s %s %s\n",noms);
		System.out.printf("%3$s %2$s %1$s\n",noms);
		System.out.printf("%10d\n", numero1);
		System.out.printf("%010d\n", numero1);
		System.out.printf("%.2f\n",numero2);
		System.out.printf("%s\b%s", "Hola ", "Mundo");
	}

}
