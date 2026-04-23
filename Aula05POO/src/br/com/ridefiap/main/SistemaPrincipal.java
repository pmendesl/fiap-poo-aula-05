package br.com.ridefiap.main;

import br.com.ridefiap.model.Bateria;
import br.com.ridefiap.model.Celular;
import br.com.ridefiap.model.Passageiro;

public class SistemaPrincipal {
    public static void main(String[] args) {
        // Criando objetos de Bateria para associar aos Celulares
        Bateria bat1 = new Bateria(4500, 85);
        Bateria bat2 = new Bateria(3900, 100);

        // Instanciando Celular com o novo construtor (recebendo Bateria)
        Celular meuCelular = new Celular("Iphone", "Cinza", 256, bat1);
        Celular celulardoamigo = new Celular("Samsung", "Roxo", 128, bat2);
        
        Passageiro passageiro1 = new Passageiro("Maria", 100.0);
        Passageiro passageiro2 = new Passageiro("João", 50.0);

        System.out.println("--- Estado Inicial dos Objetos ---");
        System.out.println("Meu celular: " + meuCelular.getMarca() + ", Cor: " + meuCelular.getCor() + ", Capacidade: " + meuCelular.getCapacidadeemGb() + "GB");
        // Teste do microdesafio: imprimindo um dado do objeto associado
        System.out.println("Bateria do meu celular: " + meuCelular.getBateria().toString());
        
        System.out.println("Celular do amigo: " + celulardoamigo.getMarca() + ", Cor: " + celulardoamigo.getCor() + ", Capacidade: " + celulardoamigo.getCapacidadeemGb() + "GB");
        System.out.println("Bateria do celular do amigo: " + celulardoamigo.getBateria().toString());
        
        System.out.println("Passageiro 1: " + passageiro1.getNome() + ", Saldo: " + passageiro1.getSaldo());
        System.out.println("Passageiro 2: " + passageiro2.getNome() + ", Saldo: " + passageiro2.getSaldo() + "\n");

        System.out.println("--- Testando setCapacidadeemGb() do Celular ---");
        meuCelular.setCapacidadeemGb(512);
        System.out.println("Meu celular (após setCapacidadeemGb válido): " + meuCelular.getCapacidadeemGb() + "GB");
        
        System.out.println("\n--- Testando Alteração na Bateria ---");
        meuCelular.getBateria().setPercentualCarga(75);
        System.out.println("Nova carga da bateria do meu celular: " + meuCelular.getBateria().getPercentualCarga() + "%");
    }
}