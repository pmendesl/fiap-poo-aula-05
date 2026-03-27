package br.com.ridefiap.model;

import br.com.ridefiap.model.Cartao;

public class Conta {
    private Cartao cartao;
    private int agencia;
    private int numeroConta;
    private int digito;
    private String cpf;
    private double saldo;

    public Conta(int numeroConta, String cpf, Cartao cartao) {
        this.setNumeroConta(numeroConta);
        this.setCpf(cpf);
        this.cartao = cartao;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public int getDigito() {
        return digito;
    }

    public void setDigito(int digito) {
        this.digito = digito;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        if (saldo >= 0) {
            this.saldo = saldo;
        } else {
            System.out.println("Erro: O saldo não pode ser negativo.");
        }
    }

    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
        } else {
            System.out.println("Erro: O valor do depósito deve ser maior que zero.");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && this.saldo >= valor) {
            this.saldo -= valor;
        } else if (valor <= 0) {
            System.out.println("Erro: O valor do saque deve ser maior que zero.");
        } else {
            System.out.println("Erro: Saldo insuficiente.");
        }
    }

    public Cartao getCartao() {
        return cartao;
    }

    public void setCartao(Cartao cartao) {
        this.cartao = cartao;
    }

    public void exibirSaldo() {
        System.out.println("O saldo atual da conta de CPF " + this.cpf + " é: R$" + this.saldo);
    }
}