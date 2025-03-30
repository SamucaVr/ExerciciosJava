package controle;

import java.util.Scanner;

public class DesafioWhile {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int notasValidas = 0;
		double total = 0;
		double notas = 0;
		
		while (notas != -1) {
			System.out.print("Digite a nota: ");
			notas = entrada.nextDouble();
			
			if(notas >= 0 && notas <= 10) {
				total += notas;
				notasValidas++;
			} else if(notas != -1) {
				System.out.println("A nota digitada é inválida! Tente novamente");
			}
		}
		
		double media = total / notasValidas;
		
		System.out.println("Notas válidas: " + notasValidas);
		System.out.printf("Média dos alunos: %.2f", media);
		entrada.close();
	}
}
