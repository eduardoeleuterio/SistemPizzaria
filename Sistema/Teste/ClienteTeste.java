package Sistema.Teste;

import Sistema.Controller.ClienteController;
import Sistema.Model.Cliente;

public class ClienteTeste {

    public static void main(String[] args) {
        ClienteController clienteController = new ClienteController();

        // Teste de criação de cliente
        clienteController.criarCliente("12345678901", "João", "Rua A", "123", "Apto 1", "Referência 1", "12345678");

        // Teste de leitura de cliente
        System.out.println("===== Ler Cliente =====");
        Cliente cliente = clienteController.lerCliente("12345678901");
        exibirCliente(cliente);

        // Teste de atualização de cliente
        clienteController.atualizarCliente("12345678901", "João da Silva", "Rua B", "456", "Apto 2", "Referência 2", "87654321");

        // Teste de leitura após atualização
        System.out.println("===== Ler Cliente após atualização =====");
        cliente = clienteController.lerCliente("12345678901");
        exibirCliente(cliente);

        // Teste de exclusão de cliente
        clienteController.deletarCliente("12345678901");

        // Teste de leitura após exclusão
        System.out.println("===== Ler Cliente após exclusão =====");
        cliente = clienteController.lerCliente("12345678901");
        exibirCliente(cliente);
    }
    private static void exibirCliente(Cliente cliente) {
        if (cliente != null) {
            System.out.println("CPF: " + cliente.getCpf());
            System.out.println("Nome: " + cliente.getNome());
            System.out.println("Rua: " + cliente.getEndereco().getRua());
            System.out.println("Número: " + cliente.getEndereco().getNumero());
            System.out.println("Complemento: " + cliente.getEndereco().getComplemento());
            System.out.println("Referência: " + cliente.getEndereco().getReferencia());
            System.out.println("Telefone: " + cliente.getTelefone());
        } else {
            System.out.println("Cliente não encontrado.");
        }
        System.out.println();
    }
}
