package Sistema.Controller;

import Sistema.Model.Cliente;
import Sistema.Model.Endereco;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ClienteController {
    private static final String ARQUIVO_CLIENTES = "Sistema/DataBase/clientes.dat";
    private List<Cliente> clientes;

    public ClienteController() {
        clientes = new ArrayList<>();
        carregarClientes();
    }

    public void criarCliente(String cpf, String nome, String rua, String numero, String complemento, String referencia, String telefone) {
        Endereco endereco = new Endereco(rua, numero, complemento, referencia);
        Cliente cliente = new Cliente(cpf, nome, endereco, telefone);
        clientes.add(cliente);
        salvarClientes();
    }

    public Cliente lerCliente(String cpf) {
        for (Cliente cliente : clientes) {
            if (cliente.getCpf().equals(cpf)) {
                return cliente;
            }
        }
        return null; // Cliente não encontrado.
    }

    public void atualizarCliente(String cpf, String novoNome, String novaRua, String novoNumero, String novoComplemento, String novaReferencia, String novoTelefone) {
        Cliente cliente = lerCliente(cpf);
        if (cliente != null) {
            cliente.setNome(novoNome);
            cliente.getEndereco().setRua(novaRua);
            cliente.getEndereco().setNumero(novoNumero);
            cliente.getEndereco().setComplemento(novoComplemento);
            cliente.getEndereco().setReferencia(novaReferencia);
            cliente.setTelefone(novoTelefone);
            salvarClientes();
        }
    }

    public void deletarCliente(String cpf) {
        Cliente cliente = lerCliente(cpf);
        if (cliente != null) {
            clientes.remove(cliente);
            salvarClientes();
        }
    }

    private void carregarClientes() {
        try {
            Object objeto = Serializador.ler(ARQUIVO_CLIENTES);
            if (objeto instanceof List<?>) {
                clientes = (List<Cliente>) objeto;
            }
        } catch (IOException | ClassNotFoundException e) {
            // Tratar exceção adequadamente.
            e.printStackTrace();
        }
    }

    private void salvarClientes() {
        try {
            Serializador.gravar(ARQUIVO_CLIENTES, clientes);
        } catch (IOException e) {
            // Tratar exceção adequadamente
            e.printStackTrace();
        }
    }
}
