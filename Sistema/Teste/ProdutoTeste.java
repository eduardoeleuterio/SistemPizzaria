package Sistema.Teste;

import Sistema.Controller.ProdutoController;
import Sistema.Model.Ingrediente;
import Sistema.Model.Produto;

import java.util.ArrayList;
import java.util.List;

public class ProdutoTeste {
    public static void main(String[] args) {
        ProdutoController produtoController = new ProdutoController();

        // Criar alguns ingredientes
        Ingrediente ingrediente1 = new Ingrediente("Queijo");
        Ingrediente ingrediente2 = new Ingrediente("Presunto");

        // Criar alguns produtos
        List<Ingrediente> ingredientes1 = new ArrayList<>();
        ingredientes1.add(ingrediente1);
        Produto produto1 = new Produto(1, "Pizza Margherita", 30.0, ingredientes1);

        List<Ingrediente> ingredientes2 = new ArrayList<>();
        ingredientes2.add(ingrediente1);
        ingredientes2.add(ingrediente2);
        Produto produto2 = new Produto(2, "Pizza Quatro Queijos", 35.0, ingredientes2);

        // Adicionar produtos
        produtoController.criarProduto(produto1.codigo, produto1.nome, produto1.preco, produto1.ingredientes);
        produtoController.criarProduto(produto2.codigo, produto2.nome, produto2.preco, produto2.ingredientes);

        // Ler produtos
        System.out.println("===== Ler Produto =====");
        Produto produtoLido1 = produtoController.lerProduto(produto1.codigo);
        Produto produtoLido2 = produtoController.lerProduto(produto2.codigo);
        exibirProduto(produtoLido1);
        exibirProduto(produtoLido2);

        // Atualizar produtos
        List<Ingrediente> novosIngredientes = new ArrayList<>();
        novosIngredientes.add(ingrediente2);
        produtoController.atualizarProduto(produto1.codigo, "Nova Pizza", 40.0, novosIngredientes);

        // Ler produtos após atualização
        System.out.println("===== Ler Produto após atualização =====");
        produtoLido1 = produtoController.lerProduto(produto1.codigo);
        exibirProduto(produtoLido1);

        // Deletar produtos
        produtoController.deletarProduto(produto2.codigo);

        // Ler produtos após exclusão
        System.out.println("===== Ler Produto após exclusão =====");
        produtoLido2 = produtoController.lerProduto(produto2.codigo);
        exibirProduto(produtoLido2);
    }

    private static void exibirProduto(Produto produto) {
        if (produto != null) {
            System.out.println("Código: " + produto.codigo);
            System.out.println("Nome: " + produto.nome);
            System.out.println("Preço: " + produto.preco);
            System.out.println("Ingredientes:");
            for (Ingrediente ingrediente : produto.ingredientes) {
                System.out.println("- " + ingrediente.nome);
            }
        } else {
            System.out.println("Produto não encontrado.");
        }
        System.out.println();
    }
}
