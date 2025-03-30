package fundamentos;

public class TiposPrimitivos {

	public static void main(String[] args) {
		// Informações do funcionário

		// Tipos numéricos inteiros
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 234556;
		long pontosAcumulados = 3_134_845_223L;
		
		// Tipos numéricos reais
		float salario = 11_445.42F;
		double vendasAcumuladas = 2_991_797_103.01;
		
		// Tipo booleano
		boolean estaDeFerias = false; // true
		
		// Tipo caracter
		char status = 'a'; // Ativo
		
		// Dias de empresa
		int diasTrabalhados = anosDeEmpresa * 365;
		System.out.println("Dias trabalhados: " + diasTrabalhados);
		
		int horasTrabalhadas = diasTrabalhados * 24;
		System.out.println("Horas trabalhadas: " + horasTrabalhadas);
		
		int minutosTrabalhados = horasTrabalhadas * 60;
		System.out.println("Minutos trabalhados: " + minutosTrabalhados);
		
		// Número de viagens
		System.out.println("Número de voos: " + numeroDeVoos / 2);
		
		// Pontos por real
		System.out.println(pontosAcumulados / vendasAcumuladas);
		
		System.out.println(id + ": id ganha -> " + salario);
		System.out.println("Férias? " + estaDeFerias);
		System.out.println("Status: " + status);
		
	}

}
