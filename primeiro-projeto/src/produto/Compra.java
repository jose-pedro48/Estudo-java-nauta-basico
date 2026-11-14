package produto;

public class Compra {

    private String descricao;
    private int quantidade;
    private double precounitario;
    private double precoTotal;
    //double precoFinal;

    public Compra(String descricao, int quantidade, double precounitario, double precoTotal) {
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.precounitario = precounitario;
        this.precoTotal = precoTotal;
        //this.precoFinal = precoFinal;

    }

//    public Compra(double precoTotal) {
//        this.precoTotal = precoTotal;
//    }
//    public String getDescricao() {
//        return descricao;
//    }
//
//    public void setDescricao(String descricao) {
//        this.descricao = descricao;
//    }
//
//    public int getQuantidade() {
//        return quantidade;
//    }
//
//    public void setQuantidade(int quantidade) {
//        this.quantidade = quantidade;
//    }
//
//    public double getPrecounitario() {
//        return precounitario;
//    }
//
//    public void setPrecounitario(double precounitario) {
//        this.precounitario = precounitario;
//    }
//
//    public double getPrecoTotal() {
//        return precoTotal;
//    }
//
//    public void setPrecoTotal(double precoTotal) {
//        this.precoTotal = precoTotal;
//    }
    public Double calcularPrecoTotal(){
        return precoTotal = this.quantidade * this.precounitario;
    }
//    public Double calcularPrecoFinal(){
//        return precoFinal = precoTotal + calcularPrecoTotal();
//    }

    @Override
    public String toString() {
        return
                descricao + "- quantidade " + quantidade + " - preço unidade " +
                precounitario + " - preço a pagar " + String.format("%.2f", calcularPrecoTotal());

    }
//    @Override
//    public String toString() {
//        return "Lista de Compra \n" +
//                "descrição: " + descricao + '\n' +
//                "quantidade: " + quantidade +"\n"+
//                "preço unitário: " + precounitario +"\n"+
//                "preço total: " + calcularPrecoTotal();
//    }
}
