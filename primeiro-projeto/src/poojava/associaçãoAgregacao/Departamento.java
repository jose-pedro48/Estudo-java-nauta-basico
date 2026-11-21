package poojava.associaçãoAgregacao;

import java.util.List;

public class Departamento {
    private String nome;
    private List<Funcionarios> listaFuncinarios;
    public Departamento(String nome, List<Funcionarios> listaFuncinarios) {
        this.nome = nome;
        this.listaFuncinarios = listaFuncinarios;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Funcionarios> getListaFuncinarios() {
        return listaFuncinarios;
    }

    public void setListaFuncinarios(List<Funcionarios> listaFuncinarios) {
        this.listaFuncinarios = listaFuncinarios;
    }
    public void mostrarFuncionarios(){
        System.out.println("Departamento: " + nome);
        listaFuncinarios.forEach(funcionario -> System.out.println(funcionario));
    }
}
