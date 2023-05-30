package Model;

import java.io.Serializable;

public class Gerente extends Funcionario implements Serializable {

    public String email;


    public Gerente(String cpf, String nome, char[] registro, String login, char[] senha) {
        super(cpf, nome, registro, login, senha);

    }

    public void exibir(){
        System.out.println("Gerente" + nome + cpf + email + senha);
    }






}
