package Model;

import java.util.List;

public class Cliente extends Pessoa{
    public List<Endereco> enderecos;
    public String telefone;

    public Cliente(double cpf, String nome, List<Endereco> enderecos, String telefone) {
        super(cpf, nome);
        this.enderecos = enderecos;
        this.telefone = telefone;
    }
}
