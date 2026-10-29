package classesDeEstudo;

public class EstudoLoop {
    public static void main(String[] args) {
        /*
         * Essa é a estrutura do loop WHILE conhecido como (enquanto condição for verdadeira faça)
         * pratique varías vezes com projetos simples para fixação
         * o código a seguir está incrementando valor
        */
        int x = 1;
        while (x <= 5){
            System.out.println("Estudando while " + x);
            x++;
        }
        System.out.println("------------------------------------------");
        //esse código está decrementando valor
        int a = 5;
        while (a >= 1){
            System.out.println("Estudando while " + a);
            a--;
        }
        System.out.println("------------------------------------------");
        /*
        * A estrutura do-while é semelhante ao while, mas o do-while garante
        * que o bloco de código seja executado pelo menos uma vez para depois verificar
        * no final a condição.
        * */
        int b = 1;
        do{
            System.out.println("Estudando do-while " + b);
            b++;
        }while(b <= 5);

        System.out.println("------------------------------------------");

        int c = 5;
        do{
            System.out.println("Estudando do-while " + c);
            c--;
        }while(c >= 1);

        System.out.println("------------------------------------------");
        /*
        * A estrutura for é usada para repetir um bloco de código
        * um número específico de vezes.
        * For (inicialização; condição; incremento){}
        * */
        for(int d = 1; d <= 4; d++){
            System.out.println("Estudando estrutura for " + d);
        }

    }

}
