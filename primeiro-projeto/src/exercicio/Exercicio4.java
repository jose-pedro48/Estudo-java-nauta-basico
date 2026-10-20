package exercicio;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double celsius;
        double fahrenheit;

        System.out.println("digite a temperatura em celsius");
        celsius = input.nextDouble();
        fahrenheit = (celsius * 1.8) + 32;

        DecimalFormat celsiusParaFahrenheit = new DecimalFormat("#.#");
        System.out.println("Comversão do grau celsius para fahrenheit: " + celsiusParaFahrenheit.format(fahrenheit )+ " gF");

        System.out.printf("A temperatura convertida de celsius para fahrenheit: %.1f", fahrenheit );

        input.close();
    }
}
