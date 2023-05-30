package Model;

public abstract class Autenticavel  {


    public void preparando(Pedido produto)
    {
        produto.status = 1;
    }
    public void feito(Pedido produto)
    {
        produto.status = 2;
    }
    public void enviado(Pedido produto)
    {
        produto.status = 3;
    }


}
