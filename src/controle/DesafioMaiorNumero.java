package controle;

import java.util.Scanner;

public class DesafioMaiorNumero {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int numeroDigitado;
		int maiorNumero = 0;

		for (int i = 0; i < 10; i++) {
			System.out.print("Digite um número: ");
			numeroDigitado = entrada.nextInt();

			if (numeroDigitado > maiorNumero) {
				maiorNumero = numeroDigitado;
			}
		}

		System.out.println("Esse foi o maior número digitado: " + maiorNumero);

		entrada.close();
	}
}
