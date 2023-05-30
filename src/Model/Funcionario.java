package Model;

public class Funcionario extends Pessoa{

    public int registro;
    public String login;
    public char[] senha;

    // Construtor do Funcionario
    public Funcionario(double cpf, String nome, int registro,
                       String login, char[] senha) {
        super(cpf, nome);
        this.registro = registro;
        this.login = login;
        this.senha = senha;
    }
}
