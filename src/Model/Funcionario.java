package Model;

import java.io.Serializable;

public class Funcionario extends Pessoa implements Serializable {

    public String registro;
    public String login;
    public char[] senha;

    // Construtor do Funcionario
    public Funcionario(String cpf, String nome, String registro,
                       String login, char[] senha) {
        super(cpf, nome);
        this.registro = registro;
        this.login = login;
        this.senha = senha;
    }

    public void exibir() {
        System.out.println("Funcionario: " + cpf + login + " ");
        for (char c : senha) {
            System.out.print(c);
        }
        System.out.println("");
    }
}
