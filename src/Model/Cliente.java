package Model;

import java.io.Serializable;
import java.util.List;

public class Cliente extends Pessoa implements Serializable {
    public List<Endereco> enderecos;
    public String telefone;

    public Cliente(double cpf, String nome, List<Endereco> enderecos, String telefone) {
        super(cpf, nome);
        this.enderecos = enderecos;
        this.telefone = telefone;
    }

    public void exibir() {
        System.out.println("Cliente " + cpf + nome);
        for (Endereco end : enderecos)
        {
            System.out.println("Endereço: " + end);
        }
        System.out.println(telefone);
    }
}
