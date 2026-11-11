package pooJava.objeto;
public class CriandoObjeto {

    //Atributos(ou características)
    int metragem;
    int numeroQuarto;
    int numeroBanheiros;
    String cor;
    String material;

    //Métodos(ou função)
    public void construir(){
        System.out.println("Metragem da área: " + metragem);
        System.out.println("Número de quartos: " + numeroQuarto);
        System.out.println("Números de banheiros: " + numeroBanheiros);
        System.out.println("Construído com: " + material);
    }
    public void pintar(){
        System.out.println("Pintada na cor: " + cor);
    }
}
