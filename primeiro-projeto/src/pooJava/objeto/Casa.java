package pooJava.objeto;

public class Casa {
    public static void main(String[] args) {
        //Criando o objeto(Casa)
        CriandoObjeto objeto = new CriandoObjeto();

        //Inicializando os atributos da classe casa
        objeto.metragem = 70;
        objeto.numeroQuarto = 3;
        objeto.numeroBanheiros = 1;
        objeto.material = "Tijolos";
        objeto.cor = "Cinza";

        /* Chamada da função(método) */
        objeto.construir();
        System.out.println("============================");
        objeto.pintar();
    }
}
