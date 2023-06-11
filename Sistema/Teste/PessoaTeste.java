package Sistema.Teste;
import Sistema.Controller.*;
import Sistema.Model.*;

public class PessoaTeste {


     public static void main(String[] args) {
        PessoaController pessoaController = new PessoaController();

        // Teste de criação de pessoa
        pessoaController.criarPessoa("12345678901", "João");
        pessoaController.criarPessoa("98765432109", "Maria");

        // Teste de leitura de pessoa
        System.out.println("===== Ler Pessoa =====");
        Pessoa pessoa1 = pessoaController.lerPessoa("12345678901");
        Pessoa pessoa2 = pessoaController.lerPessoa("98765432109");
        exibirPessoa(pessoa1);
        exibirPessoa(pessoa2);

        // Teste de atualização de pessoa
        pessoaController.atualizarPessoa("12345678901", "João da Silva");

        // Teste de leitura após atualização
        System.out.println("===== Ler Pessoa após atualização =====");
        pessoa1 = pessoaController.lerPessoa("12345678901");
        exibirPessoa(pessoa1);

        // Teste de exclusão de pessoa
        pessoaController.deletarPessoa("98765432109");

        // Teste de leitura após exclusão
        System.out.println("===== Ler Pessoa após exclusão =====");
        pessoa2 = pessoaController.lerPessoa("98765432109");
        exibirPessoa(pessoa2);
    }

    private static void exibirPessoa(Pessoa pessoa) {
        if (pessoa != null) {
            System.out.println("CPF: " + pessoa.cpf);
            System.out.println("Nome: " + pessoa.nome);
        } else {
            System.out.println("Pessoa não encontrada.");
        }

        
        System.out.println();
    }
}