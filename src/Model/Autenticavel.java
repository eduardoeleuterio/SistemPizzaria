package Model;

public interface Autenticavel  {


    public default void preparando(Pedido produto)
    {
        produto.status = 1;
    }
    public default void feito(Pedido produto)
    {
        produto.status = 2;
    }
    public default void enviado(Pedido produto)
    {
        produto.status = 3;
    }


}
