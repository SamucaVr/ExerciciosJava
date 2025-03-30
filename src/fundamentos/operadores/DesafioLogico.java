package fundamentos.operadores;

public class DesafioLogico {

	public static void main(String[] args) {
		// se os dois trabalhos derem certo, vai comprar uma tv de 50'
		// se apenas um trabalho der certo, vai comprar uma tv de 32'
		// comprando uma tv de 50' ou 32', a família vai para o shopping tomar sorvete
		// se os trabalhos não derem certo, a família não vai tomar sorvete
		
		boolean trabalho1 = true;
		boolean trabalho2 = false;
		
		boolean comprouTv50 = trabalho1 && trabalho2;
		boolean comprouTv32 = trabalho1 ^ trabalho2;
		boolean tomarSorvete = trabalho1 || trabalho2;
		boolean ficouSaudavel = !tomarSorvete;
		
		System.out.println("Comprou uma Tv de 50': " + comprouTv50);
		System.out.println("Comprou uma Tv de 32': " + comprouTv32);
		System.out.println("Foi tomar sorvete no Shopping: " + tomarSorvete);
		System.out.println("A família ficou mais saudável: " + ficouSaudavel);
		
		
	}

}
