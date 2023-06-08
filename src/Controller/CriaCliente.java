package Controller;

import Model.Cliente;
import java.io.IOException;

public class CriaFuncionario {

    public static void main(String[] args){
        Cliente client = new Cliente("09371746963", "Nicolas","41998144154");

        try {
            Serializador.gravar("Funcionario.ser", client);
            System.out.println("Funcionario gravado"+ client);
        } catch (IOException e) {
            System.out.println("IOException");
            e.printStackTrace();
        }
    }
}
