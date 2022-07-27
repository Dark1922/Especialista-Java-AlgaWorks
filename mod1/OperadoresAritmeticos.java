package algaworks.mod1;

public class OperadoresAritmeticos {

    public static void main(String[] args) {

        int minhaIdade = 22;
        int suaIdade = 20;

        //adição
        int totalIdade = minhaIdade + suaIdade;
        System.out.println("O total das idade é: " + totalIdade);

        //subtração
        int diferencaIdade = minhaIdade - suaIdade;
        System.out.println("Diferença das idade: " +diferencaIdade);

        //Multiplicação
        int multiplicacaoDaIdade = minhaIdade * suaIdade;
        System.out.println("Multiplicação das idade: " + multiplicacaoDaIdade);

        //Divisão
        int divisaoIdade = minhaIdade / 2;
        System.out.println("Divisão das idade: " + divisaoIdade);

        //Resto da Divisão
        int restoDaDivisao = 7 % 2;
        System.out.println("Resto da Divisão: " + restoDaDivisao);

    }
}
