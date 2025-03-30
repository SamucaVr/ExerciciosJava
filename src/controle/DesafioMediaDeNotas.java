package controle;

import java.util.Scanner;

public class DesafioMediaDeNotas {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite a primeira nota: ");
		double nota1 = entrada.nextDouble();
		System.out.print("Digite a segunda nota: ");
		double nota2 = entrada.nextDouble();
		
		double media = (nota1 + nota2) / 2;
		
		if (media >= 7) {
			System.out.println("Aluno aprovado!");
		} else if (media < 7 && media >= 4) {
			System.out.println("Aluno em recuperação!");
		} else {
			System.out.println("Aluno reprovado!");
		}
		
		entrada.close();
	}
}
