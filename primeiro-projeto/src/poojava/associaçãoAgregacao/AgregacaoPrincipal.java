package poojava.associaçãoAgregacao;

import poojava.associacaoComposicao.Carro;

import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AgregacaoPrincipal {
    public static void main(String[] args) {
        Funcionarios joao = new Funcionarios("João");
        Funcionarios joana = new Funcionarios("Joana");
        Funcionarios pedro = new Funcionarios("Pedro");
        List<Funcionarios> listaFuncionarios = new ArrayList<>();
        listaFuncionarios.add(joao);
        listaFuncionarios.add(joana);
        listaFuncionarios.add(pedro);

        Departamento ti = new Departamento("TI ", listaFuncionarios);
        ti.mostrarFuncionarios();

        Departamento marketing = new Departamento("MARKETING", Collections.emptyList());

       // Funcionarios fabiola = new Funcionarios("Fabiola");
       // List<Funcionarios> outraLista = new ArrayList<>();
       // outraLista.add(fabiola);
       // Departamento marketing = new Departamento("MARKETING", outraLista);
        marketing.mostrarFuncionarios();

    }
}
