package controle.revisao;

import java.util.Scanner;

public class ManipulacaoString {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite uma frase: ");
		String frase = entrada.nextLine().trim();

		int opcao = 0;
		do {
			System.out.println("\nMenu de Opções:");
			System.out.println("[1] Contar o número de palavras.");
			System.out.println("[2] Transformar em letras maiúsculas.");
			System.out.println("[3] Inverter a frase.");
			System.out.println("[4] Sair.");
			opcao = entrada.nextInt();

			switch (opcao) {
			case 1:
				String[] fraseSeparada = frase.split("\\s");
				System.out.print("Quantidade de palavras na frase: " + fraseSeparada.length);
				break;
			case 2:
				System.out.print("Frase em letras maiúsculas: " + frase.toUpperCase());
				break;
			case 3:
				String fraseAoContrario = "";
				for (int i = frase.length() - 1; i >= 0; i--) {
					fraseAoContrario += frase.charAt(i);
				}
				System.out.print("Frase invertida: " + fraseAoContrario);
				break;
			case 4:
				System.out.print("Desligando...");
				break;
			default:
				System.out.print("Opção inválida!");
			}

		} while (opcao != 4);

		entrada.close();
	}
}
