package Model;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Pedido implements Serializable {
    public Cliente cliente;
    public List<Produto> produtos;
    public Funcionario atendente;
    public Endereco endereco;
    public double valor;
    public int status;

    Calendar calendar = Calendar.getInstance();
    Date date = calendar.getTime();

    public Pedido(Cliente cliente, List<Produto> produtos, Funcionario atendente,
                  Endereco endereco,
                  double valor,  Date date,  int status) {
        this.cliente = cliente;
        this.produtos = produtos;
        this.atendente = atendente;
        this.endereco = endereco;
        this.valor = valor;
        this.date = date;
        this.status = status;
    }

    public void exibir() {
        cliente.exibir();
        for (Produto produto : produtos) {
            System.out.println("- " + produto);
        }
        atendente.exibir();
        endereco.exibir();
        System.out.println(valor);

        System.out.println(date);
        System.out.println(status);
    }
}
