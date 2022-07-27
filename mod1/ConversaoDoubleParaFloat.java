package algaworks.mod1;

public class ConversaoDoubleParaFloat {

    public static void main(String[] args) {
        double peso1 = 20.4;
        float peso2 = (float) peso1;
        System.out.println(peso2);

        float taxa1 = 983.5F;
        double taxa2 = taxa1; //float é menor q double faz cast implicito automático
        System.out.println(taxa2);
    }
}
