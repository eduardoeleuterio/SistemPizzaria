package Controller;

import Model.Atendente;
import Model.Gerente;

import java.io.IOException;
import java.util.Scanner;

public class CriarAtendente {

    public static void main(String[] args){

        Atendente atendente = new Atendente("53592280910","Marcos", "Marcos", "Marcos",
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