package pooJava.objeto.modificadoresAcesso;

import pooJava.objeto.modificadoresAcesso.modificadoresScesso2.PlantaCasa;

public class CasaConstruida {
    public static void main(String[] args) {
        //Criando(instanciando) o objeto(PlantaCasa) e passando o parâmetro metragem 80
        PlantaCasa objeto2 = new PlantaCasa(25,4);

        //Inicializando os atributos da classe PlantaCasa com construtor e sem construtor
        objeto2.setMetragem(87);
        objeto2.getMetragem();
        //modificando o valor da metragem de 80 para 123
        //objeto2.setMetragem(123);
        objeto2.getNumeroQuarto();
        objeto2.numeroBanheiros = 2;
        objeto2.material = "Tijolos";
        objeto2.cor = "Azul Claro";

        /* Chamada da função(método) */
        objeto2.construir();
        System.out.println("============================");
        objeto2.pintar();
    }
}
