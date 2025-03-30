package fundamentos;

public class Inferencia {

	public static void main(String[] args) {
		
		double a = 4.5;
		System.out.println(a);
		
		/*
		 * Quando for usar o var
		 * é necessário inicializar a variável
		 * pois o var só pode inferir o tipo depois da inicialicação
		 */
		var b = 4.5;
		System.out.println(b);
		
		var c = "Texto";
		System.out.println(c);
		
		c = "Outro texto";
		System.out.println(c);
		
		String mensagem = c;
		System.out.println(mensagem);		
		
	}
}
