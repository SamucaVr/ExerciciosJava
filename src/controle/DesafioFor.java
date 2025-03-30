package controle;

public class DesafioFor {

	public static void main(String[] args) {
		
		String valor = "#";
		for(int i = 1; i <= 5; i++) {
			System.out.println(valor);
			valor += "#";
		}
		
		// Modelo do desafio:
		// Não pode usar números para controlar o loop.
		
		for(String i = "#"; !i.equals("######"); i += "#") {
			System.out.println(i);
		}
		
	}
}
