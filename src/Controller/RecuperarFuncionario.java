package Controller;

import Model.Funcionario;

import java.io.IOException;

public class RecuperarFuncionario {
    public static void main(String[] args) {
        try {
            Funcionario func = (Funcionario) Serializador.ler("Funcionario.ser");
            System.out.println("Funcionario recuperado");
            func.exibir();
        } catch (IOException e) {
            System.out.println("IOException");
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.println("ClassNotFoundException");
            e.printStackTrace();
        }
    }
}
