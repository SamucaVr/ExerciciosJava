package controle.revisao;

import java.util.Scanner;

public class SomaEnquanto {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int numeroDigitado = 1;
		int soma = 0;
		
		System.out.println("Digite números para somar (0 para sair): ");
		while (numeroDigitado != 0) {
			numeroDigitado = entrada.nextInt();
			soma += numeroDigitado;
		}
		System.out.println("A soma total dos número é: " + soma);

		entrada.close();
	}
}
