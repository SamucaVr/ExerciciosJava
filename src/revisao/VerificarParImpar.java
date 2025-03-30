package revisao;

import java.util.Scanner;

public class VerificarParImpar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		int numeroDigitado = entrada.nextInt();
		
		String parImpar = numeroDigitado % 2 == 0 ? "par" : "ímpar";
		System.out.printf("O número %d é %s.", numeroDigitado, parImpar);
		
		entrada.close();
	}

}
