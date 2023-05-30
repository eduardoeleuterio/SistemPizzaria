package Model;

public abstract class Pessoa  {

    public String nome;
    public Integer senha;
    public String email;
    public Double cpf;


    public Pessoa(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
