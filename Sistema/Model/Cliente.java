package Sistema.Model;

import java.io.Serializable;

public class Cliente extends Pessoa implements Serializable {
    private Endereco endereco;
    private String telefone;

    public Cliente(String cpf, String nome, Endereco endereco, String telefone) {
        super(cpf, nome);
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    

}
