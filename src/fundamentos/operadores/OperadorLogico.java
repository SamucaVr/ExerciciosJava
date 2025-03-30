package fundamentos.operadores;

import java.util.Scanner;

public class OperadorLogico {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean temDinheiro = getBooleanInput(scanner, "Você tem dinheiro? ");
		boolean estaFazendoSol = getBooleanInput(scanner, "Está fazendo sol? ");

		if (temDinheiro && estaFazendoSol) {
			System.out.println("Vou sair!");
		} else {
			System.out.println("Não vou sair!");
		}

		if (temDinheiro || estaFazendoSol) {
			System.out.println("vou sair!");
		} else {
			System.out.println("Não vou sair!");
		}

	}

	public static boolean getBooleanInput(Scanner scanner, String mensagem) {
		String entrada;
		boolean resultado = false;
		boolean loop = false;

		do {
			System.out.println(mensagem + " ");
			entrada = scanner.next().trim().toLowerCase();

			if (entrada.equals("sim")) {
				resultado = true;
				loop = true;
			} else if (entrada.equals("não") || entrada.equals("nao")) {
				resultado = false;
				loop = true;
			} else {
				System.out.println("Entrada inválida! Digite 'sim' ou 'não'.");
			}
		} while (!loop);

		return resultado;	
	}
}