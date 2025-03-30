package fundamentos;

public class ConversaoNumeroString {

	public static void main(String[] args) {
		Integer a = 10000;
		System.out.println(a.toString().length());
		
		int b = 45;
		System.out.println(Integer.toString(b).concat(" teste"));
		
		System.out.println(("" + b).length()); // Artifício tecnológico para converter um inteiro para String
		
		

	}

}
