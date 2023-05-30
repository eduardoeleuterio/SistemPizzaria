package Model;

public abstract class Pessoa  {

    public String nome;
    public Integer senha;
    public String email;
    public Double cpf;

    public Pessoa(String nome, int senha, String email, double cpf) {
        this.nome = nome;
        this.senha = senha;
        this.email = email;
        this.cpf = cpf;
    }



    public Double getCpf() {
        return cpf;
    }




    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
