package Sistema.Controller;

import Sistema.Model.Endereco;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class EnderecoController {
    private static final String ARQUIVO_ENDERECOS = "Sistema/DataBase/enderecos.dat";
    private List<Endereco> enderecos;

    public EnderecoController() {
        enderecos = new ArrayList<>();
        carregarEnderecos();
    }

    public void criarEndereco(String rua, String numero, String complemento, String referencia) {
        Endereco endereco = new Endereco(rua, numero, complemento, referencia);
        enderecos.add(endereco);
        salvarEnderecos();
    }

    public Endereco lerEndereco(String rua, String numero) {
        for (Endereco endereco : enderecos) {
            if (endereco.rua.equals(rua) && endereco.numero.equals(numero)) {
                return endereco;
            }
        }
        return null;
    }

    public void atualizarEndereco(String rua, String numero, String novoComplemento, String novaReferencia) {
        Endereco endereco = lerEndereco(rua, numero);
        if (endereco != null) {
            endereco.complemento = novoComplemento;
            endereco.referencia = novaReferencia;
            salvarEnderecos();
        }
    }

    public void deletarEndereco(String rua, String numero) {
        Endereco endereco = lerEndereco(rua, numero);
        if (endereco != null) {
            enderecos.remove(endereco);
            salvarEnderecos();
        }
    }

    private void carregarEnderecos() {
        try {
            Object objeto = Serializador.ler(ARQUIVO_ENDERECOS);
            if (objeto instanceof List<?>) {
                enderecos = (List<Endereco>) objeto;
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private void salvarEnderecos() {
        try {
            Serializador.gravar(ARQUIVO_ENDERECOS, enderecos);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
