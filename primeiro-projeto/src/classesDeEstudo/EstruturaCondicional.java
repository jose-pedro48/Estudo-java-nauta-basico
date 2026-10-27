package classesDeEstudo;

public class EstruturaCondicional {
    public static void main(String[] args) {
        /*
        * Operadores comparativos são:
        * ==: igual a.
        * !=: diferente de.
        * >: maior que.
        * <: menor que.
        * ≥: maior ou igual.
        * ≤: Menor ou Igual.
        * Expressões comparativas:
        * Compara dois valores e retorna um valor Boolean (true-sim ou false-não)
        * */
        int pao = 10;
        int acucar = 20;
        System.out.println(pao == acucar);
        System.out.println(pao != acucar);
        System.out.println(pao > acucar);
        System.out.println(pao < acucar);
        System.out.println(pao >= acucar);
        System.out.println(pao <= acucar);
        System.out.println("==============================================");

        /*
        * Operadores lógicos são:
        * &&: E lógico (AND)
        * ||: OU lógico (OR)
        * !: negação (NOT)
        * */
        boolean x = true;
        boolean y = false;
        System.out.println(x && y);
        System.out.println(x || y);
        System.out.println(!x);
        System.out.println(!y);
        System.out.println("------------------------------------------------");

        /*
        * Condicionais e condicionais encadeados.
        * Pratique para fixar os conceitos e a estrutura.
        * Estrutura condicional são:
        * if = Se
        * else = se-não
        * Daqui pode se considerar condição encadeada
        * else-if = se não for se
        * */
        int idade = -11;
        if (idade >= 18){
            System.out.println("Sou Maior de Idade ");
        }
        else if (idade >= 11 && idade <= 17){
            System.out.println("Sou Adolescente ");
        }
        else if (idade >= 1 && idade <= 10){
            System.out.println("Sou ou Criança "+idade+" (A)");
        }
        else if (idade <= -1 && idade >= -12){
            System.out.println("Sou recém nascido "+idade+" (M)");
        }
        else {
            System.out.println("Estou Gravida ");
        }
        System.out.println("==============================================");


    }
}
