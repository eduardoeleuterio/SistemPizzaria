package Sistema.Frames;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import Sistema.Controller.*;
import Sistema.Model.*;

public class AdicionarPizzaFrame extends JFrame {
    private List<Ingrediente> ingredientes;
    private JTextField txtNomePizza;
    private JTextField txtCodigoProduto;
    private JTextField txtNomeProduto;
    private JTextField txtPrecoProduto;
    private DefaultListModel<Ingrediente> ingredientListModel;
    private JList<Ingrediente> ingredientList;

    public AdicionarPizzaFrame(List<Ingrediente> ingredientes) {
        this.ingredientes = ingredientes;

        setTitle("Adicionar Pizza");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(new GridLayout(3, 1));

        JPanel panelPizza = new JPanel(new GridLayout(2, 2));
        JLabel lblNomePizza = new JLabel("Nome da Pizza:");
        txtNomePizza = new JTextField();
        panelPizza.add(lblNomePizza);
        panelPizza.add(txtNomePizza);

        JPanel panelIngredientes = new JPanel(new BorderLayout());
        JLabel lblIngredientes = new JLabel("Ingredientes:");
        ingredientListModel = new DefaultListModel<>();
        ingredientList = new JList<>(ingredientListModel);
        JScrollPane ingredientScrollPane = new JScrollPane(ingredientList);
        panelIngredientes.add(lblIngredientes, BorderLayout.NORTH);
        panelIngredientes.add(ingredientScrollPane, BorderLayout.CENTER);

        JPanel panelProduto = new JPanel(new GridLayout(3, 2));
        JLabel lblCodigoProduto = new JLabel("Código do Produto:");
        txtCodigoProduto = new JTextField();
        JLabel lblNomeProduto = new JLabel("Nome do Produto:");
        txtNomeProduto = new JTextField();
        JLabel lblPrecoProduto = new JLabel("Preço do Produto:");
        txtPrecoProduto = new JTextField();
        panelProduto.add(lblCodigoProduto);
        panelProduto.add(txtCodigoProduto);
        panelProduto.add(lblNomeProduto);
        panelProduto.add(txtNomeProduto);
        panelProduto.add(lblPrecoProduto);
        panelProduto.add(txtPrecoProduto);

        JButton btnAdicionar = new JButton("Adicionar");
        btnAdicionar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nomePizza = txtNomePizza.getText();
                int codigoProduto = Integer.parseInt(txtCodigoProduto.getText());
                String nomeProduto = txtNomeProduto.getText();
                double precoProduto = Double.parseDouble(txtPrecoProduto.getText());

                List<Ingrediente> ingredientesSelecionados = ingredientList.getSelectedValuesList();

                Produto produto = new Produto(codigoProduto, nomeProduto, precoProduto, ingredientesSelecionados);
                // Adicione o produto à lista de produtos

                JOptionPane.showMessageDialog(null, "Pizza e Produto adicionados com sucesso!");

                // Limpe os campos de entrada
                txtNomePizza.setText("");
                txtCodigoProduto.setText("");
                txtNomeProduto.setText("");
                txtPrecoProduto.setText("");
                ingredientList.clearSelection();
            }
        });

        add(panelPizza);
        add(panelIngredientes);
        add(panelProduto);
        add(btnAdicionar);
    }
    
}

