package Controller;
import java.io.IOException;
import Model.Ingrediente;

public class CriaIngredinte {
    public static void main(String[] args){
        Ingrediente ingrediente = new Ingrediente( "Calabresa");
        
        try {
            Serializador.gravar("Ingredinte.ser", ingrediente);
            System.out.println("Ingredinte gravado"+ ingrediente);
        } catch (IOException e) {
            System.out.println("IOException");
            e.printStackTrace();
        }
    }
    
}
