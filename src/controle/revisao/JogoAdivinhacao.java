package controle.revisao;

import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Random gerador = new Random();

		int numeroAleatorio = gerador.nextInt(100) + 1;
		int palpite;
		int tentativa = 0;
		System.out.println("Tente adivinhar o número entre 1 e 100!");

		do {
			System.out.print("Digite um número: ");
			palpite = entrada.nextInt();

			if (palpite == numeroAleatorio) {
				System.out.println("Parabéns, você acertou o número!");
				System.out.printf("Você precisou de %d tentativas.", tentativa);
			} else if (palpite > numeroAleatorio) {
				System.out.println("O número digitado é maior que o número sorteado.");
				tentativa++;
			} else {
				System.out.println("O número digitado é menor que o número sorteado.");
				tentativa++;
			}
		} while (palpite != numeroAleatorio);

		entrada.close();
	}
}
