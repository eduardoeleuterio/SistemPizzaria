import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import Sistema.Controller.*;
import Sistema.Model.*;

public class AdicionarPizzaFrame extends JFrame {
    private JTextField codigoTextField;
    private JTextField nomeTextField;
    private JTextField precoTextField;
    private JButton adicionarButton;
    private DefaultListModel<Ingrediente> ingredientesListModel;
    private JList<Ingrediente> ingredientesList;
    private JButton adicionarIngredienteButton;

    private ProdutoController produtoController;

    public AdicionarPizzaFrame() {
        produtoController = new ProdutoController();

        setTitle("Adicionar Pizza");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLayout(new BorderLayout());

        JPanel formPanel = new JPanel(new GridLayout(0, 2));

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

        JLabel ingredientesLabel = new JLabel("Ingredientes:");
        ingredientesListModel = new DefaultListModel<>();
        ingredientesList = new JList<>(ingredientesListModel);
        JScrollPane ingredientesScrollPane = new JScrollPane(ingredientesList);
        formPanel.add(ingredientesLabel);
        formPanel.add(ingredientesScrollPane);

        adicionarIngredienteButton = new JButton("Adicionar Ingrediente");
        adicionarIngredienteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                adicionarIngrediente();
            }
        });
        formPanel.add(adicionarIngredienteButton);

        add(formPanel, BorderLayout.CENTER);

        adicionarButton = new JButton("Adicionar");
        adicionarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                adicionarPizza();
            }
        });
        add(adicionarButton, BorderLayout.SOUTH);
    }

    private void adicionarIngrediente() {
        String nomeIngrediente = JOptionPane.showInputDialog(this, "Digite o nome do ingrediente:");
        if (nomeIngrediente != null && !nomeIngrediente.isEmpty()) {
            Ingrediente ingrediente = new Ingrediente(nomeIngrediente);
            ingredientesListModel.addElement(ingrediente);
        }
    }

    private void adicionarPizza() {
        int codigo = Integer.parseInt(codigoTextField.getText());
        String nome = nomeTextField.getText();
        double preco = Double.parseDouble(precoTextField.getText());
        List<Ingrediente> ingredientes = new ArrayList<>();
        for (int i = 0; i < ingredientesListModel.size(); i++) {
            ingredientes.add(ingredientesListModel.getElementAt(i));
        }

        produtoController.criarProduto(codigo, nome, preco, ingredientes);

        JOptionPane.showMessageDialog(this, "Pizza adicionada com sucesso!");

        // Limpar campos e lista de ingredientes
        codigoTextField.setText("");
        nomeTextField.setText("");
        precoTextField.setText("");
        ingredientesListModel.clear();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                AdicionarPizzaFrame pizzaFrame = new AdicionarPizzaFrame();
                pizzaFrame.setVisible(true);
            }
        });
    }
}
