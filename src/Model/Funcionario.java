package Model;

public class Funcionario extends Pessoa{

    public char[] registro;
    public String login;
    public char[] senha;

    // Construtor do Funcionario
    public Funcionario(String cpf, String nome, char[] registro,
                       String login, char[] senha) {
        super(cpf, nome);
        this.registro = registro;
        this.login = login;
        this.senha = senha;
    }
}
