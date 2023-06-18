import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Sistema.Controller.*;
import Sistema.Model.*;


public class ProdutoFrame extends JFrame {
    private JTextField codigoTextField;
    private JTextField nomeTextField;
    private JTextField precoTextField;
    private JButton adicionarButton;

    private ProdutoController produtoController;

    public ProdutoFrame() {
        produtoController = new ProdutoController();

        setTitle("Adicionar Produto");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 200);
        setLayout(new BorderLayout());

        JPanel formPanel = new JPanel(new GridLayout(3, 2));

        JLabel codigoLabel = new JLabel("Código:");
        codigoTextField = new JTextField();
        formPanel.add(codigoLabel);
        formPanel.add(codigoTextField);

        JLabel nomeLabel = new JLabel("Nome:");
        nomeTextField = new JTextField();
        formPanel.add(nomeLabel);
        formPanel.add(nomeTextField);

        JLabel precoLabel = new JLabel("Preço:");
        precoTextField = new JTextField();
        formPanel.add(precoLabel);
        formPanel.add(precoTextField);

        add(formPanel, BorderLayout.CENTER);

        adicionarButton = new JButton("Adicionar");
        adicionarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                adicionarProduto();
            }
        });
        add(adicionarButton, BorderLayout.SOUTH);
    }

    private void adicionarProduto() {
        int codigo = Integer.parseInt(codigoTextField.getText());
        String nome = nomeTextField.getText();
        double preco = Double.parseDouble(precoTextField.getText());

        produtoController.criarProduto(codigo, nome, preco);

        JOptionPane.showMessageDialog(this, "Produto adicionado com sucesso!");

        // Limpar campos
        codigoTextField.setText("");
        nomeTextField.setText("");
        precoTextField.setText("");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                ProdutoFrame produtoFrame = new ProdutoFrame();
                produtoFrame.setVisible(true);
            }
        });
    }

    public void carregarProdutos() {
    }
}
