package Controller;

import Model.Gerente;


import java.io.IOException;

public class RecuperaGerente {
    public static void main(String[] args) {
        try {
            Gerente gerente = (Gerente) Serializador.ler("Gerente.ser");
            System.out.println("Gerente recuperado - ");
            gerente.exibir();
        } catch (IOException e) {
            System.out.println("IOException");
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.println("ClassNotFoundException");
            e.printStackTrace();
        }
    }
}


