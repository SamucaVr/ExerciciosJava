package controle.revisao;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class MenuInterativo {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Calendar dataAtual = Calendar.getInstance();
		SimpleDateFormat dataFormatada = new SimpleDateFormat("dd/MM/yyyy");

		int opcao = 0;

		do {
			System.out.println("\nMenu de Opções:");
			System.out.println("[1] Mensagem de boas-vindas.");
			System.out.println("[2] Data Atual.");
			System.out.println("[3] Sair.");
			opcao = entrada.nextInt();

			switch (opcao) {
			case 1:
				System.out.println("Bem-vindo ao sistema! Esperamos que tenha uma ótima experiência.");
				break;
			case 2:
				System.out.println("Data Atual: " + dataFormatada.format(dataAtual.getTime()));
				break;
			case 3:
				System.out.println("Desligando...");
				break;
			default:
				System.out.println("Opção inválida!");
			}

		} while (opcao != 3);

		entrada.close();
	}
}
