package Controller;

import Model.Pedido;
import Model.Produto;

import java.io.IOException;

public class RecuperarPedido {
    public static void main(String[] args) {
        try {
            Pedido pedido = (Pedido) Serializador.ler("Pedido.ser");
            System.out.println("Pedido recuperado  -");
            pedido.exibir();
        } catch (IOException e) {
            System.out.println("IOException");
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.println("ClassNotFoundException");
            e.printStackTrace();
        }
    }
}