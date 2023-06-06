package Model;

public class Atendente extends Funcionario implements Autenticavel{

    public Integer ramal;

    public Atendente(String cpf, String nome, String registro, String login, String senha, Integer ramal) {
        super(cpf, nome, registro, login, senha);
        this.ramal = ramal;
    }
    public void preparando(Pedido produto) {
        produto.status = 1;
    }


    public void feito(Pedido produto) {
        produto.status = 2;

    }

    public void enviado(Pedido produto) {
        produto.status = 3;
    }
}
