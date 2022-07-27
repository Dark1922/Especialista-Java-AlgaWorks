    package algaworks.mod2;

public class PrecedenciaOperadoresLogicos {

    public static void main(String[] args) {
        int x =10;
        int y =20;

        boolean resultado = x == 13 && x == 15 ||  y == 20; //true pq tem o ||
        boolean resultadot = (x == 13 && x == 15) ||  y == 20; //facilita a leitura do código do resultado acima
        boolean resultadox = x == 13 && (x == 15 ||  y == 20); //false pq o x é falso é 10 n 13
        //operador && tem precedencia ou procedencia ele é sempre avaliado primeiro dps o ||
        System.out.println(resultadox);
        System.out.println(y);
    }
}
