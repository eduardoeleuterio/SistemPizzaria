package Sistema.Frames;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {

    public MainFrame() {
        super(); // No need to specify the title in the constructor

        // Create the title label
        JLabel titleLabel = new JLabel("Sistema Pizzaria");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 24));

        // Create the buttons
        JButton criarPedidoButton = new JButton("Criar pedido");
        JButton alterarStatusButton = new JButton("Alterar Status do Pedido");
        JButton adicionarPizzaButton = new JButton("Adicionar Pizza");
        JButton salvarESairButton = new JButton("Salvar e Sair");

        // Set the layout manager for the frame
        setLayout(new BorderLayout());

        // Create a panel for the buttons
        JPanel buttonPanel = new JPanel(new FlowLayout());
        buttonPanel.add(criarPedidoButton);
        buttonPanel.add(alterarStatusButton);
        buttonPanel.add(adicionarPizzaButton);
        buttonPanel.add(salvarESairButton);

        // Add the components to the frame
        add(titleLabel, BorderLayout.NORTH);
        add(buttonPanel, BorderLayout.CENTER);

        // Set the action listeners for the buttons
        criarPedidoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Implement the action for "Criar pedido" button here
            }
        });

        alterarStatusButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Implement the action for "Alterar Status do Pedido" button here
            }
        });

        adicionarPizzaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Implement the action for "Adicionar Pizza" button here
            }
        });

        salvarESairButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Exit the program when "Salvar e Sair" button is clicked
                System.exit(0);
            }
        });

        // Set the frame properties
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack(); // Adjust the frame size based on the components
        setLocationRelativeTo(null); // Center the frame on the screen
        setSize(600, 450);
        setVisible(true);
    }
}