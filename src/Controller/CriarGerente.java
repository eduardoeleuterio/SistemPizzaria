package Controller;

import Model.Gerente;
import Model.Ingrediente;

import java.io.IOException;
import java.util.Scanner;

public class CriarGerente {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        /*
        System.out.println("Informe o nome do gerente: ");
        String nome = input.nextLine();
        System.out.println("Informe a senha do funcionario: ");
        String senha = input.next().toCharArray();
        System.out.println() */
        char[] registro ={ '1'};

        Gerente gerente = new Gerente("09371746963","Nicolas",registro,"Nicolas", "senha");

        try {
            Serializador.gravar("Gerente.ser", gerente);
            System.out.println("Gerente gravado"+ gerente);
        } catch (IOException e) {
            System.out.println("IOException");
            e.printStackTrace();
        }
}
    }