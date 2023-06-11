package Sistema.Controller;
import Sistema.Model.Ingrediente;
import Sistema.Model.Produto;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ProdutoController {
    private static final String ARQUIVO_PRODUTOS =  "Sistema/DataBase/produtos.dat";
    private List<Produto> produtos;

    public ProdutoController() {
        produtos = new ArrayList<>();
        carregarProdutos();
    }

    public void criarProduto(int codigo, String nome, double preco, List<Ingrediente> ingredientes) {
        Produto produto = new Produto(codigo, nome, preco, ingredientes);
        produtos.add(produto);
        salvarProdutos();
    }

    public Produto lerProduto(int codigo) {
        for (Produto produto : produtos) {
            if (produto.codigo == codigo) {
                return produto;
            }
        }
        return null;
    }

    public void atualizarProduto(int codigo, String novoNome, double novoPreco, List<Ingrediente> novosIngredientes) {
        Produto produto = lerProduto(codigo);
        if (produto != null) {
            produto.nome = novoNome;
            produto.preco = novoPreco;
            produto.ingredientes = novosIngredientes;
            salvarProdutos();
        }
    }

    public void deletarProduto(int codigo) {
        Produto produto = lerProduto(codigo);
        if (produto != null) {
            produtos.remove(produto);
            salvarProdutos();
        }
    }

    private void carregarProdutos() {
        try {
            Object objeto = Serializador.ler(ARQUIVO_PRODUTOS);
            if (objeto instanceof List<?>) {
                produtos = (List<Produto>) objeto;
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private void salvarProdutos() {
        try {
            Serializador.gravar(ARQUIVO_PRODUTOS, produtos);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
