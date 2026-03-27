package br.com.ridefiap.model;

public class Cartao {
    private String numeroCartao;
    private String bandeira;
    private String validade;

    public Cartao(String numeroCartao, String bandeira, String validade) {
        this.numeroCartao = numeroCartao;
        this.bandeira = bandeira;
        this.validade = validade;
    }

    public String getNumeroCartao() {
        return numeroCartao;
    }

    public void setNumeroCartao(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    public String getBandeira() {
        return bandeira;
    }

    public void setBandeira(String bandeira) {
        this.bandeira = bandeira;
    }

    public String getValidade() {
        return validade;
    }

    public void setValidade(String validade) {
        this.validade = validade;
    }
}
