package algaworks.mod2;

public class OperadoresIguaisNegacao {
    public static void main(String[] args) {

        boolean operadorIgualdade = 2 == 2;
        boolean operadorugais = (4 + 6) == (5 * 2);
        int numero = 10;
        int numero2 = 11;
        boolean teste1 = numero == 10;
        boolean numerosIguais = numero == numero2;
        boolean numerosDiferentes = !numerosIguais; //negando que os numeros n sao iguais ai fira verdadeiro
        boolean numerosDiferentes2 = !(numero == numero2); //negando que os numeros n sao iguais ai fira verdadeiro
        boolean teste3 = 3 != 4; // not equals

        String nome = "João";
        String nome2 = "Joãow";
        boolean nomeIgual = nome == nome2; //forma inadequado para diferenciar string

        System.out.println(operadorIgualdade);
        System.out.println(operadorugais);
        System.out.println(teste1);
        System.out.println(numerosIguais);
        System.out.println(numerosDiferentes);
        System.out.println(numerosDiferentes2);
        System.out.println(teste3);
        System.out.println(nomeIgual);
    }
}
