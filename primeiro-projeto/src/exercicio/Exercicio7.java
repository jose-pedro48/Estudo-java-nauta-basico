package exercicio;

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        // Receber a base e altura de um retângulo e caucular a área
        Scanner teclado = new Scanner(System.in);

        double base;
        double altura;
        double area;
        int opcao;


        // Inicializamos a variável com 'S' para garantir que ela entre no WHILE na primeira vez
        char resposta = 'S';

        // O loop continua ENQUANTO a resposta for 'S' (Maiúscula)
        while (resposta == 'S') {

            System.out.print("\nescolha qual medida você vai usar: \n"
                    +"usar 1 = Centimetro \n"
                    +"uar 2 = metro \n"
                    +"usar 3 = quilometros \n");
            System.out.println("Digita a opção: ");
            opcao = teclado.nextInt();

            System.out.println("Digite o número base: ");
            base = teclado.nextInt();
            System.out.println("Digite o número da altura: ");
            altura = teclado.nextInt();

            area = base * altura;

            switch(opcao) {

                case 1:
                    System.out.print("A área do retangulo é: " + area + " Cm²");
                    break;

                case 2:
                    System.out.print("A área do retangulo é: " + area + " m²");
                    break;

                case 3:
                    System.out.print("A área do retangulo é: " + area + " k²");
                    break;
                default:
                    System.out.println("O número digitado incorreto! ");
                    break;
            }

            System.out.print("\nDeseja repetir a ação? (S para Sim / N para Não): ");

            // Captura o caractere digitado e o converte imediatamente para MAIÚSCULO
            resposta = Character.toUpperCase(teclado.next().charAt(0));
        }

        // Mensagem exibida assim que o usuário digita 'N' (ou qualquer outra tecla diferente de 'S')
        System.out.println("\nVocê digitou '" + resposta + "'. Programa encerrado com sucesso!");

        teclado.close();
    }
}
