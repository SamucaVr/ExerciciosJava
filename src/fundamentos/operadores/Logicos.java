package fundamentos.operadores;

public class Logicos {

	public static void main(String[] args) {
		boolean condicao1 = true;
		boolean condicao2 = 3 > 5;
		
		System.out.println(condicao1 && !condicao2);
		System.out.println(condicao1 || !condicao2);
		System.out.println(condicao1 ^ condicao2);
		System.out.println(!!condicao1);
		System.out.println(!condicao2 + "\n");

		// Tabela verdade AND
		System.out.println(true && true);
		System.out.println(true && false);
//		System.out.println(false && true);
//		System.out.println(false && false);
		System.out.println("\n");
		
		// Tabela verdade OR
//		System.out.println(true || true);
//		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);
		System.out.println("\n");
		
		// Tabela verdade XOR(OU Exclusivo)
		System.out.println(true ^ true);
		System.out.println(true ^ false);
		System.out.println(false ^ true);
		System.out.println(false ^ false);
		
		// Tabela verdade NOT
		System.out.println(!true);
		System.out.println(!false);
		
		
	}

}
