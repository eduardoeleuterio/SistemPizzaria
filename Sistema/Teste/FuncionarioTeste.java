package Sistema.Teste;

import Sistema.Controller.FuncionarioController;
import Sistema.Model.Funcionario;

public class FuncionarioTeste {
    public static void main(String[] args) {
        FuncionarioController funcionarioController = new FuncionarioController();

        // Teste de criação de funcionário
        funcionarioController.criarFuncionario("12345678901", "João", "joao123", "senha123");
        funcionarioController.criarFuncionario("98765432109", "Maria", "maria456", "senha456");

        // Teste de leitura de funcionário.
        System.out.println("===== Ler Funcionário =====");
        Funcionario funcionario1 = funcionarioController.lerFuncionario("12345678901");
        Funcionario funcionario2 = funcionarioController.lerFuncionario("98765432109");
        exibirFuncionario(funcionario1);
        exibirFuncionario(funcionario2);

        // Teste de atualização de funcionário.
        funcionarioController.atualizarFuncionario("12345678901", "João da Silva", "joaosilva", "novasenha");

        // Teste de leitura após atualização.
        System.out.println("===== Ler Funcionário após atualização =====");
        funcionario1 = funcionarioController.lerFuncionario("12345678901");
        exibirFuncionario(funcionario1);

        // Teste de exclusão de funcionário.
        funcionarioController.deletarFuncionario("98765432109");

        // Teste de leitura após exclusão.
        System.out.println("===== Ler Funcionário após exclusão =====");
        funcionario2 = funcionarioController.lerFuncionario("98765432109");
        exibirFuncionario(funcionario2);
    }

    private static void exibirFuncionario(Funcionario funcionario) {
        if (funcionario != null) {
            System.out.println("CPF: " + funcionario.getCpf());
            System.out.println("Nome: " + funcionario.getNome());
            System.out.println("Login: " + funcionario.getLogin());
            System.out.println("Senha: " + funcionario.getSenha());
        } else {
            System.out.println("Funcionário não encontrado.");
        }
        System.out.println();
    }
}
