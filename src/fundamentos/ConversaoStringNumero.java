package fundamentos;

import javax.swing.JOptionPane;

public class ConversaoStringNumero {

	public static void main(String[] args) {
		String num1 = JOptionPane.showInputDialog("Digite um número:");
		String num2 = JOptionPane.showInputDialog("Digite um número:");
		
		double numero1 = Double.parseDouble(num1);
		double numero2 = Double.parseDouble(num2);
		double soma = numero1 + numero2;
		
		System.out.println("Soma é : " + soma);
		System.out.println("Média é: " + soma / 2);
//		String num1 = "2";
//		System.out.println(Integer.parseInt(num1) + 2);

	}

}
