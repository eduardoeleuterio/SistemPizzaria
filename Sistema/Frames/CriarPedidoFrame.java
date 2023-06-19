package Sistema.Frames;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Sistema.Controller.*;
import Sistema.Frames.ListaProdutosButton;
import Sistema.Model.*;

public class CriarPedidoFrame extends JFrame {
    private JButton clientesButton;
    private JButton listaProdutosButton;
    private JTextField cpfTextField;
    private JTextField idProdutoTextField;
    private JButton confirmarButton;
    private JButton sairButton;

    private ClienteController clienteController;
    private ProdutoController produtoController;

    public CriarPedidoFrame() {
        super("Criar Pedido");

        clienteController = new ClienteController();
        produtoController = new ProdutoController();

        // Create components
        clientesButton = new JButton("Selecionar Cliente");
        listaProdutosButton = new JButton("Selecionar Produtos");
        cpfTextField = new JTextField(20);
        idProdutoTextField = new JTextField(20);
        confirmarButton = new JButton("Confirmar Pedido");
        sairButton = new JButton("Sair");

        // Set the layout manager
        setLayout(new GridBagLayout());

        // Create constraints for center alignment
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = GridBagConstraints.RELATIVE;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(10, 10, 10, 10);

        // Add components to the frame
        add(new JLabel("CPF:"), gbc);
        add(cpfTextField, gbc);
        add(clientesButton, gbc);
        add(new JLabel("ID Produto:"), gbc);
        add(idProdutoTextField, gbc);
        add(listaProdutosButton, gbc);
        add(confirmarButton, gbc);

        // Create constraints for the "Sair" button
        gbc.weighty = 1.0;
        gbc.anchor = GridBagConstraints.PAGE_END;
        add(sairButton, gbc);

        // Set the same size for input components
        Dimension inputSize = new Dimension(200, 30);
        cpfTextField.setPreferredSize(inputSize);
        idProdutoTextField.setPreferredSize(inputSize);

        // Set the action listener for the "Sair" button
        sairButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Close the current frame and show the main frame
                dispose();
                //MainFrame mainFrame = new MainFrame();
                //mainFrame.setVisible(true);
            }
        });

        listaProdutosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                ListaProdutosButton listaprodutos = new ListaProdutosButton();
            }
        });

        clientesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String cpf = cpfTextField.getText();
                Cliente cliente = clienteController.lerCliente(cpf);
                if (cliente != null) {
                    // Exibir informações do cliente ou realizar ação desejada
                    JOptionPane.showMessageDialog(CriarPedidoFrame.this, "Cliente selecionado: " + cliente.getNome());
                } else {
                    // Cliente não encontrado
                    JOptionPane.showMessageDialog(CriarPedidoFrame.this, "Cliente não encontrado");
                }
            }
        });

        confirmarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String cpf = cpfTextField.getText();
                int idProduto = Integer.parseInt(idProdutoTextField.getText());

                Cliente cliente = clienteController.lerCliente(cpf);
                Produto produto = produtoController.lerProduto(idProduto);

                if (cliente != null && produto != null) {
                    // Código para confirmar o pedido com o cliente e produto selecionados
                    JOptionPane.showMessageDialog(CriarPedidoFrame.this, "Pedido confirmado: Cliente = " + cliente.getNome() + ", Produto = " + produto.getNome());
                } else {
                    // Cliente ou produto não encontrado
                    JOptionPane.showMessageDialog(CriarPedidoFrame.this, "Cliente ou produto não encontrado");
                }
            }
        });

        // Set the frame properties
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
        setSize(600, 450);
        setVisible(true);
    }
}
