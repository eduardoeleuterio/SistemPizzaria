package Sistema.Model;

import java.io.Serializable;
import java.util.List;

public class Atendente extends Funcionario implements Serializable {
    public Atendente(String cpf, String nome, String login, String senha) {
        super(cpf, nome, login, senha);
    }
}

/*
//GABRIEL: DEIXEI COMENTADO PQ TA DANDO ERRO ESSE CÓDIGO E NÃO CONSEGUI ARRUMAR, NÃO SEI QUEM FICOU RESPONSAVEL POR ISSO AQ

public void criarPedido(Cliente cliente, List<Produto> produtos, Funcionario funcionario, Endereco endereco,List<Pedido> pedidos)
{
    if(funcionario instanceof Atendente)
    {
        for(Pedido pedido: pedidos) {
            if (pedido.getCodigo() == null) {
                Pedido pedido = new Pedido(cliente, produtos, atendente, endereco, status);
            }
        }
    }

}
*/