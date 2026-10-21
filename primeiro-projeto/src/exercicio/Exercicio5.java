package exercicio;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       int hora;
        double ganhoHora;

        System.out.println("digite quanto ganha em hora: ");
        hora = input.nextInt();
        System.out.println("digite o valor da hora");
        ganhoHora = input.nextDouble();

        double salario = hora * ganhoHora;

        System.out.printf("O valor do salário é: R$%.2f", salario);
    }
}
