package Model;

public class ProdutoPedido {
    public String pedido;
    public int quantidade;
    public String Observacao;

    public ProdutoPedido(String pedido, int quantidade, String observacao) {
        this.pedido = pedido;
        this.quantidade = quantidade;
        Observacao = observacao;
    }

    public void exibir() {
        System.out.println("Produto Pedido: " + pedido + quantidade + Observacao);
    }
}
