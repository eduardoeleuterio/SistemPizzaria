package Controller;
import java.io.IOException;
import Model.Categoria;

public class CriaCategoria {
    public static void main(String[] args){
        Categoria categoria = new Categoria( "Pizza Especial");
     
        try {
            Serializador.gravar("Categoria.ser", categoria);
            System.out.println("Categoria gravada"+ categoria);
        } catch (IOException e) {
            System.out.println("IOException");
            e.printStackTrace();
        }
    }
    
}
