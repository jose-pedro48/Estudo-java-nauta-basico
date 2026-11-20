package exercicios.exercicioParte1;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite sua idade: ");
        int idade = input.nextInt();

        int diasVividos = idade * 365;
        System.out.println("A quantidade de dias vividos: " + diasVividos + " dias");

        // Forma mais complicada de exibir ao usuário com mais recursos como:
        // linguagem, país e números com milhar, centena e dezenas... independente do computador
        DecimalFormatSymbols simbolos = new DecimalFormatSymbols(new Locale("pt", "BR"));
        DecimalFormat df = new DecimalFormat("R$ #,##0.##", simbolos);
        System.out.println("Formatação mais elaborada do salário: "+df.format(diasVividos)); // Saída: diasVividos

        input.close();
    }
}
