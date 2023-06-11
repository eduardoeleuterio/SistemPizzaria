package Sistema.Teste;

import Sistema.Controller.PedidoController;
import Sistema.Model.Cliente;
import Sistema.Model.Endereco;
import Sistema.Model.Funcionario;
import Sistema.Model.Ingrediente;
import Sistema.Model.Pedido;
import Sistema.Model.Produto;

import java.util.ArrayList;
import java.util.List;

public class PedidoTeste {

    public static void main(String[] args) {
        PedidoController pedidoController = new PedidoController();

        // Criação dos ingredientes
        Ingrediente ingrediente1 = new Ingrediente("Queijo");
        Ingrediente ingrediente2 = new Ingrediente("Presunto");

        // Criação dos produtos
        List<Ingrediente> ingredientes1 = new ArrayList<>();
        ingredientes1.add(ingrediente1);
        Produto produto1 = new Produto(1, "Pizza Margherita", 30.0, ingredientes1);

        List<Ingrediente> ingredientes2 = new ArrayList<>();
        ingredientes2.add(ingrediente1);
        ingredientes2.add(ingrediente2);
        Produto produto2 = new Produto(2, "Pizza Quatro Queijos", 35.0, ingredientes2);

        // Criação do cliente
        String cpf = "12345678901";
        String nome = "João";
        String rua = "Rua A";
        String numero = "123";
        String complemento = "Apto 1";
        String referencia = "Próximo ao mercado";
        String telefone = "99999999";
        Endereco endereco = new Endereco(rua, numero, complemento, referencia);
        Cliente cliente = new Cliente(cpf, nome, endereco, telefone);

        // Criação do atendente
        String login = "atendente";
        String senha = "senha";
        Funcionario atendente = new Funcionario(cpf, nome, login, senha);

        // Criação do pedido
        List<Produto> produtos = new ArrayList<>();
        produtos.add(produto1);
        produtos.add(produto2);
        Pedido pedido = new Pedido(cliente, produtos, atendente, endereco, 0);

        // Chamada para criar e salvar o pedido no controlador
        pedidoController.criarPedido(pedido.getCliente(), pedido.getProdutos(), pedido.getAtendente(), pedido.getEndereco());

        // Exibição dos dados do pedido
        System.out.println("Pedido criado:");
        System.out.println("Cliente: " + pedido.getCliente().getNome());
        System.out.println("Produtos: ");
        for (Produto produto : pedido.getProdutos()) {
            System.out.println("- " + produto.getNome());
        }
        System.out.println("Atendente: " + pedido.getAtendente().getNome());
        System.out.println("Endereço: " + pedido.getEndereco().getRua() + ", " + pedido.getEndereco().getNumero());
        System.out.println("Valor: " + pedido.getValor());
        System.out.println("Status: " + pedido.getStatus());
        System.out.println("Data/Hora: " + pedido.getDataHora());
    }
}
