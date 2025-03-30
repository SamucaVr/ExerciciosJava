package revisao;

import java.util.Scanner;

public class OperacaoBasicas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o primeiro número: ");
		int valorA = entrada.nextInt();
		System.out.print("Digite o segundo número: ");
		int valorB = entrada.nextInt();
		
		int soma = valorA + valorB;
		int subtracao = valorA - valorB;
		int multiplicacao = valorA * valorB;
		int divisao = valorA / valorB;
		
		System.out.println("Resultado:");
		System.out.printf("Soma: %d\nSubtração: %d\nMultiplicação: %d\nDivisão: %d", soma, subtracao, multiplicacao, divisao);
	
		entrada.close();
	}

}
