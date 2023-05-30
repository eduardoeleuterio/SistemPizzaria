package Model;

import java.io.Serializable;

public class Gerente extends Funcionario implements Serializable {

    public String email;


    public Gerente(double cpf, String nome, int registro, String login, char[] senha, String senha1) {
        super(cpf, nome, registro, login, senha);

    }

    public void exibir(){
        System.out.println("Gerente" + nome + cpf + email + senha);
    }



L


}
