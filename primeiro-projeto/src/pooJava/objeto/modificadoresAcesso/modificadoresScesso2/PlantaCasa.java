package pooJava.objeto.modificadoresAcesso.modificadoresScesso2;

public class PlantaCasa {
    //Atributos(ou características)
    private int metragem;
    private int numeroQuarto;
    public int numeroBanheiros;
    public String cor;
    public String material;

    public PlantaCasa(int metragem, int numeroQuarto) {
        this.metragem = metragem;
        this.numeroQuarto = numeroQuarto;
    }

    public int getMetragem() {
        return metragem;
    }

    public void setMetragem(int metragem ) {
        this.metragem = metragem;
    }

    public int getNumeroQuarto() {
        return numeroQuarto;
    }

    public void setNumeroQuarto(int numeroQuarto) {
        this.numeroQuarto = numeroQuarto;
    }

    public PlantaCasa(int metragem) {
        this.metragem = metragem;
    }

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
