package revisao;

/*
 * Objetivo: Crie um programa que solicite ao usuário um número inteiro
 * e determine se ele é um número primo.
 */
import java.util.Scanner;

public class NumeroPrimo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite um número: ");
		int numeroDigitado = entrada.nextInt();

		if (numeroDigitado < 0) {
			System.out.println("O valor digitado não pode ser menor do que 0!");
		} else {
			
			int verificarDivisao = 0;

			for (int i = 1; i <= numeroDigitado; i++) {
				if (numeroDigitado % i == 0) {
					verificarDivisao++;
				} else {
					continue;
				}
			}

			if (verificarDivisao == 2) {
				System.out.printf("O número %d é primo.", numeroDigitado);
			} else {
				System.out.printf("O número %d não é primo.", numeroDigitado);
			}
		}

		entrada.close();
	}

}
