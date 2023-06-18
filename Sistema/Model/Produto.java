package Sistema.Model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Produto implements Serializable {
    private int codigo;
    private String nome;
    private double preco;
    private List<Ingrediente> ingredientes = new ArrayList<Ingrediente>();

    public Produto(int codigo, String nome, double preco, List<Ingrediente> ingredientes) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
        this.ingredientes = ingredientes;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public List<Ingrediente> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(List<Ingrediente> ingredientes) {
        this.ingredientes = ingredientes;
    }
}
