package algaworks.mod2;

import java.util.Scanner;

public class ExameVitaminaD {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Grupo de risco: ");
        boolean grupoRisco = entrada.nextBoolean();


        System.out.print("Vitamina D: ");
        double vitaminaD = entrada.nextDouble(); //nanograma por milimetro

        boolean vitaminaDNormal = (!grupoRisco && vitaminaD >20)
                || (grupoRisco && vitaminaD >= 30 && vitaminaD <= 60);
        //sem o sinal de negação é verdadeiro se tiver o de negação é pq é false

        System.out.printf("Vitamina D normal: %b%n", vitaminaDNormal);

    }
}
