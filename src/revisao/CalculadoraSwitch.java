package revisao;

import java.util.Scanner;

public class CalculadoraSwitch {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite um número: ");
		int valorA = entrada.nextInt();
		System.out.print("Digite um número: ");
		int valorB = entrada.nextInt();

		int resultado = 0;

		System.out.print("Escolha um operador: [+ - * /]");
		String operador = entrada.next();

		switch (operador) {
		case "+":
			resultado = valorA + valorB;
			break;
		case "-":
			resultado = valorA - valorB;
			break;
		case "*":
			resultado = valorA * valorB;
			break;
		case "/":
			if (valorB != 0) {
				resultado = valorA / valorB;				
			} else {
				System.out.println("Não é possível fazer uma divisão por 0!");
			}
			break;
		default:
			System.out.println("Operador inválido!");
		}
		
		System.out.println("O resultado é: " + resultado);

		entrada.close();
	}
}
