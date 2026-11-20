package exercicios.exercicioParte1;

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

        System.out.println("A metragem digitada: " + metro + "m"+ " convertido em centimetros: " + centimetro + " cm");// não precisa de formatação
     // System.out.printf("convertido em centimetros: %.2f", centimetro ); //2 zeros após a vírgula mais usado em moedas
        System.out.println("convertido em centimetros: " + String.format("%.1f", centimetro) + " cm" );//utilizado em metragem 1 casa após a vírgula para centimetro


        teclado.close();
    }
}
