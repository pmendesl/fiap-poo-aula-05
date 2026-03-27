package br.com.ridefiap.main;

import br.com.ridefiap.model.Cartao;
import br.com.ridefiap.model.Conta;

public class TesteMeuObjeto {
    public static void main(String[] args) {
        Cartao meuCartao = new Cartao("1111222233334444", "MasterCard", "12/25");
        Conta minhaConta = new Conta(12345, "123.456.789-00", meuCartao);
        
        minhaConta.setAgencia(123);
        minhaConta.setNumeroConta(45678);
        minhaConta.setDigito(9);
        minhaConta.setCpf("123.456.789-00");
        minhaConta.setSaldo(1000.0);
        
        minhaConta.exibirSaldo();
        minhaConta.depositar(500.0);
        minhaConta.exibirSaldo();
        minhaConta.sacar(200.0);
        minhaConta.exibirSaldo();

        System.out.println("Bandeira do cartão associado: " + minhaConta.getCartao().getBandeira());
    }
}
