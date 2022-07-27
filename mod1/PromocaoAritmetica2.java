package algaworks.mod1;

public class PromocaoAritmetica2 {

    public static void main(String[] args) {
        long x = 10;
        float y = 5.38F;
      //  long z = x * y; n compila
        float z = x * y; //float leva vantagem por ser um tipo flutuante
        System.out.println(z);
    }
}
