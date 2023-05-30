package Model;

public class Gerente extends Pessoa{

    public Gerente(String nome, int senha, String email, double cpf)
    {
        super(nome, senha, email, cpf);
    }

    public Integer getSenha()
    {
        return senha;
    }

    public void setSenha(Integer senha)
    {
        this.senha = senha;
    }
}
