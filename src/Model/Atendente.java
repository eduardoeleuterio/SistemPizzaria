package Model;

public class Atendente extends Funcionario implements Autenticavel{

    public Integer ramal;

    public Atendente(String cpf, String nome, String registro, String login, String senha, Integer ramal) {
        super(cpf, nome, registro, login, senha);
        this.ramal = ramal;
    }

    @Override
    public void exibir(){

        System.out.println("Nome" + nome);
        System.out.println("CPF" + cpf);
        System.out.println("Registro" + registro);
        System.out.println("Login" + login);
        System.out.println("Senha" + senha);
        System.out.println("Ramal" + ramal);

    }




    public void preparando(Pedido produto) {
        produto.status = 1;
    }


    public void feito(Pedido produto) {
        produto.status = 2;

    }

    public void enviado(Pedido produto) {
        produto.status = 3;
    }
}
