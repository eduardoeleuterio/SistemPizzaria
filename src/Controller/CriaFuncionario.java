package Controller;
import java.io.IOException;
import Model.Pessoa;
import Model.Funcionario;

public class CriaFuncionario {
    public static void main(String[] args){
        Funcionario funcionario = new Funcionario(cpf: "08511431993", nome: "Thomas", registro:"th123",login:"th123",senha:"th123");
        
        try {
            Serializador.gravar("Funcionario.ser", funcionario);
            System.out.println("Funcionario gravado"+ funcionario);
        } catch (IOException e) {
            System.out.println("IOException");
            e.printStackTrace();
        }
    }
    
}
