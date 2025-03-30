package revisao;

import java.util.Scanner;

/*
 * Objetivo: Solicite ao usuário um número
 * inteiro positivo e exiba o número invertido.
 */
public class InverterNumero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite um número: ");
		Integer numeroDigitado = entrada.nextInt();

		String numeroInvertido = "";

		for (int i = numeroDigitado.toString().length() - 1; i >= 0; i--) {
			numeroInvertido += numeroDigitado.toString().charAt(i);
		}
		numeroDigitado = Integer.parseInt(numeroInvertido);

		System.out.println("Número invertido: " + numeroDigitado);

		entrada.close();
		

		// Correção do Copilot
//		Scanner entrada = new Scanner(System.in);
//
//		System.out.print("Digite um número inteiro positivo: ");
//		int numeroDigitado = entrada.nextInt();
//
//		if (numeroDigitado < 0) {
//			System.out.println("Por favor, insira um número positivo.");
//		} else {
//			int numeroInvertido = 0;
//
//			while (numeroDigitado > 0) {
//				int digito = numeroDigitado % 10; // Obtém o último dígito
//				numeroInvertido = numeroInvertido * 10 + digito; // Adiciona o dígito invertido
//				numeroDigitado /= 10; // Remove o último dígito
//			}
//
//			System.out.println("Número invertido: " + numeroInvertido);
//		}
//
//		entrada.close();

	}

}
