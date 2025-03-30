package fundamentos.desafios;

import java.util.Scanner;

public class DesafioConversaoRv {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o primeiro salário: ");
		String primeiroSalario = entrada.next().trim().replace(",", ".");
		System.out.print("Digite o segundo salário: ");
		String segundiSalario = entrada.next().trim().replace(",", ".");
		System.out.print("Digite o terceiro salário: ");
		String terceiroSalario = entrada.next().trim().replace(",", ".");
		
		double conversao1 = Double.parseDouble(primeiroSalario);
		double conversao2 = Double.parseDouble(segundiSalario);
		double conversao3 = Double.parseDouble(terceiroSalario);
		double media = (conversao1 + conversao2 + conversao3) / 3;
		
		System.out.printf("A média dos três últimos salários foi: R$%.2f", media);
		
		entrada.close();
	}
}
