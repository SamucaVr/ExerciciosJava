package controle.revisao;

import java.util.Scanner;

public class CalculadoraMatriz {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int[][] matriz1 = new int[2][2];
		int[][] matriz2 = new int[2][2];
		int[][] resultado = new int[2][2];

		System.out.println("Digite os valores da primeira matriz: ");
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.printf("Digite o valor do [%d] [%d]: ", i, j);
				matriz1[i][j] = entrada.nextInt();
			}
		}

		System.out.println("Digite os valores da seginda matriz: ");
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.printf("Digite o valor do [%d] [%d]: ", i, j);
				matriz2[i][j] = entrada.nextInt();
			}
		}

		System.out.println("Escolha uma opção:");
		System.out.println("[1] Adição das matrizes.");
		System.out.println("[2] Multiplicação das matrizes.");
		int opcao = entrada.nextInt();

		switch (opcao) {
		case 1:
			for (int i = 0; i < 2; i++) {
				for (int j = 0; j < 2; j++) {
					resultado[i][j] = matriz1[i][j] + matriz2[i][j];
				}
			}

			System.out.println("Resultado:");
			for (int i = 0; i < 2; i++) {
				for (int j = 0; j < 2; j++) {
					System.out.printf("[%d]", resultado[i][j]);
				}
				System.out.println();
			}
			break;
		case 2:
			for (int i = 0; i < 2; i++) {
				for (int j = 0; j < 2; j++) {
					resultado[i][j] = matriz1[i][j] * matriz2[i][j];
				}
			}

			System.out.println("Resultado:");
			for (int i = 0; i < 2; i++) {
				for (int j = 0; j < 2; j++) {
					System.out.printf("[%d]", resultado[i][j]);
				}
				System.out.println();
			}
			break;
		default:
			System.out.println("Opção inválida!");
		}
		entrada.close();
	}
}
