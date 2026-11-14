package exercicios.exercicioParte1;

import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        // Valor de desconto na compra
        Scanner teclado = new Scanner(System.in);

        System.out.println("Qual o valor da compra? ");
        double valorCompra = teclado.nextDouble();

        System.out.println("Qual o valor do desconto? ");
        double desconto = teclado.nextDouble();

        double valorPagar = valorCompra - (valorCompra * desconto) / 100.0;

        System.out.printf("Esse é o que vou pagar: R$ %.2f", valorPagar);

        teclado.close();
    }
}
