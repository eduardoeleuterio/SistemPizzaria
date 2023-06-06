package Model;

import java.io.Serializable;

public class Cliente extends Pessoa implements Serializable {
    public String telefone;

    public Cliente(String cpf, String nome, String telefone) {
        super(cpf, nome);
        this.telefone = telefone;
    }

    public void exibir() {
        System.out.println("Cliente " + cpf + nome + telefone);
    }
}
