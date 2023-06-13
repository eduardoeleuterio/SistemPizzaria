package Sistema.Frames;

import Sistema.Frames.LoginFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OpcoesRegistroFrame extends JFrame {

    public OpcoesRegistroFrame() {
        super("Opções de Registro"); // Set the title

        // Create the buttons
        JButton registrarAtendenteButton = new JButton("Registrar Atendente");
        JButton registrarEntregadorButton = new JButton("Registrar Entregador");
        JButton registrarGerenteButton = new JButton("Registrar Gerente");
        JButton voltarButton = new JButton("Voltar");

        // Set the layout manager for the frame
        setLayout(new GridBagLayout());

        // Create constraints for centering components
        GridBagConstraints centerConstraints = new GridBagConstraints();
        centerConstraints.gridx = 0;
        centerConstraints.gridy = GridBagConstraints.RELATIVE;
        centerConstraints.insets = new Insets(5, 0, 5, 0);

        // Add the buttons
        add(registrarAtendenteButton, centerConstraints);
        add(registrarEntregadorButton, centerConstraints);
        add(registrarGerenteButton, centerConstraints);
        add(voltarButton, centerConstraints);

        // Set the action listeners for the buttons
        registrarAtendenteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();f
                SwingUtilities.invokeLater(new Runnable() {
                    public void run() {
                        new RegisterAtendenteFrame();
                    }
                });
            }
        });

        registrarEntregadorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                SwingUtilities.invokeLater(new Runnable() {
                    public void run() {
                        new RegisterEntregadorFrame();
                    }
                });
            }
        });

        registrarGerenteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                SwingUtilities.invokeLater(new Runnable() {
                    public void run() {
                        new RegisterGerenteFrame();
                    }
                });
            }
        });

        voltarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose(); // Close the current frame
                SwingUtilities.invokeLater(new Runnable() {
                    public void run() {
                        new LoginFrame();
                    }
                });
            }
        });

        // Set the frame properties
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        pack(); // Adjust the frame size based on the components
        setLocationRelativeTo(null); // Center the frame on the screen
        setSize(600, 450);
        setVisible(true);
    }
}