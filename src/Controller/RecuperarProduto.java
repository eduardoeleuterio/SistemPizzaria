package Controller;
import java.io.IOException;

import Model.Produto;

public class RecuperarProduto {
    public static void main(String[] args) {
        try {
            Produto produto = (Produto) Serializador.ler("Produto.ser");
            System.out.println("Produto recuperada  -");
            produto.exibir();
        } catch (IOException e) {
            System.out.println("IOException");
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.println("ClassNotFoundException");
            e.printStackTrace();
        }
    }
}