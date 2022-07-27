package algaworks.mod2;

public class OperadoresComparacao {

    public static void main(String[] args) {

    int pesoProduto = 900;
    int limitePesoCaminhao = 1000;

    boolean cargaExedida = pesoProduto > limitePesoCaminhao;

        System.out.printf("Carga excedida: %b%n", cargaExedida);

        boolean cargaLiberado = pesoProduto <= limitePesoCaminhao;

        System.out.printf("Carga Liberada: %b%n", cargaLiberado);

    }
}
