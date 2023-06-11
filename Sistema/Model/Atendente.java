package Sistema.Model;

import java.io.Serializable;

public class Atendente extends Funcionario implements Serializable {
    public Atendente(String cpf, String nome, String login, String senha) {
        super(cpf, nome, login, senha);
    }
}
