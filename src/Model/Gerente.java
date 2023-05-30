package Model;

public class Gerente extends Pessoa{

    public String senha;
    public String email;


    public Gerente(double cpf, String nome, String senha) {
        super(cpf, nome);
        this.senha = senha;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
