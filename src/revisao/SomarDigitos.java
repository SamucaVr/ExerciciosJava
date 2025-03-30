package revisao;

import java.util.Scanner;

/*
 * Objetivo: Crie um programa que solicite ao usuário um número
 * inteiro positivo e calcule a soma de todos os seus dígitos.
 */

public class SomarDigitos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		Character conversao;
		int valorFinal = 0;
		
		System.out.print("Digite um número: ");
		Integer numeroDigitado = entrada.nextInt();
		
		for (int i = 0; i < numeroDigitado.toString().length(); i++) {
			conversao = numeroDigitado.toString().charAt(i);
			valorFinal += Integer.parseInt(conversao.toString());
		}
		
		System.out.println(valorFinal);
		
		entrada.close();
		
	}

}
