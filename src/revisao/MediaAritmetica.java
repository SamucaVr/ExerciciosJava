package revisao;

import java.util.Scanner;

/*
 * Objetivo: Crie um programa que solicite ao usuário três números
 *  inteiros e calcule a média aritmética desses números.
 */
public class MediaAritmetica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int[] notas = new int[3];
		int soma = 0;
		
		for (int i = 0; i <= 2; i++) {
			System.out.printf("Digite a %dª nota: ", i + 1);
			notas[i] = entrada.nextInt();
			soma += notas[i];
		}
		
		double mediaAritmetica = (double) soma / 3; //Casting usado para garantir precisão 
		
		System.out.println("A média aritmética é: " + mediaAritmetica);
		
		entrada.close();
	}

}
