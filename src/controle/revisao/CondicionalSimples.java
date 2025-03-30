package controle.revisao;

import java.util.Scanner;

public class CondicionalSimples {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		int numeroDigitado = entrada.nextInt();
		
		if (numeroDigitado % 2 == 0) {
			System.out.println("O número digitado é par.");
		} else {
			System.out.println("O número digitado é ímpar.");
		}
		
		entrada.close();
	}
}
