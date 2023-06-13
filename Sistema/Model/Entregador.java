package Sistema.Model;

import java.io.Serializable;

public class Entregador extends Funcionario implements Serializable {
    private String veiculo;

    public Entregador(String cpf, String nome, String login, String senha, String veiculo) {
        super(cpf, nome, login, senha);
        this.veiculo = veiculo;
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
