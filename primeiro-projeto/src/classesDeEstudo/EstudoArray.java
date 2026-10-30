package classesDeEstudo;

import java.util.Arrays;

public class EstudoArray {
    public static void main(String[] args) {
        /*
        * Todos elementos de um array devem ser do mesmo tipo.
        * Os elementos sempre começam no zero(0), então se um
        * array tem 5 elementos eles vão do 0 a 4
        * exemplo: elementos de fruta, maçã-0, pera-1, laranja-2 assim seguei...
        * a estrutura do array:
        * int[] números = {1, 2, 3, 4, 5};
        * String[] frutas = {"maçã", "banana", "laranja"};
        * */
        int[] numero = {1, 2, 3, 4, 5};//uma forma de inicializar o array
        System.out.println("os números desse array: "+ numero[2]);
        System.out.println("---------------------------------------");

        int[] numero2 = new int[5]; //outra forma de inicializar o array
        numero2[0]= 1;
        numero2[1]= 2;
        numero2[2]= 3;
        numero2[3]= 4;
        numero2[4]= 5;
        System.out.println("os números desse array: " +Arrays.toString(numero2));
        System.out.println("Chamando o número: "+ numero[3]);
        System.out.println("----------------------------------------------------");

        String[] frutas = {" Maçã", "Banana", "Laranja", "Mamão", "Pinha "};
        System.out.println("as frutas do array:" +  Arrays.toString(frutas));
        System.out.println("Escolhendo a fruta: " +  frutas[0]);
        System.out.println("----------------------------------------------");

        // Mudando o elemento de um array
        double[] salarios = {1600.00, 1200.00, 800.00, 500.00, 200.00};
        for(int i = 0; i < salarios.length; i++){
            System.out.println(salarios[i]);
        }
        System.out.println("----------------------------------------------");
        // Veja a estrutura do for-it que fica reduzido em relação ao for padrão.
        // alterando o salário da posição 4 só pode ser feito acima do for-it,
        // mas não mudou o for que está acima dele.
        salarios[4] = 900.00;

        for(double verba: salarios){
            System.out.println(verba);
        }
        System.out.println("----------------------------------------------");

    }
}
