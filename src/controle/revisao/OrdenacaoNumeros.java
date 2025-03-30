package controle.revisao;

import java.util.Arrays;
import java.util.Scanner;

public class OrdenacaoNumeros {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Quantos números deseja ordenar? ");
		int quantidade = entrada.nextInt();
		
		if (quantidade < 0) {
			System.out.println("Informe um número maior que 0!");
		} else {
			int[] numeros = new int[quantidade];

			for (int i = 0; i < quantidade; i++) {
				System.out.printf("Digite o %dº número: ", i + 1);
				numeros[i] = entrada.nextInt();
			}
			
			// Ordena os números do Array em ordem crescente
			Arrays.sort(numeros);

			System.out.print("Números em ordem crescente: ");
			for (int i = 0; i < quantidade; i++) {
				System.out.print(numeros[i] + " ");
			}
			entrada.close();
		}
	}
}
