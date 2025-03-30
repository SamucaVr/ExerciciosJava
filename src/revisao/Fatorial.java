package revisao;

/*
 * Objetivo: Crie um programa que solicite ao usuário um número inteiro
 * positivo e calcule o fatorial desse número.
 */
import java.util.Scanner;

public class Fatorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		int numeroDigitado = entrada.nextInt();
		
		if (numeroDigitado < 0) {
			System.out.println("O fatorial não é definido para números negativos!");
		} else {
			int fatorial = 1;
			
			for (int i = 1; i <= numeroDigitado; i++) {
				fatorial *= i;
			}
			
			System.out.printf("O fatorial de %d é: %d", numeroDigitado, fatorial);
		}
		entrada.close();
	}

}
