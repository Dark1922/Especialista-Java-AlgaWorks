package algaworks.mod2;

import java.util.Scanner;

public class CalculadoraIndiceMassaCorporal {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Peso: ");
        int peso = entrada.nextInt();

        System.out.print("Altura:  ");
        double altura = entrada.nextDouble();

        double imc = peso / (altura * altura);

        if(imc < 18.5) {
            System.out.printf("Peso abaixo do ideal: %b%n" , imc);
        }
        if(imc >= 18.5 && imc < 25) {
            System.out.printf("Peso ideal: %b%n" , imc);
        }
        if(imc >= 25 && imc < 30) {
            System.out.printf("Acima do peso: %b%n" , imc);
        }
        if(imc >= 30 && imc < 35) {
            System.out.printf("Obesidade grau I: %b%n" , imc);
        }
        if(imc >= 35 && imc < 40) {
            System.out.printf("Obesidade grau II: %b%n" , imc);
        }
        if(imc >= 40) {
            System.out.printf("Obesidade grau III: %b%n" , imc);
        }

        System.out.println("Fim do programa.");
    }
}
