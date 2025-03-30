package controle;

import java.util.Scanner;

public class DesafioNumeroPar {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		int numeroDigitado = entrada.nextInt();
		
		if (numeroDigitado >= 0 && numeroDigitado <= 10) {
			System.out.println("O número digitado está entre 0 e 10.");
			
			if (numeroDigitado % 2 == 0) {
				System.out.println("O número digitado é par.");
			} else {
				System.out.println("O número digitado é ímpar.");
			}
		} else {
			System.out.println("tente outro número!");
		}
		
		entrada.close();
	}
}
