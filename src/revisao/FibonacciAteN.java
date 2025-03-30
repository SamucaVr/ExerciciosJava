package revisao;

import java.util.Scanner;

/*
 * Objetivo: Crie um programa que solicite ao usuário um número
 * inteiro e exiba todos os números da sequência de Fibonacci
 * que são menores ou iguais a N
 */
public class FibonacciAteN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int valorA = 0;
		int valorB = 1;
		
		System.out.print("Digite o valor de N: ");
		int valorN = entrada.nextInt();
		
		System.out.print("Sequência de Fibonacci:");
		
		while (valorA <= valorN) {
			System.out.print(" " + valorA);
			int temp = valorA + valorB;
			valorA = valorB;
			valorB = temp;
		}
		
		entrada.close();
		
	}

}
