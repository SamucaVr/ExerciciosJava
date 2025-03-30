package revisao;

import java.util.Scanner;

public class ValorDobrado {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		int numeroDigitado = entrada.nextInt();

		int valorDobrado = numeroDigitado * 2;
		System.out.println("O dobro do número é: " + valorDobrado);
		
		entrada.close();
	}
}
