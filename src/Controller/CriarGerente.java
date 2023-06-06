package Controller;

import Model.Gerente;
import java.io.IOException;
import java.util.Scanner;

public class CriarGerente {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        Gerente gerente = new Gerente("09371746963","Nicolas","Nicolas", "nicolas", "senha");

        try {
            Serializador.gravar("Gerente.ser", gerente);
            System.out.println("Gerente gravado"+ gerente);
        } catch (IOException e) {
            System.out.println("IOException");
            e.printStackTrace();
        }
}
    }