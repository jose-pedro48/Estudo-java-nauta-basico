package poojava.abstracao;

public class AbstracaoPincipal {
    public static void main(String[] args) {
        Funcionario joao = new Funcionario("Rua Santa Catarina", "Recife",
                "Pernanbuco", "52222-000", "1234","José Pedro",
                "000333322", "Vendedor" );

        Cliente joana = new Cliente("Santa lucia", "21211-333","RJ",
                "Copa cabana","Josoe Batista","00213569");

        joao.mostraEndereco();
        System.out.println(joao);
        joana.mostraEndereco();
        System.out.println(joana);


    }
}
