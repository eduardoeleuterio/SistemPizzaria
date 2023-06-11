package Controller;
import Model.Atendente;
import java.io.IOException;
public class CriarAtendente {

    public static void main(String[] args){

        Atendente atendente = new Atendente("53592280910","Nicolas", "Nicolas", "Nicolas",
         "senha", 1);

        try {
            Serializador.gravar("Atendente.ser", atendente);
            System.out.println("Atendente gravado"+ atendente);
        } catch (IOException e) {
            System.out.println("IOException");
            e.printStackTrace();
        }
    }
}