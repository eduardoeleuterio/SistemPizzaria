package Sistema.Controller;

import Sistema.Model.Funcionario;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FuncionarioController {
    private static final String ARQUIVO_FUNCIONARIOS = "Sistema/DataBase/funcionarios.dat";
    private List<Funcionario> funcionarios;

    public FuncionarioController() {
        funcionarios = new ArrayList<>();
        carregarFuncionarios();
    }

    public void criarFuncionario(String cpf, String nome, String login, String senha) {
        Funcionario funcionario = new Funcionario(cpf, nome, login, senha);
        funcionarios.add(funcionario);
        salvarFuncionarios();
    }

    public Funcionario lerFuncionario(String cpf) {
        for (Funcionario funcionario : funcionarios) {
            if (funcionario.getCpf().equals(cpf)) {
                return funcionario;
            }
        }
        return null; // Funcionário não encontrado
    }

    public void atualizarFuncionario(String cpf, String novoNome, String novoLogin, String novaSenha) {
        Funcionario funcionario = lerFuncionario(cpf);
        if (funcionario != null) {
            funcionario.setNome(novoNome);
            funcionario.setLogin(novoLogin);
            funcionario.setSenha(novaSenha);
            salvarFuncionarios();
        }
    }

    public void deletarFuncionario(String cpf) {
        Funcionario funcionario = lerFuncionario(cpf);
        if (funcionario != null) {
            funcionarios.remove(funcionario);
            salvarFuncionarios();
        }
    }

    private void carregarFuncionarios() {
        try {
            Object objeto = Serializador.ler(ARQUIVO_FUNCIONARIOS);
            if (objeto instanceof List<?>) {
                funcionarios = (List<Funcionario>) objeto;
            }
        } catch (IOException | ClassNotFoundException e) {
            // Tratar exceção adequadamente
            e.printStackTrace();
        }
    }

    private void salvarFuncionarios() {
        try {
            Serializador.gravar(ARQUIVO_FUNCIONARIOS, funcionarios);
        } catch (IOException e) {
            // Tratar exceção adequadamente
            e.printStackTrace();
        }
    }
}
