package poojava.abstracao;

public abstract class Endereco {
    String rua;
    String cidade;
    String estado;
    String cep;
    String numero;

    public Endereco() {
    }

    public Endereco(String rua, String cidade, String estado, String cep, String numero) {
        this.rua = rua;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
        this.numero = numero;
    }

    public Endereco(String rua, String cep, String estado, String cidade) {
        this.rua = rua;
        this.cep = cep;
        this.estado = estado;
        this.cidade = cidade;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
    public void mostraEndereco(){
        System.out.println(rua + " " + cidade + " " + estado + " " + cep + " " + numero);
    }
}
