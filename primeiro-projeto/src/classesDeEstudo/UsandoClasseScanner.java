package classesDeEstudo;

import java.util.Scanner;

public class UsandoClasseScanner {
    public static void main(String[] args) {
        Scanner entrar = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int numero = entrar.nextInt();
        int numero2 = numero + 3;
        System.out.println(numero);
        System.out.println(numero2);

        entrar.close();
    }
}
