package classesDeEstudo;

import java.util.TreeMap;

public class EstudoTreeMap {
    public static void main(String[] args) {

        // criando o TreeMap e adicionando elementos
        TreeMap<String, Double> alunosNotas = new TreeMap<>();

        //adicionando os elementos
        alunosNotas.put("Pedro", 8.7);
        alunosNotas.put("Maria", 7.3);
        alunosNotas.put("Fabrício", 6.9);
        alunosNotas.put("Antonio", 9.5);
        alunosNotas.put("Eliane", 8.5);

        //interação com o TreeMap
        for (String nome : alunosNotas.keySet()) {
            System.out.println(nome + " " + alunosNotas.get(nome));
        }
        System.out.println("------------------------------------------------");
        /*
        * o HashMap não tem ordem e não é possível
        * buscar por ordenação
        * o TreeMap tem ordenação pratique ambus*/

        // ordenando com TreeMap
        int tamanhoHash =  alunosNotas.size();
        System.out.println("Tamanho Hash: " + tamanhoHash);
        System.out.println("------------------------------------------------");

        System.out.println("Primeira chave da fila: " + alunosNotas.firstKey());
        System.out.println("----------------------------------------------");
        System.out.println("Ultima chave da fila: " + alunosNotas.lastKey());
        System.out.println("----------------------------------------------");
        //System.out.println("outra forma de buscar " + alunosNotas.floorKey());
    }
}
