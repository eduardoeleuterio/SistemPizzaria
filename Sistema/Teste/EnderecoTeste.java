package Sistema.Teste;

import Sistema.Controller.EnderecoController;
import Sistema.Model.Endereco;

public class EnderecoTeste {
    public static void main(String[] args) {
        EnderecoController enderecoController = new EnderecoController();

        // Teste de criação de endereço
        enderecoController.criarEndereco("Rua A", "123", "Apto 1", "Referência 1");
        enderecoController.criarEndereco("Rua B", "456", "Casa 2", "Referência 2");

        // Teste de leitura de endereço
        System.out.println("===== Ler Endereço =====");
        Endereco endereco1 = enderecoController.lerEndereco("Rua A", "123");
        Endereco endereco2 = enderecoController.lerEndereco("Rua B", "456");
        exibirEndereco(endereco1);
        exibirEndereco(endereco2);

        // Teste de atualização de endereço
        enderecoController.atualizarEndereco("Rua A", "123", "Apto 3", "Referência 3");

        // Teste de leitura após atualização
        System.out.println("===== Ler Endereço após atualização =====");
        endereco1 = enderecoController.lerEndereco("Rua A", "123");
        exibirEndereco(endereco1);

        // Teste de exclusão de endereço
        enderecoController.deletarEndereco("Rua B", "456");

        // Teste de leitura após exclusão
        System.out.println("===== Ler Endereço após exclusão =====");
        endereco2 = enderecoController.lerEndereco("Rua B", "456");
        exibirEndereco(endereco2);
    }

    private static void exibirEndereco(Endereco endereco) {
        if (endereco != null) {
            System.out.println("Rua: " + endereco.rua);
            System.out.println("Número: " + endereco.numero);
            System.out.println("Complemento: " + endereco.complemento);
            System.out.println("Referência: " + endereco.referencia);
        } else {
            System.out.println("Endereço não encontrado.");
        }
        System.out.println();
    }
}
