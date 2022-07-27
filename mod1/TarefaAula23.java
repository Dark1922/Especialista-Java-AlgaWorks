package algaworks.mod1;

import java.util.Scanner;

public class TarefaAula23 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Nome: ");
        String nome = entrada.nextLine();

        System.out.print("Valor por hora: ");
        double valorHora = entrada.nextDouble();

        System.out.print("Horas Trabalhada: ");
        int horasTrabalhada = entrada.nextInt();

        System.out.print("Valor dos descontos: ");
        double valorDesconto = entrada.nextDouble();

       double valorPagamento = valorHora * horasTrabalhada;
       double calculoDesconto = valorPagamento - valorDesconto;

        System.out.printf("Folha de pagamento: %s%n", nome);
        System.out.printf("%d horas x R$ %.2f = %.2f%n", horasTrabalhada, valorHora,valorPagamento);
        System.out.printf("Descontos: R$ %.2f%n", valorDesconto);
        System.out.printf("Total Devido: R$ %.2f", calculoDesconto);

    }
}
