package Model;

import java.io.Serializable;

public class Pessoa implements Serializable {

    public Double cpf;
    public String nome;

    public Pessoa(double cpf, String nome) {
        this.nome = nome;
        this.cpf = cpf;
    }


    public void exibir(){
        System.out.println("Pessoa" + nome + cpf);
    }
}