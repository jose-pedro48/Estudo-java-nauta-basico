package poojava.animalheranca;
    //Criando a classe animal
public class Animal {
    //Criando o Metodo comer, com atributos no parâmetro
    public void comer(String alimento){
        System.out.println("O animal está comendo " + alimento);
    }
    public void dormir(String dormindo){
        System.out.println("O animal está dormindo " + dormindo);
    }
    //Criando o Metodo beber água sem atributo no parâmetros
    public void beberAgua(String bebendoAgua){
        System.out.println("O animal está bebendo água " +  bebendoAgua);
    }
}
