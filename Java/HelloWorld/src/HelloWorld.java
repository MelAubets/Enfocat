
public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Hello World!\nOr\t"
				+ "Bye\"Bye World \n\'soo\n"
				+ "Hello\\ByeBye World!");
		
		final boolean isTrue = true;
		final char character = 'a';
		final byte thisIsAByte = 1;
		final short thisIsAShort = 2;
		final int thisIsAInt = 3;
		final long thisIsALong = 4;
		final float thisIsAFloat = 0.1f;
		final double thisIsADouble = 0.2;
		
		
		System.out.println(String.valueOf(isTrue)+character+thisIsAByte+
				thisIsAShort+thisIsAInt+thisIsALong+
				thisIsAFloat+thisIsADouble);
	}

}
