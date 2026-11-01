package classesDeEstudo;

import java.util.HashMap;
import java.util.Map;

public class EstudoHashMap {
    public static void main(String[] args) {
        // Criando o HashMap, não mantém uma ordem
        HashMap<String, Double> alunosNotas = new HashMap<>();

        // Adicionando a chave que é o nome e valor que é a nota
        alunosNotas.put("Petrúcio", 9.5);
        alunosNotas.put("Alice", 7.5);
        alunosNotas.put("Pedro", 9.0);
        alunosNotas.put("Fábio", 8.6);

        // Interação com o HashMap mostrando o resultado nome e nota
        for (String nome : alunosNotas.keySet()) {
            double nota = alunosNotas.get(nome);
            System.out.println(nome + " - " + nota );
        }
        System.out.println("-----------------------------------------------");
        // Outra forma de fazer o for para mostrar com chave e valor
        for (Map.Entry<String, Double> nota : alunosNotas.entrySet()) {
            String nome = nota.getKey();
            double valor = nota.getValue();
            System.out.println(nome + " - " + valor);
        }
        System.out.println("-----------------------------------------------");
          //Buscando só pela chave que nesse caso é o Fabio nome do aluno
            double nota = alunosNotas.get("Fábio");
            System.out.println("A nota de Fábio é: "+ nota);
        System.out.println("-----------------------------------------------");

            // Vendo o tamanho do HashMap (quantidade de elementos)
            int tamanhoHashMap = alunosNotas.size();
            System.out.println("Tamanho HashMap: " + tamanhoHashMap);
        System.out.println("-----------------------------------------------");

            // Removendo elemento do HashMap
            alunosNotas.remove("Petrúcio");
        System.out.println("Removendo Petrúcio do Hash ");
        System.out.println("-----------------------------------------------");

        // Mostrando o novo tamanho do Hash
        int tamanhoHashMap1 = alunosNotas.size();
        System.out.println("Novo tamanho HashMap: " + tamanhoHashMap1);

        for (String nome : alunosNotas.keySet()) {
            double nota2 = alunosNotas.get(nome);
            System.out.println(nome + " - " + nota2 );
        }


    }
}
