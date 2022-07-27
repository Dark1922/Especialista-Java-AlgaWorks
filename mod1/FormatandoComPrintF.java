package algaworks.mod1;

public class FormatandoComPrintF {

    public static void main(String[] args) {
        String nome1 = "João";
        //%s substitua uma string , %n pula uma linha
        System.out.printf("Olá, %s%n", nome1);

        int quantidade = 48;
        System.out.printf("Quantidade: %d itens %n", quantidade);

        double peso = 938.22;
        System.out.printf("Peso: %10.2f%n", peso); // .2f tamanho da precisão , caracteres que queremos
        //vai dar espaços em branco se não tiver o tamanho 10 pading
    }
}
