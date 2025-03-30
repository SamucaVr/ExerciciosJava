package controle.revisao;

import java.util.Scanner;

public class MatrizSimples {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int[][] matriz = new int[3][3];
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.printf("Digite o número na posição [%d] [%d]: ", i, j);
				matriz[i][j] = entrada.nextInt();
			}
		}
		
		System.out.println("Tabela 3x3:");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.printf("[%d] ", matriz[i][j]);
			}
			System.out.println();
		}
		
		entrada.close();
	}
}
