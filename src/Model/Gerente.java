package Model;

import java.io.Serializable;

public class Gerente extends Funcionario implements Serializable {

    public String email;

    public Gerente(String cpf, String nome, String registro, String login, String senha) {
        super(cpf, nome, registro, login, senha);

    }

    public void exibir(){
        System.out.println("Gerente" + nome + cpf + email + senha);
    }


}
