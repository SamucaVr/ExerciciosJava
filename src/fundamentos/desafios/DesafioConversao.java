package fundamentos.desafios;

import java.util.Scanner;

public class DesafioConversao {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String separadorDecimal;
		boolean valido = false;
		
		do {			
			System.out.print("Digite o separador decimal (virgula(,) ou ponto(.)): ");
			separadorDecimal = entrada.next();
			
			if(!separadorDecimal.equals(",") && !separadorDecimal.equals(".")) {
				System.out.println("Digite uma opção válida!");
			} else {
				valido = true;
				System.out.println("\n\n\n\n");
			}
		} while (!valido);
		
		System.out.print("Digite o primeiro salário: ");
		String primeiroSalario = entrada.next();
		System.out.print("Digite o segundo salário: ");
		String segundoSalario = entrada.next();
		System.out.print("Digite o terceiro salário: ");
		String terceiroSalario = entrada.next();
		
		if(separadorDecimal.equals(",")) {
			primeiroSalario = primeiroSalario.replace(",", ".");
			segundoSalario = segundoSalario.replace(",", ".");
			terceiroSalario = terceiroSalario.replace(",", ".");
		}
		
		double conversao1 = Double.parseDouble(primeiroSalario);
		double conversao2 = Double.parseDouble(segundoSalario);
		double conversao3 = Double.parseDouble(terceiroSalario);
		double media = (conversao1 + conversao2 + conversao3) / 3;
		
		System.out.printf("Média dos últimos pagamentos: %.2f", media);
		
		entrada.close();
	}
}