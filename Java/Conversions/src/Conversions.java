
public class Conversions {
	
	public static double xDouble = (double) Byte.MAX_VALUE;
	public static byte yByte = Byte.MAX_VALUE;
	public static byte cien = 100; 
	
	public static void main(String[] args) {
		
		float xFloat = (float) xDouble;
		long xLong = (long) xDouble;
		int xInt = (int) xDouble;
		short xShort = (short) xDouble;
		byte xByte = (byte) xDouble;
		
		System.out.println("De double a byte:\n"+"Double: "+xDouble+"\n"+"Float: "+xFloat+"\n"+
				"Long: "+xLong+"\n"+"Int: "+xInt+"\n"+"Short: "+xShort+"\n"
				+"Byte: "+xByte);
		
		double yDouble = (double) yByte;
		float yFloat = (float) yByte;
		long yLong = (long) yByte;
		int yInt = (int) yByte;
		short yShort = (short) yByte;
		
		System.out.println("\nDe byte a double:\n"+"Double: "+yDouble+"\n"+"Float: "+yFloat+"\n"+
				"Long: "+yLong+"\n"+"Int: "+yInt+"\n"+"Short: "+yShort+"\n"
				+"Byte: "+yByte);
		
		cien = (byte) (cien*2);
		
		System.out.println("\nProblemas de byte:\n"+cien+"\nPara arreglar el problema se debería"
				+ " hacer un casteo a int,\npues el problema es que 100x2 se pasa \ndel rango permitido"
				+ " en byte");
	}

}
