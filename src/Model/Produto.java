package Model;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;

public class Produto implements Serializable{
    public int codigo;
    public String nome;
    public Categoria categoria;
    public double preco;
    public List<Ingrediente> ingredientes = new ArrayList<Ingrediente>();

    public Produto(int codigo, String nome, Categoria categoria, double preco, List<Ingrediente> ingredientes){
        this.codigo = codigo;
        this.nome = nome;
        this.categoria = categoria;
        this.preco = preco;
        this.ingredientes = ingredientes;
    }
    public void exibir(){
        System.out.println("Codigo" + codigo);
        System.out.println("Nome" + nome);
        System.out.println("Categoria" + categoria);
        System.out.println("Preco" + preco );
        System.out.println("ingredientes");
        for (Ingrediente ingrediente : ingredientes) {
            System.out.println("-  "+ingrediente);
        }
    }
}

