package Controller;

import Model.Atendente;
import Model.Categoria;
import Model.Cliente;
import Model.Endereco;
import Model.Ingrediente;
import Model.Pedido;
import Model.Produto;
import Model.ProdutoPedido;

import java.io.IOException;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;

public class CriaPedido {
    public static void main(String[] args){

        
        Cliente cliente = new Cliente("06188144183", "jose", "66554994934");
        Atendente atendente = new Atendente("53592280910","Marcos", "Marcos", "Marcos",
         "senha", 1);
        Ingrediente ingrediente = new Ingrediente("agua");
        Ingrediente ingrediente2 = new Ingrediente("gas");
        List<Ingrediente> ingredientes = new ArrayList<Ingrediente>();
        Categoria categoria = new Categoria("bebida");
        ingredientes.add(ingrediente);
        ingredientes.add(ingrediente2);
        List<Produto> produtos = new ArrayList<Produto>();
        Produto produto = new Produto(2,"coca Cola", categoria,10.90, ingredientes ); 
        Endereco endereco = new Endereco("torres", "2", "casa","perto mercado");
        produtos.add(produto);
        Date date = new Date(89432893);
        Double total = 0.00;

        for (Produto itemProduto : produtos) {
           total += itemProduto.preco;
        }

        Pedido pedido = new Pedido(cliente,produtos,atendente,endereco,total,date,0);
        try {
            Serializador.gravar("Pedido.ser", pedido);
            System.out.println("Pedido gravado"+ pedido);
        } catch (IOException e) {
            System.out.println("IOException");
            e.printStackTrace();
        }
    }
}
