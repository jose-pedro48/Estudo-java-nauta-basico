package poojava.animalheranca;

public class PrincipalAnimal {
    public static void main(String[] args) {
       Cachorro caramelo = new Cachorro();
       caramelo.latir();
       caramelo.comer("Ração pedriggi");
       caramelo.beberAgua("no pote");
       caramelo.dormir("na sala");

        System.out.println("--------------------------------------------------");
       Galinha gertrudez = new Galinha();
       gertrudez.ciscar();
       gertrudez.comer("Milho");
       gertrudez.beberAgua("no Bebedouro");
       gertrudez.dormir("no galinheiro");

    }
}
