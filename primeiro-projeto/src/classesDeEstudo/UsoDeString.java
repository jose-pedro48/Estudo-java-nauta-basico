package classesDeEstudo;

public class UsoDeString {
    public static void main(String[] args) {
        String nome = "Pedro";
        String nome2 = "Pidro";
        int tamanhoString = nome.length();
        boolean nomeIgual = nome.equals(nome2);

        System.out.println("Olá "+nome+ ", quantidade de letras "+tamanhoString+ " o mome é igual "+nomeIgual);
    }
}
