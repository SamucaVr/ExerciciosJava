package revisao;

import java.util.Scanner;

public class QuebrarNumero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite um número (até 4 dígitos): ");
		int numeroDigitado = entrada.nextInt();
		
		int milhar = numeroDigitado / 1000;
		int centena = (numeroDigitado % 1000) / 100;
		int dezena = (numeroDigitado % 100) / 10;
		int unidade = numeroDigitado % 10;
		
		System.out.println("Milhar: " + milhar);
		System.out.println("Centena: " + centena);
		System.out.println("Dezena: " + dezena);
		System.out.println("Unidade: " + unidade);
		
		entrada.close();
	}

}
