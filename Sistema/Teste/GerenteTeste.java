package Sistema.Teste;

import Sistema.Controller.GerenteController;
import Sistema.Model.Gerente;

public class GerenteTeste {

    public static void main(String[] args) {
        GerenteController gerenteController = new GerenteController();

        // Teste de criação de gerente
        gerenteController.criarGerente("12345678901", "João", "joao123", "senha123", "Vendas");
        gerenteController.criarGerente("98765432109", "Maria", "maria456", "123456", "RH");

        // Teste de leitura de gerente
        System.out.println("===== Ler Gerente =====");
        Gerente gerente1 = gerenteController.lerGerente("12345678901");
        Gerente gerente2 = gerenteController.lerGerente("98765432109");
        exibirGerente(gerente1);
        exibirGerente(gerente2);

        // Teste de atualização de gerente
        gerenteController.atualizarGerente("12345678901", "João da Silva", "joao.silva", "novasenha", "Financeiro");

        // Teste de leitura após atualização
        System.out.println("===== Ler Gerente após atualização =====");
        gerente1 = gerenteController.lerGerente("12345678901");
        exibirGerente(gerente1);

        // Teste de exclusão de gerente
        gerenteController.deletarGerente("98765432109");

        // Teste de leitura após exclusão
        System.out.println("===== Ler Gerente após exclusão =====");
        gerente2 = gerenteController.lerGerente("98765432109");
        exibirGerente(gerente2);
    }

    private static void exibirGerente(Gerente gerente) {
        if (gerente != null) {
            System.out.println("CPF: " + gerente.getCpf());
            System.out.println("Nome: " + gerente.getNome());
            System.out.println("Login: " + gerente.getLogin());
            System.out.println("Senha: " + gerente.getSenha());
            System.out.println("Setor: " + gerente.getSetor());
        } else {
            System.out.println("Gerente não encontrado.");
        }
        System.out.println();
    }
}
