package fundamentos;

public class Temperatura {
	
	public static void main(String[] args) {
		
		final int AJUSTE = 32;
		final double FATOR = 5 / 9.0;
		
		double fahrenheint = 84.6;
		double celsius = (fahrenheint - AJUSTE) * FATOR;
		System.out.printf("O resultado da temperatura é: %.2f°C", celsius);
		
		fahrenheint = 150;
		celsius = (fahrenheint - AJUSTE) * FATOR;
		System.out.printf("\nO resultado da temperatura é: %.2f°C", celsius);
	}
}
