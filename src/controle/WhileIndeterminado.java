package controle;

import java.util.Scanner;

public class WhileIndeterminado {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String mensagem = "";
		
		while(!mensagem.equalsIgnoreCase("sair")) {
			System.out.print("Você diz: ");
			mensagem = entrada.nextLine();
		}
		
		System.out.println("Você saiu do loop!");
		
		entrada.close();
	}
}
