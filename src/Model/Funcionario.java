package Model;

import java.io.Serializable;

public class Funcionario extends Pessoa implements Serializable {

    public String registro;
    public String login;
    public String senha;

    // Construtor do Funcionario
    public Funcionario(String cpf, String nome, String registro,
                       String login, String senha) {
        super(cpf, nome);
        this.registro = registro;
        this.login = login;
        this.senha = senha;
    }

    public void exibir() {
        System.out.println("Funcionario: " + cpf + login + senha);
       
    }
}
