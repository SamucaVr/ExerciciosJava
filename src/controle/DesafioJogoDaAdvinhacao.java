package controle;

import java.util.Random;
import java.util.Scanner;

public class DesafioJogoDaAdvinhacao {
	/**
	 * 6. Jogo da adivinhação: Tentar adivinhar um número entre 0 - 100. Armazene
	 * um número aleatório em uma variável. O Jogador tem 10 tentativas para
	 * adivinhar o número gerado. Ao final de cada tentativa, imprima a quantidade
	 * de tentativas restantes, e imprima se o número inserido é maior ou menor do
	 * que o número armazenado.
	 */

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Random gerador = new Random();

		int aleatorio;
		int numeroDigitado;
		int tentativas;
		String continuar = "";

		do {
			tentativas = 10;
			aleatorio = gerador.nextInt(100) + 1;
			
			while (tentativas > 0) {
				System.out.print("Digite um número: ");
				numeroDigitado = entrada.nextInt();

				if (numeroDigitado > aleatorio) {
					System.out.println("O número inserido é maior.");
					tentativas--;
				} else if (numeroDigitado < aleatorio) {
					System.out.println("O número inserido é menor.");
					tentativas--;
				} else {
					System.out.println("Parabéns, você acertou o número!");
					break;
				}
				System.out.println("Tentativas restante: " + tentativas);
			}
			
			if (tentativas == 0) {
				System.out.println("Que pena, você não acertou o número!");
			}
			
			System.out.print("Deseja continuar [sim, não]: ");
			continuar = entrada.next().replace("não", "nao");
		} while (!continuar.equalsIgnoreCase("nao"));

		entrada.close();
	}
}
