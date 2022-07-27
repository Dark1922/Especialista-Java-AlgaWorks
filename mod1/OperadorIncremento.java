package algaworks.mod1;

public class OperadorIncremento {

    public static void main(String[] args) {
        int totalDowloads = 10;

       // totalDowloads = totalDowloads +1;
        //totalDowloads += 1;
       // totalDowloads++; //pos fixada
        // totalDowloads--; // pre fixada
        int novoTotalDowlods = --totalDowloads;

         novoTotalDowlods = ++totalDowloads;

        System.out.println("Total de dowloads: " + totalDowloads);
        System.out.println("Novo Total de dowloads: " + novoTotalDowlods);
    }
}
