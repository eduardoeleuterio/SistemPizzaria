package Controller;

import Model.Categoria;
import Model.Cliente;
import Model.Pedido;
import Model.ProdutoPedido;

import java.io.IOException;
import java.util.List;

public class CriaPedido {
    public static void main(String[] args){

        Cliente cliente = new Cliente("06188144183", "jose", "66554994934");
        //.... É um código bem longo criando tudo que tem dentro de cada parametro da função...

        // Pedido pedido = new Pedido(cliente, produtos, atendente, endereco, entrega, desconto,
        //        taxa_entrega, valor, forma_pagamento, troco, data, hora, status);
        try {
            Serializador.gravar("Pedido.ser", pedido);
            System.out.println("Pedido gravado"+ pedido);
        } catch (IOException e) {
            System.out.println("IOException");
            e.printStackTrace();
        }
    }
}
