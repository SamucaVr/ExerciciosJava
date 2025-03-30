package revisao;

import java.util.Scanner;

public class InverterString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite uma palavra ou frase: ");
		String palavra = entrada.nextLine().trim();
		
		String resultado = "";
		
		for (int i = palavra.length() - 1; i >= 0; i--) {
			resultado += palavra.charAt(i);
		}
		
		System.out.printf("A palavra \"%s\" invertido é: %s", palavra, resultado);
		
		entrada.close();
	}

}
