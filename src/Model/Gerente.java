package Model;

public class Gerente extends Pessoa{

    private Integer senha;

    public Gerente(String nome, int senha) {
        super(nome);
        this.senha = senha;
    }

    public Integer getSenha() {
        return senha;
    }

    public void setSenha(Integer senha) {
        this.senha = senha;
    }
}
