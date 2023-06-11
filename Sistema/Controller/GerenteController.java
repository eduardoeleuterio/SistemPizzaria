package Sistema.Controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import Sistema.Model.Gerente;

public class GerenteController {
    private static final String ARQUIVO_GERENTES = "Sistema/DataBase/gerentes.dat";
    private List<Gerente> gerentes;

    public GerenteController() {
        gerentes = new ArrayList<>();
        carregarGerentes();
    }

    public void criarGerente(String cpf, String nome, String login, String senha, String setor) {
        Gerente gerente = new Gerente(cpf, nome, login, senha, setor);
        gerentes.add(gerente);
        salvarGerentes();
    }

    public Gerente lerGerente(String cpf) {
        for (Gerente gerente : gerentes) {
            if (gerente.getCpf().equals(cpf)) {
                return gerente;
            }
        }
        return null;
    }

    public void atualizarGerente(String cpf, String novoNome, String novoLogin, String novaSenha, String novoSetor) {
        Gerente gerente = lerGerente(cpf);
        if (gerente != null) {
            gerente.setNome(novoNome);
            gerente.setLogin(novoLogin);
            gerente.setSenha(novaSenha);
            gerente.setSetor(novoSetor);
            salvarGerentes();
        }
    }

    public void deletarGerente(String cpf) {
        Gerente gerente = lerGerente(cpf);
        if (gerente != null) {
            gerentes.remove(gerente);
            salvarGerentes();
        }
    }

    private void carregarGerentes() {
        try {
            Object objeto = Serializador.ler(ARQUIVO_GERENTES);
            if (objeto instanceof List<?>) {
                gerentes = (List<Gerente>) objeto;
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private void salvarGerentes() {
        try {
            Serializador.gravar(ARQUIVO_GERENTES, gerentes);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
