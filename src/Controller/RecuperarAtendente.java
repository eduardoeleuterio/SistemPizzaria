package Controller;

import Model.Atendente;


import java.io.IOException;

public class RecuperarAtendente {
    public static void main(String[] args) {
        try {
            Atendente atendente = (Atendente) Serializador.ler("Atendente.ser");
            System.out.println("atendente recuperado - ");
            atendente.exibir();
        } catch (IOException e) {
            System.out.println("IOException");
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.println("ClassNotFoundException");
            e.printStackTrace();
        }
    }
}
