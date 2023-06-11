package Sistema.Controller;

import Sistema.Model.Cliente;
import Sistema.Model.Endereco;
import Sistema.Model.Funcionario;
import Sistema.Model.Pedido;
import Sistema.Model.Produto;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PedidoController {
    private static final String ARQUIVO_PEDIDOS = "Sistema/DataBase/pedidos.dat";
    private List<Pedido> pedidos;

    public PedidoController() {
        pedidos = new ArrayList<>();
        carregarPedidos();
    }

    public void criarPedido(Cliente cliente, List<Produto> produtos, Funcionario atendente, Endereco endereco) {
        int status = 1; // Status inicial do pedido
        Pedido pedido = new Pedido(cliente, produtos, atendente, endereco, status);
        pedidos.add(pedido);
        salvarPedidos();
    }

    public Pedido lerPedido(int codigo) {
        for (Pedido pedido : pedidos) {
            if (pedido.getCodigo() == codigo) {
                return pedido;
            }
        }
        return null;
    }

    public void atualizarStatusPedido(int codigo, int novoStatus) {
        Pedido pedido = lerPedido(codigo);
        if (pedido != null) {
            pedido.setStatus(novoStatus);
            salvarPedidos();
        }
    }

    public void deletarPedido(int codigo) {
        Pedido pedido = lerPedido(codigo);
        if (pedido != null) {
            pedidos.remove(pedido);
            salvarPedidos();
        }
    }

    private void carregarPedidos() {
        try {
            Object objeto = Serializador.ler(ARQUIVO_PEDIDOS);
            if (objeto instanceof List<?>) {
                pedidos = (List<Pedido>) objeto;
            }
        } catch (IOException | ClassNotFoundException e) {
            // Tratar exceção adequadamente
            e.printStackTrace();
        }
    }

    private void salvarPedidos() {
        try {
            Serializador.gravar(ARQUIVO_PEDIDOS, pedidos);
        } catch (IOException e) {
            // Tratar exceção adequadamente
            e.printStackTrace();
        }
    }
}
