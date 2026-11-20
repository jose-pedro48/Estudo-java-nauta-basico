package exercicios.exercicioParte1;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int hora;
        double ganhoHora;

        System.out.println("digite quantas horas trabalhada: ");
        hora = input.nextInt();
        System.out.println("digite o valor ganho em 1h: ");
        ganhoHora = input.nextDouble();

        double salario = hora * ganhoHora;

        //Forma direta de exibir ao usuário o resultado controlando os zeros depois da vírgula
        //System.out.printf("O valor do salário é: R$ %.2f", salario);

        //usando uma formatação mais especifica, mas também só controla a quantidade de zeros depois da vírgula
        System.out.println("Formatação simples do salário: R$ " + String.format("%.1f", salario));

        // Forma mais complicada de exibir ao usuário com mais recursos como:
        // linguagem, país e números com milhar, centena e dezenas... independente do computador
        DecimalFormatSymbols simbolos = new DecimalFormatSymbols(new Locale("pt", "BR"));
        DecimalFormat df = new DecimalFormat("R$ #,##0.00", simbolos);
        System.out.println("Formatação mais elaborada do salário: "+df.format(salario)); // Saída: R$ salario
    }
}
