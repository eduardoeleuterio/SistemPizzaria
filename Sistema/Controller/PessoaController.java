package Sistema.Controller;

import Sistema.Model.Pessoa;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PessoaController {
    private static final String ARQUIVO_PESSOAS = "Sistema/DataBase/pessoas.dat";
    private List<Pessoa> pessoas;

    public PessoaController() {
        pessoas = new ArrayList<>();
        carregarPessoas();
    }

    public void criarPessoa(String cpf, String nome) {
        Pessoa pessoa = new Pessoa(cpf, nome);
        pessoas.add(pessoa);
        salvarPessoas();
    }

    public Pessoa lerPessoa(String cpf) {
        for (Pessoa pessoa : pessoas) {
            if (pessoa.getCpf().equals(cpf)) {
                return pessoa;
            }
        }
        return null; // Pessoa não encontrada
    }

    public void atualizarPessoa(String cpf, String novoNome) {
        Pessoa pessoa = lerPessoa(cpf);
        if (pessoa != null) {
            pessoa.setNome(novoNome);
            salvarPessoas();
        }
    }

    public void deletarPessoa(String cpf) {
        Pessoa pessoa = lerPessoa(cpf);
        if (pessoa != null) {
            pessoas.remove(pessoa);
            salvarPessoas();
        }
    }

    private void carregarPessoas() {
        try {
            Object objeto = Serializador.ler(ARQUIVO_PESSOAS);
            if (objeto instanceof List<?>) {
                pessoas = (List<Pessoa>) objeto;
            }
        } catch (IOException | ClassNotFoundException e) {
            // Tratar exceção adequadamente
            e.printStackTrace();
        }
    }

    private void salvarPessoas() {
        try {
            Serializador.gravar(ARQUIVO_PESSOAS, pessoas);
        } catch (IOException e) {
            // Tratar exceção adequadamente
            e.printStackTrace();
        }
    }
}
