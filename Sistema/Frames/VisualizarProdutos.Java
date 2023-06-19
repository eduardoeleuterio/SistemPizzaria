package Sistema.Frames;

import javax.swing.*;
import java.awt.*;
import Sistema.Model.Produto;

import java.util.ArrayList;
import java.util.List;

public class VisualizarProdutos extends JFrame {
    private JList<Produto> listaProdutos;
    private DefaultListModel<Produto> listModel;

    public VisualizarProdutos(List<Produto> produtos) {
        setTitle("Produtos Registrados");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);

        listModel = new DefaultListModel<>();
        for (Produto produto : produtos) {
            listModel.addElement(produto);
        }

        listaProdutos = new JList<>(listModel);

        JScrollPane scrollPane = new JScrollPane(listaProdutos);
        getContentPane().add(scrollPane, BorderLayout.CENTER);
    }

    public void atualizarListaProdutos(List<Produto> produtos) {
        listModel.clear();
        for (Produto produto : produtos) {
            listModel.addElement(produto);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            List<Produto> produtos = new ArrayList<>(); // Adicione os produtos aqui

            VisualizarProdutos produtoView = new VisualizarProdutos(produtos);
            produtoView.setVisible(true);
        });
    }
}
