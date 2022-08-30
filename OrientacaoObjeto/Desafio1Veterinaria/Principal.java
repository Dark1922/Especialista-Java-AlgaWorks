package algaworks.OrientacaoObjeto.Desafio1Veterinaria;

public class Principal {

   public static void main(String[] args) {

       Cachorro cachorro = new Cachorro();

       System.out.println("informações dos cachorros:");

       cachorro.setNome("bob");
       cachorro.setRaca("bigol");
       cachorro.setSexo('M');
       cachorro.setIdade(18);

       System.out.printf("Cachorro 1: %n%n");

       System.out.printf("Nome do cachorro: %s%n" , cachorro.getNome());
       System.out.printf("Raça: %s%n" , cachorro.getRaca());
       System.out.printf("Sexo: %s%n" , cachorro.getSexo());
       System.out.printf("idade: %d%n%n" , cachorro.getIdade());

       Cachorro cachorro1 = new Cachorro();

       cachorro1.setNome("Rafael");
       cachorro1.setRaca("Ilhazapsu");
       cachorro1.setSexo('M');
       cachorro1.setIdade(17);

       System.out.printf("Cachorro 2: %n%n");

       System.out.printf("Nome do cachorro: %s%n" , cachorro1.getNome());
       System.out.printf("Raça: %s%n" , cachorro1.getRaca());
       System.out.printf("Sexo: %s%n" , cachorro1.getSexo());
       System.out.printf("idade: %d%n%n" , cachorro1.getIdade());
   }
}
