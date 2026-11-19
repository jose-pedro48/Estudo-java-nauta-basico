package poojava.contabancariaencapisulamento;

public class AcesseConta {
    public static void main(String[] args) {
        //instânciando a conta bancária no acesso a canta com o titular
        // e valor inicial no parâmetros no valor R$ 500
        ContaBancaria minhaConta = new ContaBancaria("Pedro", 500);

        //inicializando titular e saldo com alteração no titular
        minhaConta.setTitular("José Pedro");
        minhaConta.setSaldo(500);

        //Depositando mais R$ 100 na conta
        minhaConta.setSaldo(minhaConta.getSaldo() + 100);

        //mostrando o titular e saldo
        System.out.println("Titular da conta: "+ minhaConta.getTitular()
                +"\nSaldo da conta atual R$ "+ minhaConta.getSaldo());
        //System.out.println(minhaConta.getSaldo());

        System.out.println("--------------------------------------------------");

        //Abrindo uma nova conta
        ContaBancaria contaMae = new ContaBancaria("Fabiola");

        //Recebe o titular conta mâe
        contaMae.getTitular();

        //Recebe o saldo que será zero por não depositar no início
        contaMae.getSaldo();
        contaMae.setSaldo(125);
        contaMae.setSaldo(contaMae.getSaldo() - 30);

        //mostrando o titular e saldo
        System.out.println("Titular da conta: "+ contaMae.getTitular()
                +"\nSaldo da conta atual R$ "+ contaMae.getSaldo());
    }
}
