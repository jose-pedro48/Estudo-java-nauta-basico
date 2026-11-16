package poojava.contabancaria;

import javax.swing.*;

public class ContaBancaria {
    //Usando Encapsulamento na conta banco e acessando a conta

    //Atributos privados
    private String titular;
    private double saldo;

    //Getter e Setter - Métodos Padrões para acessar e modificar os atributos
    //Métodos para obter o titular
    public String getTitular() {
        return titular;
    }
    //Métodos para alterar o titular, o que está dentro dos parênteses é o parâmetro e
    //o this. Alguma coisa é o atributo
    public void setTitular(String titular){
        this.titular = titular;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    //Os construtores são para inicializar os objetos da classe
    //esse construtor é com atributos -parâmetros- veja dentro dos parênteses
    public ContaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }
    public ContaBancaria(){
        //Esse construtor é sem atributos no parâmetro, os parênteses estão vazio
    }
    //Construtor com 1 atributo no parâmetro
    public ContaBancaria(double saldo){
        this.saldo = saldo;
    }
    //Construtor que inicializa a conta bancaria com saldo zero
    public ContaBancaria(String titular){
        this.titular = titular;
        this.saldo = 0;
    }

//    @Override
//    public String toString() {
//        return "Nome titular da conta: " + this.titular+
//                " Saldo da conta: "+ String.format("%.2f R$ ",this.getSaldo());
//    }
}
