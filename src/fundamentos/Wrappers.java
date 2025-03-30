package fundamentos;


public class Wrappers {

	public static void main(String[] args) {
		
		// Wrapper é a versão OO dos tipos primitivos
		
		Byte b = 100;
		Short s =  1000;
		Integer i = Integer.parseInt("10000");
		Long l = 100000L;
		
		System.out.println(b.byteValue());
		System.out.println(s.toString()); // Converte o valor para String
		System.out.println(i);
		System.out.println(l /2);
		
		Float f = 123.23F;
		System.out.println(f);
		
		Double d = 1233.332;
		System.out.println(d);
		
		Boolean boo = Boolean.parseBoolean("True");
		System.out.println(boo);
		System.out.println(boo.toString().toLowerCase());
		System.out.println(("" + boo).toUpperCase());
	}
}
