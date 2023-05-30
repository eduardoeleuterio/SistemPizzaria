package Model;
import java.io.Serializable;

public class Ingrediente implements Serializable{
    public String nome;

    public Ingrediente(String nome){
        this.nome = nome;
    }
    public void exibir(){
        System.out.println("Ingrediente" + nome);
    }
}