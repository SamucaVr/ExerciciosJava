package revisao;

import java.util.Scanner;

public class OrdenarNumeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int[] numeros = new int[3];
		
		for (int i = 0; i < 3; i++) {
			System.out.printf("Digite o %dº número: ", i + 1);
			numeros[i] = entrada.nextInt();
		}
		
		int aux = 0;
		
		System.out.print("Números em ordem crescente:");
		for (int i = 0; i < 3; i++) {
			for (int j = i + 1; j < 3; j++) {
				if (numeros[i] > numeros[j]) {
					aux = numeros[i];
					numeros[i] = numeros[j];
					numeros[j] = aux;
				}
			}
			System.out.print(" " + numeros[i]);
		}
		
		
		entrada.close();
	}

}
