
public class Desbordamiento {
	
	public static void main(String[] args) {
		byte maxByte = Byte.MAX_VALUE;
		short maxShort = Short.MAX_VALUE;
		int maxInt = Integer.MAX_VALUE;
		long maxLong = Long.MAX_VALUE;
		
		System.out.println("Bytes: "+maxByte+"\nShorts: "
				+maxShort+"\nInts: "+maxInt+"\nLongs: "+maxLong);
		
		maxByte += 5;
		maxShort += 25;
		maxInt += 10000;
		maxLong += 20000;
		
		System.out.println("Bytes: "+maxByte+"\nShorts: "
				+maxShort+"\nInts: "+maxInt+"\nLongs: "+maxLong);
		
	}
}
