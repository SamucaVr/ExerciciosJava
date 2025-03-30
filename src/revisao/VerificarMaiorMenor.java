package revisao;

import java.util.Scanner;

/*
 * Objetivo: Crie um programa que solicite ao usuário três números inteiros
 * e determine o maior e o menor número entre eles.
 */
public class VerificarMaiorMenor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int[] numeros = new int[3];
		
		for (int i = 0; i < 3; i++) {
			System.out.printf("Digite o %dº número: ", i + 1);
			numeros[i] = entrada.nextInt();
		}
		
		int maior = numeros[0];
		int menor = numeros[0];
		
		for (int i = 1; i < 3; i++) {
			if (numeros[i] > maior) {
				maior = numeros[i];
			} else if (numeros[i] < menor) {
				menor = numeros[i];
			}
		}
		
		System.out.println(maior);
		System.out.println(menor);
		
		entrada.close();
	}

}
