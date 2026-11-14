package produto;

import java.util.ArrayList;
import java.util.List;

public class ListaProduto {
    public static void main(String[] args) {
        //Compra objeto = new Compra("",0,0.0,0.0);

        List<Compra> lista = new ArrayList<>();
        //adicionando produto com (método add)
        lista.add(new Compra("Arroz emoções ", 3,4.35,0.0));
        lista.add(new Compra("Macarrão vitarella ", 5, 3.45,0.0));
        lista.add(new Compra("Feijão urbano ", 5, 5.45,0.0));
        lista.add(new Compra("Farinha da roça: ", 2, 2.6,0.0));
        for (Compra comprei : lista) {
            System.out.println(comprei);
        }
//        lista.forEach(Lista -> System.out.println(lista));
//        System.out.println("valor a pagar: " + objeto.calcularPrecoTotal());


//        System.out.println("A descrição do produto: " + objeto.getDescricao());
//        System.out.println("A quantidade de produto: " + objeto.getQuantidade());
//        System.out.println("Preço do produto unitário: " + objeto.getPrecounitario());
//        System.out.println("Preço a pagar: " + objeto.calcularPrecoTotal());

    }
}
