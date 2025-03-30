package revisao;


/*
 * Enunciado: Crie um programa que solicite ao usuário uma palavra e verifique 
 * se ela é um palíndromo (ou seja, se pode ser lida da mesma forma de trás para frente).
 */
public class VerificarPalindromo {

	public static void main(String[] args) {
		String palavra = "samuel";
		char[] palavraAoContrario = new char[palavra.length()];
		
		for(int i = palavra.length() - 1; i >= 0; i--) {
				palavraAoContrario[i] = palavra.charAt(palavra.length() - 1 - i);
		}
		
		String resultado = new String(palavraAoContrario);
		
		if(resultado.equals(palavra)) {
			System.out.printf("A palavra \"%s\" é um palíndromo.", palavra);
		}  else {
			System.out.printf("A palavra \"%s\" não é um palíndromo.", palavra);
		}
		
	}

}
