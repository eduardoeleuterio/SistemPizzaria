package Controller;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import Model.Categoria;
import Model.Ingrediente;
import Model.Produto;

public class CriaProduto {
    public static void main(String[] args){
        Categoria categoria = new Categoria( "Pizza Tradicional");
        Ingrediente ingrediente = new Ingrediente( "Queijo Mussarela");
        List<Ingrediente> ingredientes = new ArrayList<Ingrediente>();
        ingredientes.add(0, ingrediente);

        Produto produto = new Produto(1, "PizzaCalabresa",categoria, 10.00 , ingredientes);
        //(int codigo, String nome, Categoria categoria, double preco, List<Ingrediente> ingredientes
        try {
            Serializador.gravar("Produto.ser", produto);
            System.out.println("Produto gravado"+ produto);
        } catch (IOException e) {
            System.out.println("IOException");
            e.printStackTrace();
        }
    }
    
}
