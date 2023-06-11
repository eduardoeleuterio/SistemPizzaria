package Sistema.Model;

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

    public void setNumero(String novoNumero) {
    }

    public void setRua(String novaRua) {
    }

    public void setComplemento(String novoComplemento) {
    }

    public void setReferencia(String novaReferencia) {
    }

    public String getRua() {
        return null;
    }

    public String getNumero() {
        return null;
    }

    public String getComplemento() {
        return null;
    }

    public String getReferencia() {
        return null;
    }
}
