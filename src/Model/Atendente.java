package Model;

import java.io.Serializable;

public class Atendente extends Funcionario implements Autenticavel, Serializable {

    public Integer ramal;

    public Atendente(String cpf, String nome, char[] registro, String login, char[] senha, Integer ramal) {
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


    public void exibir() {
        System.out.println("Atendente nome" + nome);
        System.out.println("Atendente cpf" + cpf);
        System.out.println("Atendente Registro" + registro);
        System.out.println("Atendente senha" + senha);
    }
}
