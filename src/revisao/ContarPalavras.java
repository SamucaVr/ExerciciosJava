package revisao;

import java.util.Scanner;

public class ContarPalavras {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite uma frase: ");
		String palavra = entrada.nextLine().trim();
		
		if (palavra.isEmpty()) {
			System.out.println("Você não digitou nenhuma palavras.");
		} else {
			String[] textoSeparado = palavra.split("\\s");
			System.out.printf("A frase tem %d palavras.",textoSeparado.length);			
		}	
		
		entrada.close();
	}

}
