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
         */
        int idade = -11;
        if (idade >= 18) {
            System.out.println("Sou Maior de Idade ");
        }
        else if (idade >= 11 && idade <= 17) {
            System.out.println("Sou Adolescente ");
        }
        else if (idade >= 1 && idade <= 10) {
            System.out.println("Sou ou Criança " + idade + " (A)");
        }
        else if (idade <= -1 && idade >= -12) {
            System.out.println("Sou recém nascido " + idade + " (M)");
        }
        else {
            System.out.println("Estou Gravida ");
        }
        System.out.println("==============================================");

        /*
         Expressão Condicional Ternária
         É uma forma compacta de escrever um if-else que retorna um valor:
         String resultado = (condicao)? valorVerdadeiro : valorFalso;
         onde? é if, : é else usado em condição simples.
         */
        //Mensagem = (idade ≥ 18)? " Você é maior de idade. ": "Você é menor de idade. ";
        boolean tenhoDinheiro = true;
        String mensagem = (tenhoDinheiro) ? "Vamos pedir um ifood " : "Vamos comer o que tem em casa!";
        System.out.println(mensagem);

        //O Switch-case é usado quando tem uma condição encadeada trocando o if-else.
        int fimSemana = 4;
        switch (fimSemana) {
            case 1:
                System.out.println("Vamos pedir um ifood hoje é Domingo");
                break;
                case 2:
                System.out.println("Vamos fazer uma cotinha hoje é Segunda");
                break;
                case 3:
                    System.out.println("Vamos ver quem paga hoje é terça");
                    break;
            default:
                System.out.println("Vamos deixar para o fim de semana hoje é quarta");
        }



    }
}
