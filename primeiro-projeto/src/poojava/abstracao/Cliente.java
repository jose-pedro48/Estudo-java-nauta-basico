package poojava.abstracao;

public class Cliente extends Endereco implements Pessoa{
    private String nome;
    private String documento;

    public Cliente(String rua, String cep, String estado, String cidade, String nome, String documento) {
        super(rua, cep, estado, cidade);
        this.nome = nome;
        this.documento = documento;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String getDocumento() {
        return documento;
    }

    @Override
    public void setDocumento(String documento) {
        this.documento = documento;
    }
    @Override
    public void mostraEndereco(){
        System.out.println("Endereço do Cliente: rua " + getRua() + ", " + getCidade() + ", " + getEstado() +
                ", " + getCep());
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", documento='" + documento + '\'' +
                '}';
    }

}
