package Model;

import java.util.List;

public class Cliente extends Pessoa{
    public List<Endereco> enderecos;
    public String telefone;

    public Cliente(String nome, List<Endereco> enderecos, String telefone) {
        super(nome);
        this.enderecos = enderecos;
        this.telefone = telefone;
    }
}
