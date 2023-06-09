package Sistema.Model;

import java.io.Serializable;

public class Funcionario extends Pessoa implements Serializable {
    private String login;
    private String senha;

    public Funcionario(String cpf, String nome, String login, String senha) {
        super(cpf, nome);
        this.login = login;
        this.senha = senha;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void MudarStatusPedido(Pedido pedido, int novoStatus){
        pedido.setStatus(novoStatus);

    }
}
