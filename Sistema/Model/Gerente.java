package Sistema.Model;

import java.io.Serializable;
import java.util.List;

public class Gerente extends Funcionario implements Serializable {
    private String setor;

    public Gerente(String cpf, String nome, String login, String senha, String setor) {
        super(cpf, nome, login, senha);
        this.setor = setor;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public void MudarStatusPedido(Pedido pedido, int novoStatus){
        pedido.setStatus(novoStatus);
    }

    public void deletarPedido(List<Pedido> pedidos, int codigo){
        for(Pedido pedido: pedidos){
            if(pedido.getCodigo() == codigo){
                pedidos.remove(pedido);
            }
        }
    }
}



