package exercicio;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero1, numero2;

        System.out.println("digite o primeiro número inteiro ");
        numero1 = input.nextInt();
        System.out.println("digite o segundo número inteiro ");
        numero2 = input.nextInt();

        int soma = numero1 + numero2;
        System.out.println("A soma dos números inteiros é: " + soma);

        input.close();
    }
}
