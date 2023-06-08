package Controller;
import java.io.IOException;

import Model.Cliente;

public class RecuperarCliente {
    public static void main(String[] args) {
        try {
            Cliente client = (Cliente) Serializador.ler("Cliente.ser");
            System.out.println("Categoira recuperada  -");
            client.exibir();
        } catch (IOException e) {
            System.out.println("IOException");
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.println("ClassNotFoundException");
            e.printStackTrace();
        }
    }
}
