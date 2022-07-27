package algaworks.mod1;

public class ExemploBoolean {

    public static void main(String[] args) {
        boolean compraAprovada = true;
        boolean clienteBloqueado = false;

        System.out.println(compraAprovada);
        System.out.println(clienteBloqueado);

        int quatidadeEstoque = 10;
        int quantidadeCompra = 9;

        boolean estoqueSuficiente = quatidadeEstoque >= quantidadeCompra;
        System.out.println("Estoque disponivel: " + estoqueSuficiente);
    }
}
