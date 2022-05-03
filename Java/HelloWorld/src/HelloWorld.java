
public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Hello World!\nOr\t"
				+ "Bye\"Bye World \n\'soo\n"
				+ "Hello\\ByeBye World!");
		
		boolean isTrue = true;
		char character = 'a';
		byte thisIsAByte = 1;
		short thisIsAShort = 2;
		int thisIsAInt = 3;
		long thisIsALong = 4;
		float thisIsAFloat = 0.1f;
		double thisIsADouble = 0.2;
		
		
		System.out.println(String.valueOf(isTrue)+character+thisIsAByte+
				thisIsAShort+thisIsAInt+thisIsALong+
				thisIsAFloat+thisIsADouble);
	}

}
