package classesDeEstudo;

import java.util.ArrayList;
import java.util.List;

public class EstudoColacoes {
    public static void main(String[] args) {
        // Criando a lista de compra
        List<String> listaDeCompra = new ArrayList<>();
        // adicionando item na lista de compra com o list.add
        listaDeCompra.add("Mamão");
        listaDeCompra.add("Graviola");
        listaDeCompra.add("Abacaxi");
        listaDeCompra.add("Goiaba");
        listaDeCompra.add("Macarrão");
        // Adicionando item em uma posição da lista de compra
        listaDeCompra.add(4, "Arroz");
        // interação com o for-it para mostrar as compras da lista
       for (String compra: listaDeCompra) {
            System.out.println(compra);
        }
        System.out.println("-------------------------------------------");
        /*
        * list.get pega o elemento da posição indicada entre parenteses
        * que nesse caso é o elemento na posição (1) Graviola e o elemento na posição (3) Goiaba.
        * */
        String compra1 = listaDeCompra.get(1);
        System.out.println(compra1);

        String compra2 = listaDeCompra.get(3);
        System.out.println(compra2);
        System.out.println("-------------------------------------------");

        // removendo um item da lista de compra na posição 2 que erá o Abacaxi
        listaDeCompra.remove(2);
        // verificando se esta vázio, nesse caso não estão vazio
        boolean vazio = listaDeCompra.isEmpty();
        // verificando quantidade de item da lista ou tamanho da lista
        int tamanho = listaDeCompra.size();
        // verificando se um item está na lista de compra
        boolean contem = listaDeCompra.contains("Abacaxi");

        for (String compra : listaDeCompra) {
            System.out.println(compra );
        }
        System.out.println("-------------------------------------------");
        System.out.println("A lista está vazia? " + vazio);
        System.out.println("A quantidade de item na lista: " + tamanho);
        System.out.println("O item Abacaxi está na lista? " + contem);

        System.out.println("-------------------------------------------");
        // Limpando a lista de compra
    //    listaDeCompra.clear();
    //   System.out.println("Eu apaguei a lista de compra? " + listaDeCompra.isEmpty());
        System.out.println("-------------------------------------------");
        // Estrutura do forEach para treinar
        listaDeCompra.forEach(System.out::println);


    }

}
