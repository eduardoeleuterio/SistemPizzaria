package Sistema.Teste;

import Sistema.Controller.AtendenteController;
import Sistema.Model.Atendente;

public class AtendenteTeste {

    public static void main(String[] args) {
        AtendenteController atendenteController = new AtendenteController();

        // Teste de criação de atendente
        atendenteController.criarAtendente("12345678901", "João", "joao123", "senha123");
        atendenteController.criarAtendente("98765432109", "Maria", "maria456", "senha456");

        // Teste de leitura de atendente
        System.out.println("===== Ler Atendente =====");
        Atendente atendente1 = atendenteController.lerAtendente("12345678901");
        Atendente atendente2 = atendenteController.lerAtendente("98765432109");
        exibirAtendente(atendente1);
        exibirAtendente(atendente2);

        // Teste de atualização de atendente
        atendenteController.atualizarAtendente("12345678901", "João da Silva", "joaosilva", "novasenha");

        // Teste de leitura após atualização
        System.out.println("===== Ler Atendente após atualização =====");
        atendente1 = atendenteController.lerAtendente("12345678901");
        exibirAtendente(atendente1);

        // Teste de exclusão de atendente
        atendenteController.deletarAtendente("98765432109");

        // Teste de leitura após exclusão
        System.out.println("===== Ler Atendente após exclusão =====");
        atendente2 = atendenteController.lerAtendente("98765432109");
        exibirAtendente(atendente2);
    }

    private static void exibirAtendente(Atendente atendente) {
        if (atendente != null) {
            System.out.println("CPF: " + atendente.getCpf());
            System.out.println("Nome: " + atendente.getNome());
            System.out.println("Login: " + atendente.getLogin());
            System.out.println("Senha: " + atendente.getSenha());
        } else {
            System.out.println("Atendente não encontrado.");
        }
        System.out.println();
    }
}
