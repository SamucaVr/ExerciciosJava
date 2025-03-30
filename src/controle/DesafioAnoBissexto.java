package controle;

import java.util.Calendar;

public class DesafioAnoBissexto {

	public static void main(String[] args) {

		Calendar anoAtual = Calendar.getInstance();
		
		if (anoAtual.get(Calendar.YEAR) % 4 == 0) {
			System.out.println("O ano atual é bissexto.");
		} else {
			System.out.println("O ano atual não é bissexto.");
		}
		
	}
}
