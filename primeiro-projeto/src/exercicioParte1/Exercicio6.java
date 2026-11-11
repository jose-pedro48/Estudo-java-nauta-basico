package exercicioParte1;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        // Receba um número inteiro e mostre: número antecessor, número atual e sucessor.
        Scanner numero = new Scanner(System.in);
        int receberNumero;
        int antecessor;
        int sucessor;
        System.out.println("Digite um número ");
        receberNumero = numero.nextInt();

        antecessor = receberNumero-1;
        sucessor = receberNumero +1;

        System.out.println("e esse é o antes " + antecessor + "\nesse é o número digitado: " + receberNumero + "\no número depois dele é " + sucessor);

        numero.close();
    }
}
