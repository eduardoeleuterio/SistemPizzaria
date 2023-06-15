package Sistema.Model;

import java.io.Serializable;

public class Entregador extends Funcionario implements Serializable {
    private String veiculo;
    private Pedido pedido;

    public Entregador(String cpf, String nome, String login, String senha, String veiculo) {
        super(cpf, nome, login, senha);
        this.veiculo = veiculo;
    }

    public void AdicionarEntrega(Pedido pedido)
    {
        this.pedido = pedido;
    }

    public Pedido verEntrega()
    {
        return pedido;
    }

    public String getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(String veiculo) {
        this.veiculo = veiculo;
    }

    public void MudarStatusPedido(Pedido pedido, int novoStatus){
        pedido.setStatus(novoStatus);

    }
}
