package controle.revisao;

import java.util.Scanner;

public class MediaNotas {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		double[] notas = new double[5];
		double soma = 0;
		
		for (int i = 0; i < 5; i++) {
			System.out.printf("Digite a %dª nota: ", i + 1);
			notas[i] = entrada.nextDouble();
			
			if (notas[i] >=0 && notas[i] <= 10) {
				soma += notas[i];				
			} else {
				System.out.println("Nota inválida!");
				i--;
			}
		}
		double media = soma / notas.length;
		
		if (media >= 7) {
			System.out.println("Aluno aprovado!");
		} else {
			System.out.println("Aluno Reprovado!");
		}
		
		entrada.close();
	}
}
