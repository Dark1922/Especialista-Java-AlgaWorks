package algaworks.mod1;

public class ConversaoLongParaInt {

    public static void main(String[] args) {
        long x = 10;
        int y = (int) x;
        System.out.println(y);

        long a = 9300000035L;
        int b = (int) a;

        System.out.println(b); //710065443 vai imprimir perdeu o valor pq no int cabe menos que a variavel long

        //int para long

        int z = 13242;
        long t =  z; // roda um cast automático pq o long é maior que o int ent é sem problema o long aceitar o valor do int
//conversão implicita int = 32 bits long = 64 bits
       // long t = (long) z; casting opcional
        System.out.println(t);
    }
}
