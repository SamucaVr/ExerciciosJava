package revisao;

import java.util.Scanner;

public class CalcularPotencia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int resultado = 1;

		System.out.print("Digite a base: ");
		int base = entrada.nextInt();
		System.out.print("Digite o expoente: ");
		int expoente = entrada.nextInt();

		for (int i = 0; i < expoente; i++) {
			resultado *= base;
		}

		System.out.printf("Resultado: %d elevado a %d é %d", base, expoente, resultado);

		entrada.close();

		
		// Correção do Copilot
//		Scanner entrada = new Scanner(System.in);
//
//		System.out.print("Digite a base: ");
//		int base = entrada.nextInt();
//		System.out.print("Digite o expoente: ");
//		int expoente = entrada.nextInt();
//
//		double resultado = 1; // Resultado inicializado como 1 para tratar expoente 0
//
//		if (expoente > 0) {
//			// Calcula a potência para expoente positivo
//			for (int i = 1; i <= expoente; i++) {
//				resultado *= base;
//			}
//		} else if (expoente < 0) {
//			// Calcula a potência para expoente negativo
//			for (int i = 1; i <= -expoente; i++) {
//				resultado *= base;
//			}
//			resultado = 1 / resultado; // Inverte o valor para expoente negativo
//		}
//
//		// Expoente 0 já está coberto, pois resultado inicial é 1
//
//		System.out.printf("Resultado: %d elevado a %d é %.2f%n", base, expoente, resultado);
//
//		entrada.close();
	}

}
