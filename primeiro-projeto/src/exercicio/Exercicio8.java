package exercicio;

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        // Receber valor em metros e mostrar em centimetros
        Scanner teclado = new Scanner(System.in);

        double metro;
        double centimetro;

        System.out.println("Digite a metragem: ");
        metro = teclado.nextDouble();

        centimetro = metro * 100;

        System.out.println("A metragem digitada: " + metro + "m"+ " convertido em centimetros: " + centimetro + "cm");
        System.out.printf(" convertido em centimetros: %.2f" , centimetro );


        teclado.close();
    }
}
