package controle.revisao;

import java.util.Scanner;

public class DivisaoSegura {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        try {
            System.out.print("Digite o dividendo: ");
            int dividendo = entrada.nextInt();

            System.out.print("Digite o divisor: ");
            int divisor = entrada.nextInt();

            int resultado = dividendo / divisor; // Isso pode gerar uma exceção se divisor for 0
            System.out.println("O resultado da divisão é: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Erro: Divisão por zero não é permitida.");
        } catch (Exception e) {
            System.out.println("Erro: Entrada inválida.");
        } finally {
            entrada.close();
            System.out.println("Programa finalizado.");
        }
    }
}
