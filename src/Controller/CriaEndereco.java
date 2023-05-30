package Controller;
import java.io.IOException;
import Model.Endereco;

public class CriaEndereco {
    public static void main(String[] args){
            Endereco endereco = new Endereco(
                "Avenida Brasil", "615", "Casa Azul", "Na frente da prefeitura");

        try {
            Serializador.gravar("Endereco.ser", endereco);
            System.out.println("Endereço gravado" + endereco);
        } catch (IOException e) {
            System.out.println("IOException");
            e.printStackTrace();
            
        }   
    }
    
}
