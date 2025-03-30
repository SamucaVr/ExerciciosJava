package fundamentos;

import java.util.Scanner;

public class NotacaoPonto {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite o usuário: ");
		String usuario = input.nextLine();
		System.out.print("Digite a senha: ");
		String senha = input.next();
		input.close();
		
		// Método usado para converter a cadeia de caracteres
		String processarUsuario = usuario.toUpperCase();
		String processarSenha = senha.toUpperCase();
		
		System.out.println("Usuário: " + processarUsuario);
		System.out.println("Senha: " + processarSenha);
		
		String mensagem = "Bom dia, X!";
		String user = "Samuel";
		
		/*
		 *  Método usado para trocar letras/palavras por outras
		 *  Ou por um valor guardado em uma variável
		 */
		mensagem = mensagem.replace("X", user);
		mensagem += mensagem.concat("Oi");
		System.out.println(mensagem);
		
		// Tipos primitivos não tem o operador "."
//		int a = 5;
//		a.
	}
}
