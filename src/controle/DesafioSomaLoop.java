package controle;

import java.util.Scanner;

public class DesafioSomaLoop {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int numerodigitado = 0;
		int soma = 0;
		
		while (numerodigitado >= 0) {
			System.out.print("Digite um número: ");
			numerodigitado = entrada.nextInt();
			
			if (numerodigitado > 0) {
				soma += numerodigitado;
			}
			System.out.println("A soma dos números: " + soma);				
		}
		
		entrada.close();
	}
}
