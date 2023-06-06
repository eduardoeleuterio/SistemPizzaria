package Controller;

import Model.Atendente;
import Model.Categoria;
import Model.Cliente;
import Model.Endereco;
import Model.Pedido;
import Model.ProdutoPedido;

import java.io.IOException;
import java.util.List;

public class CriaPedido {
    public static void main(String[] args){

        Cliente cliente = new Cliente("06188144183", "jose", "66554994934");
        Atendente atendente = new Atendente("06188144183", "Walter", "66554994934", "1,"batatinha1234" );
        Endereco endereco = new Endereco("floriano peixoto", 1,"perto do mercado");

        Pedido pedido = new Pedido(cliente, produtos, atendente, endereco, desconto
                taxa_entrega, valor, forma_pagamento, troco, data, hora, status);
        try {
            Serializador.gravar("Pedido.ser", pedido);
            System.out.println("Pedido gravado"+ pedido);
        } catch (IOException e) {
            System.out.println("IOException");
            e.printStackTrace();
        }
    }
}
