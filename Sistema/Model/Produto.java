package Sistema.Model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Produto  implements Serializable{
    public int codigo;
    public String nome;
    public double preco;
    public List<Ingrediente> ingredientes = new ArrayList<Ingrediente>();

    public Produto(int codigo, String nome, double preco, List<Ingrediente> ingredientes){
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
        this.ingredientes = ingredientes;
    }
    public String getNome() {
        return nome;
    }
    public double getPreco() {
        return preco;
    }
    
}
