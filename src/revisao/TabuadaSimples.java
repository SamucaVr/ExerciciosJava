package revisao;

import java.util.Scanner;

public class TabuadaSimples {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		int valorA = entrada.nextInt();
		int produto = 0;
		
		for (int i = 1; i <= 10; i++) {
			produto = valorA * i;
			System.out.printf("%d x %d = %d\n", valorA, i, produto);
		}
		
		entrada.close();
	}
}
