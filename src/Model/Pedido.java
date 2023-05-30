package Model;

import java.util.Date;
import java.util.List;

public class Pedido {
    public Cliente cliente;
    public List<ProdutoPedido> produtos;
    public Funcionario atendente;
    public Endereco endereco;
    public boolean entrega;
    public double desconto;
    public double taxa_entrega;
    public double valor;
    public int forma_pagamento;
    public double troco;
    public Date date;
    public Date hora;
    public int status;

    // Construtor da classe Pedido
    public Pedido(Cliente cliente, List<ProdutoPedido> produtos, Funcionario atendente,
                  Endereco endereco, boolean entrega, double desconto, double taxa_entrega,
                  double valor, int forma_pagamento, double troco, Date date, Date hora, int status) {
        this.cliente = cliente;
        this.produtos = produtos;
        this.atendente = atendente;
        this.endereco = endereco;
        this.entrega = entrega;
        this.desconto = desconto;
        this.taxa_entrega = taxa_entrega;
        this.valor = valor;
        this.forma_pagamento = forma_pagamento;
        this.troco = troco;
        this.date = date;
        this.hora = hora;
        this.status = status;
    }
}
