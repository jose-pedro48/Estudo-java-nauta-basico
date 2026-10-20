package exercicio;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double nota1, nota2, nota3, media;

        System.out.println("digit a primeira nota: ");
        nota1 = input.nextDouble();
        System.out.println("digit a segunda nota: ");
        nota2 = input.nextDouble();
        System.out.println("digit a terceira nota: ");
        nota3 = input.nextDouble();

        media = (nota1 + nota2 + nota3) /3;

        // primeira forma de formatar a saida de dados double
        DecimalFormat formatado = new DecimalFormat("#.##");
        System.out.println("o resultado formatado: " + formatado.format(media));

        // segunda forma de formatar a saida de dados double
        System.out.printf("A média da nota do semestre: %.1f ",media);


        input.close();
    }
}
