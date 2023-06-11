package Sistema.Controller;

import Sistema.Model.Atendente;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AtendenteController {
    private static final String ARQUIVO_ATENDENTES = "Sistema/DataBase/atendentes.dat";
    private List<Atendente> atendentes;

    public AtendenteController() {
        // Inicializa a lista de atendentes
        atendentes = new ArrayList<>();
        // Carrega os dados do arquivo, se existir
        carregarAtendentes();
    }

    public void criarAtendente(String cpf, String nome, String login, String senha) {
        Atendente atendente = new Atendente(cpf, nome, login, senha);
        atendentes.add(atendente);
        salvarAtendentes();
    }

    public Atendente lerAtendente(String cpf) {
        for (Atendente atendente : atendentes) {
            if (atendente.getCpf().equals(cpf)) {
                return atendente;
            }
        }
        return null; // Atendente não encontrado
    }

    public void atualizarAtendente(String cpf, String novoNome, String novoLogin, String novaSenha) {
        Atendente atendente = lerAtendente(cpf);
        if (atendente != null) {
            atendente.setNome(novoNome);
            atendente.setLogin(novoLogin);
            atendente.setSenha(novaSenha);
            salvarAtendentes();
        }
    }

    public void deletarAtendente(String cpf) {
        Atendente atendente = lerAtendente(cpf);
        if (atendente != null) {
            atendentes.remove(atendente);
            salvarAtendentes();
        }
    }

    private void carregarAtendentes() {
        try {
            Object objeto = Serializador.ler(ARQUIVO_ATENDENTES);
            if (objeto instanceof List<?>) {
                atendentes = (List<Atendente>) objeto;
            }
        } catch (IOException | ClassNotFoundException e) {
            // Tratar exceção adequadamente
            e.printStackTrace();
        }
    }

    private void salvarAtendentes() {
        try {
            Serializador.gravar(ARQUIVO_ATENDENTES, atendentes);
        } catch (IOException e) {
            // Tratar exceção adequadamente
            e.printStackTrace();
        }
    }
}
