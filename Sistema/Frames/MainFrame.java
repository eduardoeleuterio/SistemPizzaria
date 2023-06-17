package Sistema.Frames;

import Sistema.Frames.AdicionarPizzaFrame;
import Sistema.Frames.AlterarStatusFrame;
import Sistema.Frames.CriarPedidoFrame;

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
        setLayout(new GridBagLayout());

        // Create a panel for the buttons
        JPanel buttonPanel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets = new Insets(10, 10, 10, 10); // Add some spacing between buttons

        // Set the same size for all buttons
        Dimension buttonSize = new Dimension(200, 40);
        criarPedidoButton.setPreferredSize(buttonSize);
        alterarStatusButton.setPreferredSize(buttonSize);
        adicionarPizzaButton.setPreferredSize(buttonSize);
        salvarESairButton.setPreferredSize(buttonSize);

        buttonPanel.add(criarPedidoButton, gbc);

        gbc.gridx = 1;
        buttonPanel.add(alterarStatusButton, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        buttonPanel.add(adicionarPizzaButton, gbc);

        gbc.gridx = 1;
        buttonPanel.add(salvarESairButton, gbc);

        // Add the components to the frame
        GridBagConstraints frameGbc = new GridBagConstraints();
        frameGbc.gridx = 0;
        frameGbc.gridy = 0;
        frameGbc.anchor = GridBagConstraints.CENTER;
        frameGbc.insets = new Insets(10, 10, 10, 10); // Add some spacing around the components
        add(titleLabel, frameGbc);

        frameGbc.gridy = 1;
        add(buttonPanel, frameGbc);

        // Set the action listeners for the buttons
        criarPedidoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                CriarPedidoFrame criarPedidoFrame = new CriarPedidoFrame();
            }
        });

        alterarStatusButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                AlterarStatusFrame alterarStatusFrame = new AlterarStatusFrame();
            }
        });

        adicionarPizzaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                AdicionarPizzaFrame adicionarPizzaFrame = new AdicionarPizzaFrame();
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