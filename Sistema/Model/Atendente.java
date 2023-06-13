package Sistema.Model;

import java.io.Serializable;
import java.util.List;

public class Atendente extends Funcionario implements Serializable {
    public Atendente(String cpf, String nome, String login, String senha) {
        super(cpf, nome, login, senha);
    }
}

public void criarPedido(Cliente cliente, List<Produto> produtos, Funcionario funcionario, Endereco endereco){
    if(funcionario instanceof Atendente ){
        Pedido.criarPedido(cliente, produtos, funcionario, endereco);
        } else{
            System.out.println("apenas atendentes podem criar pedidos");
        }
}

