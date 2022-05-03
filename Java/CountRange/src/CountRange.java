import java.math.BigInteger;

public class CountRange {

	public static void main(String[] args) {
		//Max
		short maxByte = Byte.MAX_VALUE;
		int maxShort = Short.MAX_VALUE;
		long maxInt = Integer.MAX_VALUE;
		BigInteger maxLong = BigInteger.valueOf(Long.MAX_VALUE);
		//Min
		short minByte = Byte.MIN_VALUE;
		int minShort = Short.MIN_VALUE;
		long minInt = Integer.MIN_VALUE;
		BigInteger minLong = BigInteger.valueOf(Long.MIN_VALUE);
		
		//Calc
		int byteRange = maxByte - minByte;
		int shortRange = maxShort - minShort;
		long intRange = maxInt - minInt;
		BigInteger longRange = maxLong.subtract(minLong);
		
		System.out.println("Ranges:\n"+"Byte: "+byteRange+
				"\nShort: "+shortRange+"\nInts: "+intRange+
				"\nLong: "+longRange);
	}

}
