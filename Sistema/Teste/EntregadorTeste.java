package Sistema.Teste;

import Sistema.Controller.EntregadorController;
import Sistema.Model.Entregador;

public class EntregadorTeste {
    public static void main(String[] args) {
        EntregadorController entregadorController = new EntregadorController();

        // Teste de criação de entregador
        entregadorController.criarEntregador("12345678901", "João", "joao123", "senha123", "Moto");
        entregadorController.criarEntregador("98765432109", "Maria", "maria456", "senha456", "Bicicleta");

        // Teste de leitura de entregador
        System.out.println("===== Ler Entregador =====");
        Entregador entregador1 = entregadorController.lerEntregador("12345678901");
        Entregador entregador2 = entregadorController.lerEntregador("98765432109");
        exibirEntregador(entregador1);
        exibirEntregador(entregador2);

        // Teste de atualização de entregador
        entregadorController.atualizarEntregador("12345678901", "João da Silva", "joaosilva", "novasenha", "Carro");

        // Teste de leitura após atualização
        System.out.println("===== Ler Entregador após atualização =====");
        entregador1 = entregadorController.lerEntregador("12345678901");
        exibirEntregador(entregador1);

        // Teste de exclusão de entregador
        entregadorController.deletarEntregador("98765432109");

        // Teste de leitura após exclusão
        System.out.println("===== Ler Entregador após exclusão =====");
        entregador2 = entregadorController.lerEntregador("98765432109");
        exibirEntregador(entregador2);
    }

    private static void exibirEntregador(Entregador entregador) {
        if (entregador != null) {
            System.out.println("CPF: " + entregador.getCpf());
            System.out.println("Nome: " + entregador.getNome());
            System.out.println("Login: " + entregador.getLogin());
            System.out.println("Veículo: " + entregador.getVeiculo());
        } else {
            System.out.println("Entregador não encontrado.");
        }
        System.out.println();
    }
}
