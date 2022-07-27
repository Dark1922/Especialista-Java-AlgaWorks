package algaworks.mod2;

public class CurtoCircuitoOperadorLogico {

    public static void main(String[] args) {
        int x =10;
        int y =20;

        boolean resultado = x == 15 && y++ == 20; //y retorna 20 pq o primeiro resultado é falso curto circuito
        boolean resultadoy = x == 10 && y++ == 20; //y retorna 21 pq foi true e vai avaliar a proxima condição
        boolean resultadoyou = x == 10 ||  y++ == 20; //y retorna 20 pq só uma pode ser verdadeira
        System.out.println(resultado);
        System.out.println(y);
    }
}
