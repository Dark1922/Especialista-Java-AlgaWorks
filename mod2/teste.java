package algaworks.mod2;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class teste {

    public static void main(String[] args) {

        DecimalFormat saida = new DecimalFormat("00.0000");

        double A= 1040.32;
        double B= 1049.00;
        double C= 1023.00;
        double media;

        media= ((A*2)+(B*3)+(C*5))/(2+3+5);

        String valorFormatado = NumberFormat.getCurrencyInstance().format(12005.11);
        System.out.println( valorFormatado );

        String valorFormatado1 = new DecimalFormat("#,##0.00").format(12005.11);
        System.out.println( valorFormatado1 );

        System.out.println("MEDIA = "+saida.format(media));


    }

}
