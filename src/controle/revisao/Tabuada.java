package controle.revisao;

import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite um número: ");
		int numeroDigitado = entrada.nextInt();
		
		if (numeroDigitado < 0) {
			System.out.println("Informe um valor maior que 0!");
		} else {
			for (int i = 1; i <= 10; i++) {
				System.out.printf("%d x %d = %d\n", numeroDigitado, i, numeroDigitado * i);
			}			
		}
		
		entrada.close();
	}
}
