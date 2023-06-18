package Sistema.Model;

import java.io.Serializable;

public class Endereco implements Serializable {
    private String rua;
    private String numero;
    private String complemento;
    private String referencia;

    public Endereco(String rua, String numero, String complemento, String referencia) {
        this.rua = rua;
        this.numero = numero;
        this.complemento = complemento;
        this.referencia = referencia;
    }

    public void setRua(String novaRua) {
        this.rua = novaRua;
    }

    public void setNumero(String novoNumero) {
        this.numero = novoNumero;
    }

    public void setComplemento(String novoComplemento) {
        this.complemento = novoComplemento;
    }

    public void setReferencia(String novaReferencia) {
        this.referencia = novaReferencia;
    }

    public String getRua() {
        return rua;
    }

    public String getNumero() {
        return numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public String getReferencia() {
        return referencia;
    }
}
