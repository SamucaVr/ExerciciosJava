package controle.revisao;

import java.util.Scanner;

public class CondicionaLComposta {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Informe a idade: ");
		int idade = entrada.nextInt();
		
		if (idade < 0) {
			System.out.println("Informe um valor maior que 0!");
		} else if (idade >= 0 && idade <= 13) {
			System.out.println("Você é criança.");
		} else if (idade > 12 && idade <= 17) {
			System.out.println("Você é adolescente.");
		} else if (idade > 17 && idade <= 64) {
			System.out.println("Você é adulto.");
		} else {
			System.out.println("Você é idoso.");
		}
		
		entrada.close();
	}
}
