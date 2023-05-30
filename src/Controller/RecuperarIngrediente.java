package Controller;
import java.io.IOException;
import Model.Ingrediente;

public class RecuperarIngrediente {
    public static void main(String[] args) {
        try {
            Ingrediente ingredinte = (Ingrediente) Serializador.ler("Ingredinte.ser");
            System.out.println("Ingredinte recuperado  - ");
            ingredinte.exibir();
        } catch (IOException e) {
            System.out.println("IOException");
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.println("ClassNotFoundException");
            e.printStackTrace();
        }
    }
}
