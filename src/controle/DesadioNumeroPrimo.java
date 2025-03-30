package controle;

import java.util.Scanner;

public class DesadioNumeroPrimo {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite um número: ");
		int numeroDigitado = entrada.nextInt();

		if (numeroDigitado <= 0) {
			System.out.println("Informe um número positivo!");
		} else {
			int verificarDivisao = 0;

			for (int i = 1; i <= numeroDigitado; i++) {
				if (numeroDigitado % i == 0) {
					verificarDivisao++;
				}
			}

			if (verificarDivisao == 2) {
				System.out.println("O número digitado é primo.");
			} else {
				System.out.println("O número digitado não é primo.");
			}

			entrada.close();
		}
	}
}
