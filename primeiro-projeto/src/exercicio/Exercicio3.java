package exercicio;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite sua idade: ");
        int idade = input.nextInt();

        int diasVividos = idade * 365;
        System.out.println("A quantidade de dias vividos: " + diasVividos + " dias");

        input.close();
    }
}
