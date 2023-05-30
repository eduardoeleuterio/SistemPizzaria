package Model;

public abstract class Pessoa  {

    public Double cpf;
    public String nome;

    public Pessoa(double cpf, String nome) {
        this.nome = nome;
        this.cpf = cpf;
    }
}