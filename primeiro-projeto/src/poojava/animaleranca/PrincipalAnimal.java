package poojava.animaleranca;

public class PrincipalAnimal {
    public static void main(String[] args) {
       Cachorro caramelo = new Cachorro();
       caramelo.latir();
       caramelo.comer("Ração pedriggi");
       caramelo.beberAgua();
       caramelo.dormir("na sala");

        System.out.println("--------------------------------------------------");
       Galinha gertrudez = new Galinha();
       gertrudez.ciscar();
       gertrudez.comer("Milho");
       gertrudez.beberAgua();
       gertrudez.dormir("no galinheiro");

    }
}
