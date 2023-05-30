package Model;

import java.io.Serializable;

public class Funcionario extends Pessoa implements Serializable {

    public int registro;
    public String login;
    public char[] senha;

    // Construtor do Funcionario
    public Funcionario(double cpf, String nome, int registro,
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
