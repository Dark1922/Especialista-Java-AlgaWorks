package algaworks.mod1;

public class ExemploByteShort {


    public static void main(String[] args) {
    byte idade = 127; //valor máximo de númeri 127
//    byte idade = 128; //Não compilar
        System.out.println(idade);

//        short quatidadeEstoque = 32768; nao compila
        short quatidadeEstoque = 32767; // tamanho máximo
        System.out.println(quatidadeEstoque);
    }
}
