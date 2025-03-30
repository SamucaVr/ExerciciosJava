package revisao;

import java.util.Scanner;

/*
 * Objetivo: Crie um programa que solicite ao usuário uma palavra
 * ou frase e conte quantas vogais e consoantes existem nela.
 */
public class ContarVogaisConsoantes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int vogal = 0;
		int consoante = 0;

		System.out.print("Digite uma palavra ou frase: ");
		String palavra = entrada.nextLine().trim().toLowerCase();

		for (int i = 0; i < palavra.length(); i++) {
			char ehLetra = palavra.charAt(i);
			
			if (Character.isLetter(ehLetra)) {
				if (palavra.charAt(i) == 'a' || palavra.charAt(i) == 'e' || palavra.charAt(i) == 'i'
						|| palavra.charAt(i) == 'o' || palavra.charAt(i) == 'u') {
					vogal++;
				} else {
					consoante++;
				}
			}
		}

		System.out.println("Quantidade de vogais: " + vogal);
		System.out.println("Quantidade de consoantes: " + consoante);

		entrada.close();
	}
}
