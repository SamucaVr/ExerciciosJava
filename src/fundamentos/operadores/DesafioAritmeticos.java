package fundamentos.operadores;

public class DesafioAritmeticos {

	public static void main(String[] args) {
		int numeradorA = 6 * (3 + 2);
		int denominadorA = 3 * 2;
		int operacaoA = (int) Math.pow(numeradorA, 2) / denominadorA;
		
		int numeradorB = (1 - 5) * ( 2 - 7 ) / 2;
		int operacaoB = (int) Math.pow(numeradorB, 2);
		int resultado = (int) Math.pow((operacaoA - operacaoB), 3) / (int) Math.pow(10, 3);
		
		System.out.println("Expressão: {{6*(3+2}^2/3x2 - ((1-5)x(2-7)/2)^2}^3 / 10^3");
		System.out.println("Resultado da expressão: " + resultado);
		System.out.println("Resultado esperado: 125");
		

	}

}
