package fundamentos.desafios;

import java.util.Scanner;

public class DesafioConversaoCorrecao {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o primeiro salário: ");
		String primeiroSalario = entrada.next().replace(",", ".");
		System.out.print("Digite o segundo salário: ");
		String segundoSalario = entrada.next().replace(",", ".");
		System.out.print("Digite o terceiro salário: ");
		String terceiroSalario = entrada.next().replace(",", ".");
		
		double conversao1 = Double.parseDouble(primeiroSalario);
		double conversao2 = Double.parseDouble(segundoSalario);
		double conversao3 = Double.parseDouble(terceiroSalario);
		double media = (conversao1 + conversao2 + conversao3) / 3;
		
		System.out.printf("Média dos últimos pagamentos: %.2f", media);
		
		entrada.close();
	}
}
