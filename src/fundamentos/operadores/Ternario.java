package fundamentos.operadores;

public class Ternario {
	public static void main(String[] args) {
		
		double media = 7.5;
		String resultadoParcial = media >= 5 ? "Em recuperação." : "Reprovado.";
		String resultadoFinal = media >= 7 ? "Aprovado." : resultadoParcial;
		
		boolean bomComportamento = true;
		boolean passouPorMedia = media >= 7;
		boolean temDesconto = bomComportamento && passouPorMedia;
		
		String motivo = !bomComportamento ? "Comportamento não está de acordo com as normas da promoção." : !passouPorMedia ? "Média abaixo do esperado." : "Tudo certo.";
		String resultado = temDesconto ? "Sim." : "Não.";
		
		System.out.println("O aluno está " + resultadoFinal);
		System.out.printf("Tem desconto? %s \nMotivo: %s", resultado, motivo);
		
	}
}
