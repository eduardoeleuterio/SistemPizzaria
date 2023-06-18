package Sistema.Controller;

import Sistema.Model.Ingrediente;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class IngredienteController {
    private static final String ARQUIVO_INGREDIENTES = "Sistema/DataBase/ingredientes.dat";
    private List<Ingrediente> ingredientes;

    public IngredienteController() {
        ingredientes = new ArrayList<>();
        carregarIngredientes();
    }

    public void criarIngrediente(String nome) {
        Ingrediente ingrediente = new Ingrediente(nome);
        ingredientes.add(ingrediente);
        salvarIngredientes();
    }

    public Ingrediente lerIngrediente(String nome) {
        for (Ingrediente ingrediente : ingredientes) {
            if (ingrediente.getNome().equals(nome)) {
                return ingrediente;
            }
        }
        return null;
    }

    public void atualizarIngrediente(String nome, String novoNome) {
        Ingrediente ingrediente = lerIngrediente(nome);
        if (ingrediente != null) {
            ingrediente.setNome(novoNome);
            salvarIngredientes();
        }
    }

    public void deletarIngrediente(String nome) {
        Ingrediente ingrediente = lerIngrediente(nome);
        if (ingrediente != null) {
            ingredientes.remove(ingrediente);
            salvarIngredientes();
        }
    }

    private void carregarIngredientes() {
        try {
            Object objeto = Serializador.ler(ARQUIVO_INGREDIENTES);
            if (objeto instanceof List<?>) {
                ingredientes = (List<Ingrediente>) objeto;
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private void salvarIngredientes() {
        try {
            Serializador.gravar(ARQUIVO_INGREDIENTES, ingredientes);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
