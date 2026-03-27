package br.com.ridefiap.model;

public class Passageiro {
	private String nome;
	private double saldo;
	public Passageiro(String nome, double saldo) {
		this.nome = nome;
		this.saldo = saldo;
	}
public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public double getSaldo() {
	return saldo;
}
public void setSaldo(double saldo) {
	if (saldo >= 0) {
		this.saldo = saldo;
	}else{
		System.out.println("Erro: O saldo não pode ser negativo");
	}
}
}