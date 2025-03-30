package fundamentos;

import java.util.Scanner;

public class TestesDaLinguagem {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		boolean temDinheiro = false;
		boolean taFazendoSol = false;
		String resposta;
		
		System.out.println("Você tem dinheiro?");
		resposta = entrada.next().replace("sim", "true");
		temDinheiro = Boolean.parseBoolean(resposta);
		
		System.out.println("Tá fazendo sol?");
		resposta = entrada.next().replace("sim", "true");
		taFazendoSol = Boolean.parseBoolean(resposta);
		
		
		if(temDinheiro && taFazendoSol) {
			System.out.println("Vou sair!");
		} else {
			System.out.println("Não vou sair!");
		}
		
		entrada.close();
	}
}
