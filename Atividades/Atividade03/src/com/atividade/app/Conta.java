package com.atividade.app;

public class Conta {
    //atributos
    public String cpf;
    public String titular;
    public String agencia;
    public String nConta;
    public Double saldo;

    public Conta(String cpf, String titular, String agencia, String nConta, Double saldo) {
        this.cpf = cpf;
        this.titular = titular;
        this.agencia = agencia;
        this.nConta = nConta;
        this.saldo = saldo;
    }

    //metodos
    public void exibirDados() {
        System.out.println("nome do titular: " + this.titular + ".");
        System.out.println("CPF do titular: " + this.cpf + ".");
        System.out.println("Agência: " + this.agencia + ".");
        System.out.println("Número da conta: " + this.nConta + ".");
        System.out.println("Saldo da conta: RS " + String.format("%.2f", this.saldo) + ".");
    }

    public double fazerDeposito(double valor) {
        this.saldo += valor;
        return this.saldo;
    }

    public double fazerSaque(double valor) {
        this.saldo -= valor;
        return this.saldo;
    }

}
