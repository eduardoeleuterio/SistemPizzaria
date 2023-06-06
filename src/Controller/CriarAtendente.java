package Controller;

import Model.Atendente;
import Model.Gerente;

import java.io.IOException;
import java.util.Scanner;

public class CriarAtendente {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        /*
        System.out.println("Informe o nome do gerente: ");
        String nome = input.nextLine();
        System.out.println("Informe a senha do funcionario: ");
        char[] senha = input.next().toCharArray();
        System.out.println() */
        char[] senha ={ 'a', 'b', 'c', 'd', 'e' };
        char[] registro ={ '1'};

        Atendente atendente = new Atendente("53592280910","Marcos",registro, "Marcos", senha, 1);

        try {
            Serializador.gravar("Atendente.ser", atendente);
            System.out.println("Atendente gravado"+ atendente);
        } catch (IOException e) {
            System.out.println("IOException");
            e.printStackTrace();
        }
    }
}