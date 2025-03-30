package fundamentos.desafios;

import java.util.Scanner;

public class DesafioCalculadora {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		double numero1 = entrada.nextInt();
		System.out.print("Digite outro número: ");
		double numero2 = entrada.nextInt();
		
		System.out.println("Escolha a operação: (+ - * / %)");
		String operacao = entrada.next();
		
		double resultado = operacao.equals("+") ? numero1 + numero2 : 0;
		resultado = operacao.equals("-") ? numero1 - numero2 : resultado;
		resultado = operacao.equals("*") ? numero1 * numero2 : resultado;
		resultado = operacao.equals("/") ? numero1 / numero2 : resultado;
		resultado = operacao.equals("%") ? numero1 % numero2 : resultado;
		
		if (operacao.equals("/")) {
			System.out.printf("Resultado = %.2f", resultado);
		} else {
			System.out.printf("Resultado: " + (int) resultado);			
		}
		
		entrada.close();
	}
}
