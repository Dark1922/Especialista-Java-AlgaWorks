package algaworks.OrientacaoObjeto.Aula03;

public class Principal {

    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.setCor("Vermelho");
        carro.setAnoFabricacao(2022);
        carro.setFabricante("BMW");

        System.out.println(carro.toString());
    }
}
