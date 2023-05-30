package Controller;
import java.io.IOException;

import Model.Categoria;

public class RecuperarCategoria {
    public static void main(String[] args) {
        try {
            Categoria categoria = (Categoria) Serializador.ler("Categoria.ser");
            System.out.println("Categoira recuperada  -");
            categoria.exibir();
        } catch (IOException e) {
            System.out.println("IOException");
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.println("ClassNotFoundException");
            e.printStackTrace();
        }
    }
}
