package revisao;

import java.util.Scanner;

public class CalcularFatorial {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int fatorial = 1;
		
		System.out.print("Digite um número: ");
		int numeroDigitado = entrada.nextInt();
		
		for (int i = 1; i <= numeroDigitado; i++) {
			fatorial *= i;
		}
		
		System.out.printf("O fatorial de %d é: %d", numeroDigitado, fatorial);
		
		entrada.close();
	}
}
