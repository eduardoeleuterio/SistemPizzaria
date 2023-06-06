package Model;

import java.io.Serializable;

public class Pessoa implements Serializable {

    public String cpf;
    public String nome;

    public Pessoa(String cpf, String nome) {
        this.nome = nome;
        this.cpf = cpf;
    }


    public void exibir(){

        System.out.println("Pessoa Nome" + nome);
        System.out.println("Pessoa Cpf" + cpf);

    }
}