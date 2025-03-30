package fundamentos;


public class TipoString {

	public static void main(String[] args) {
		
		String pessoa = "Samuel";
		String mensagem = "Bom dia, x";
		
		mensagem =  mensagem.concat("!"); // Método para concatenar
		System.out.println(mensagem);
		
		mensagem = mensagem.replace("x", pessoa);// Método para trocar os valores de uma string
		System.out.println(mensagem);
		
//		mensagem = mensagem.repeat(0);
//		System.out.println(mensagem);
		
		System.out.println(mensagem.length()); // Retorna a quantidade de caracteres
		System.out.println(mensagem.equalsIgnoreCase("bom dia, Samuel!"));
		System.out.println(mensagem.charAt(0)); // Retorna a letra no indice indicado
		System.out.println(mensagem.startsWith("Bom"));
		System.out.println(mensagem.toLowerCase().startsWith("bom"));
		System.out.println(mensagem.endsWith("x"));
		System.out.println(mensagem.contains("dia")); // Verifica sem dentro da frase possui alguma coisa
		System.out.println(mensagem.indexOf("dia"));
		System.out.println(mensagem.substring(4, 7));
		
		/* Exemplo do suposto método usado no login Avatim
			String usuario = "DeBoRA.c";
			String senha = "dC123";
			String processarUsuario = usuario.toUpperCase();
			String processarSenha = senha.toUpperCase();
			
			System.out.printf("\n\nUsuário: %s\nSenha: %s", processarUsuario, processarSenha);
		*/
		
	}
}
