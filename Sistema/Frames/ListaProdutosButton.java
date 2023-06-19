package Sistema.Frames;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import Sistema.Controller.*;
import Sistema.Frames.ProdutoFrame;
import Sistema.Model.*;

public class ListaProdutosButton extends JFrame {
    private JList<Produto> produtosList;
    private DefaultListModel<Produto> produtosListModel;
    private ProdutoController produtoController;

    public ListaProdutosButton() {
        produtoController = new ProdutoController();

        setTitle("Lista de Produtos");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLayout(new BorderLayout());
        setResizable(false);

        JPanel contentPanel = new JPanel(new BorderLayout());
        contentPanel.setBorder(new EmptyBorder(10, 10, 10, 10));

        produtosListModel = new DefaultListModel<>();
        produtosList = new JList<>(produtosListModel);
        JScrollPane produtosScrollPane = new JScrollPane(produtosList);

        contentPanel.add(produtosScrollPane, BorderLayout.CENTER);

        JButton atualizarButton = new JButton("Atualizar");
        atualizarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                carregarProdutos();
            }
        });
        contentPanel.add(atualizarButton, BorderLayout.SOUTH);

        add(contentPanel, BorderLayout.CENTER);
    }

    private void carregarProdutos() {
        produtosListModel.clear();
        for (int codigo = 1; ; codigo++) {
            Produto produto = produtoController.lerProduto(codigo);
            if (produto == null) {
                break;
            }
            produtosListModel.addElement(produto);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                ProdutoFrame produtoFrame = new ProdutoFrame();
                produtoFrame.setVisible(true);
                produtoFrame.carregarProdutos();
            }
        });
    }
}
