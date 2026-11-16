package poojava.polimorfismo.sobrecargametodo;

import poojava.polimorfismo.sobrescritametodo.Carro;

public class Principal {
    public static void main(String[] args) {
        int sabaopo = 1;
        int mamao = 2;
        double arroz = 5.25;
        double macarrao = 2.56;
        Integer batata = 6;
        Integer cenoura = 7;
        Integer melancia = 5;
        //Chamando o metodo int quantidade
        int total = Calculadora.somar(sabaopo, mamao);
        System.out.println("A quantidade de itens somados: "+total);

        //Chamando a soma dos itens double
        double valor = Calculadora.somar(arroz, macarrao);
        System.out.println("O valor dos itens somados: R$ "+ String.format("%.2f", valor));

        //Chamando o metodo Integer
        Integer valor2 = Calculadora.somar(batata, cenoura, melancia);
        System.out.println("O total dos itens somados: "+ valor2);

        //Criando objeto e chamando o carro
        Carro fusca = new Carro();
        fusca.mover();


    }
}
