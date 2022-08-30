package algaworks.OrientacaoObjeto.Aula03;

public class Principal {

    public static void main(String[] args) {

        Carro carro = new Carro();

        carro.setCor("Vermelho");
        carro.setModelo("I8");
        carro.setAnoFabricacao(2022);
        carro.setFabricante("BMW");
        carro.proprietario = new Proprietario();
        carro.proprietario.setNome("João Victor");
        carro.proprietario.setCpf("058.212.751-30");
        carro.proprietario.setAnoNascimento(24101999);

        System.out.println("Meu Carro");
        System.out.println("--------------------");
        System.out.printf("Modelo: %s%n", carro.getModelo());
        System.out.printf("Cor: %s%n", carro.getCor());
        System.out.printf("Ano: %d%n", carro.getAnoFabricacao());
        System.out.printf("Fabricante: %s%n", carro.getFabricante());
        System.out.printf("Proprietário: %s%n", carro.proprietario.getNome());
        System.out.printf("Cpf: %s%n", carro.proprietario.getCpf());
        System.out.printf("Ano de Nascimento: %d%n", carro.proprietario.getAnoNascimento());

        //outra forma de instancia pessoa ligado a carro
        Proprietario eu = new Proprietario();
        eu.setNome("João Victor");
        eu.setCpf("058.212.751-30");
        eu.setAnoNascimento(24101999);
        Carro carro1 = new Carro();
        carro1.setCor("Vermelho");
        carro1.setModelo("I8");
        carro1.setAnoFabricacao(2022);
        carro1.setFabricante("BMW");
        carro1.proprietario = eu;

        System.out.println("Meu Carro1");
        System.out.println("--------------------");
        System.out.printf("Modelo: %s%n", carro1.getModelo());
        System.out.printf("Cor: %s%n", carro1.getCor());
        System.out.printf("Ano: %d%n", carro1.getAnoFabricacao());
        System.out.printf("Fabricante: %s%n", carro1.getFabricante());
        System.out.printf("Proprietário: %s%n", carro1.proprietario.getNome());
        System.out.printf("Cpf: %s%n", carro1.proprietario.getCpf());
        System.out.printf("Ano de Nascimento: %d%n", carro1.proprietario.getAnoNascimento());


    }
}
