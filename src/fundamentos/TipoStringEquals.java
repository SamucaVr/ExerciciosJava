package fundamentos;

import java.util.Scanner;

public class TipoStringEquals {
	public static void main(String[] args) {
		String nome1 = new String("Samuel");
		
		System.out.println("Samuel".equals(nome1));
		
		Scanner entrada = new Scanner(System.in);
		String nome2 = entrada.next();
		
		System.out.println("Daniel".equals(nome2));
		entrada.close();
	}
}
