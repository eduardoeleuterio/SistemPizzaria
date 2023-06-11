package Sistema.Model;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

public class Pedido implements Serializable {
    private static int proximoCodigo = 1;

    private int codigo;
    private Cliente cliente;
    private List<Produto> produtos;
    private Funcionario atendente;
    private Endereco endereco;
    private double valor;
    private int status;
    private LocalDateTime dataHora;

    public Pedido(Cliente cliente, List<Produto> produtos, Funcionario atendente, Endereco endereco, int status) {
        this.codigo = proximoCodigo++;
        this.cliente = cliente;
        this.produtos = produtos;
        this.atendente = atendente;
        this.endereco = endereco;
        this.status = status;
        this.dataHora = LocalDateTime.now();
        calcularValor();
    }

    private void calcularValor() {
        this.valor = 0;
        for (Produto produto : produtos) {
            this.valor += produto.getPreco();
        }
    }

    public int getCodigo() {
        return codigo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public Funcionario getAtendente() {
        return atendente;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public double getValor() {
        return valor;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }
}
