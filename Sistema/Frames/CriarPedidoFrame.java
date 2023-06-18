package Sistema.Frames;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CriarPedidoFrame extends JFrame {
    private JButton clientesButton;
    private JButton listaProdutosButton;
    private JTextField enderecoTextField;
    private JButton confirmarButton;
    private JButton sairButton;

    public CriarPedidoFrame() {
        super("Criar Pedido");

        // Create components
        clientesButton = new JButton("Selecionar Cliente");
        listaProdutosButton = new JButton("Selecionar Produtos");
        enderecoTextField = new JTextField(20);
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
        add(clientesButton, gbc);
        add(listaProdutosButton, gbc);
        add(new JLabel("Endereço:"), gbc);
        add(enderecoTextField, gbc);
        add(confirmarButton, gbc);

        // Create constraints for the "Sair" button
        gbc.weighty = 1.0;
        gbc.anchor = GridBagConstraints.PAGE_END;
        add(sairButton, gbc);

        // Set the same size for input components
        Dimension inputSize = new Dimension(200, 30);
        enderecoTextField.setPreferredSize(inputSize);

        // Set the action listener for the "Sair" button
        sairButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Close the current frame and show the main frame
                dispose();
                MainFrame mainFrame = new MainFrame();
                mainFrame.setVisible(true);
            }
        });

        listaProdutosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                ListaProdutosButton listaprodutos = new ListaProdutosButton();
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