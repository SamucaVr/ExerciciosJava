package fundamentos;

public class ConversaoTipoPrimitivoNumerico {

	public static void main(String[] args) {
		
		// O Java não analisa os valores, mas sim os tipos
		double a = 1; // Conversão Implícita
		System.out.println(a);
		
		float b = (float) 1.23112522144; // Conversão Explícita (CAST)
		System.out.println(b);
		
		double c = 1.23112522144;
		System.out.println(c);
		
		int d = 3;
		byte e = (byte) d; // Conversão Explícita (CAST)
		System.out.println(e);
		
		double f = 1.999999;
		int g = (int) f;
		System.out.println(g);
	}

}
