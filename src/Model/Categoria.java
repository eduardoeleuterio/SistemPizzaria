package Model;
import java.io.Serializable;

public class Categoria implements Serializable{
    public String nome;

    public Categoria(String nome){
        this.nome = nome;
    }
    public void exibir(){
        System.out.println("Categoria" + nome);
    }
}
