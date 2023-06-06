package Controller;

import Model.Funcionario;
import java.io.IOException;

public class CriaFuncionario {

    public static void main(String[] args){
        Funcionario func = new Funcionario("06188144183", "Gabriel",
                "324235", "gab@gmail.com", "senha");

        try {
            Serializador.gravar("Funcionario.ser", func);
            System.out.println("Funcionario gravado"+ func);
        } catch (IOException e) {
            System.out.println("IOException");
            e.printStackTrace();
        }
    }
}
