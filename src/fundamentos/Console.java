package fundamentos;

import java.util.Scanner;

public class Console {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o seu nome: ");
		String nome = entrada.nextLine();
		System.out.print("Digite o seu sobrenome: ");
		String sobrenome = entrada.nextLine();
		System.out.print("Digite a sua idade: ");
		int idade = entrada.nextInt();
		entrada.close();
		
		System.out.printf("%s %s tem %d anos.", nome, sobrenome, idade);
		
		
	}

}
