package Model;
import java.io.Serializable;

public class Endereco implements Serializable{
    public String rua;
    public String numero;
    public String complemento;
    public String referencia;

    public Endereco(String rua, String numero, String complemento, String referencia){
        this.rua = rua;
        this.numero= numero;
        this.complemento = complemento;
        this.referencia = referencia;
    }

    public void exibir(){
        System.out.println("Endereço:" + rua + numero);
        System.out.println("Complemento:"+ complemento + referencia);
    }
}
