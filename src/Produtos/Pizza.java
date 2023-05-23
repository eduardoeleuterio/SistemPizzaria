package Produtos;

public class Pizza extends Produto{
    public char tamanho;
    public Sabor sabor;

    public Pizza(String nome, double preco, char tamanho, Sabor sabor) {
        super(nome, preco);
        this.tamanho = tamanho;
        this.sabor = sabor;
    }
}
