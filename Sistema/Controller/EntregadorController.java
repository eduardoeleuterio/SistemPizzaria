package Sistema.Controller;

import Sistema.Model.Entregador;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class EntregadorController {
    private static final String ARQUIVO_ENTREGADORES = "Sistema/DataBase/entregadores.dat";
    private List<Entregador> entregadores;

    public EntregadorController() {
        entregadores = new ArrayList<>();
        carregarEntregadores();
    }

    public void criarEntregador(String cpf, String nome, String login, String senha, String veiculo) {
        Entregador entregador = new Entregador(cpf, nome, login, senha, veiculo);
        entregadores.add(entregador);
        salvarEntregadores();
    }

    public Entregador lerEntregador(String cpf) {
        for (Entregador entregador : entregadores) {
            if (entregador.getCpf().equals(cpf)) {
                return entregador;
            }
        }
        return null; // Entregador não encontrado.
    }

    public void atualizarEntregador(String cpf, String novoNome, String novoLogin, String novaSenha, String novoVeiculo) {
        Entregador entregador = lerEntregador(cpf);
        if (entregador != null) {
            entregador.setNome(novoNome);
            entregador.setLogin(novoLogin);
            entregador.setSenha(novaSenha);
            entregador.setVeiculo(novoVeiculo);
            salvarEntregadores();
        }
    }

    public void deletarEntregador(String cpf) {
        Entregador entregador = lerEntregador(cpf);
        if (entregador != null) {
            entregadores.remove(entregador);
            salvarEntregadores();
        }
    }

    private void carregarEntregadores() {
        try {
            Object objeto = Serializador.ler(ARQUIVO_ENTREGADORES);
            if (objeto instanceof List<?>) {
                entregadores = (List<Entregador>) objeto;
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private void salvarEntregadores() {
        try {
            Serializador.gravar(ARQUIVO_ENTREGADORES, entregadores);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
