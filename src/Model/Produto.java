package Model;

import java.util.ArrayList;
import java.util.List;

public class Produto {
    public int codigo;
    public String nome;
    public Categoria categoria;
    public double preco;
    public List<Ingrediente> ingredientes = new ArrayList<Ingrediente>();
}
