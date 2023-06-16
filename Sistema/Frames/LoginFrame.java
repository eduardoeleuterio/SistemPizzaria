package Sistema.Frames;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginFrame extends JFrame {

    public LoginFrame() {
        super("Login"); // Set the title

        // Create the login and password fields
        JTextField loginField = new JTextField(15);
        JPasswordField passwordField = new JPasswordField(15);

        // Create buttons
        JButton confirmButton = new JButton("Confirmar");
        JButton registerButton = new JButton("Registrar");
        JButton sairButton = new JButton("Sair");

        // Set the layout manager for the frame
        setLayout(new GridBagLayout());

        // Create constraints for centering components
        GridBagConstraints centerConstraints = new GridBagConstraints();
        centerConstraints.gridx = 0;
        centerConstraints.gridy = GridBagConstraints.RELATIVE;
        centerConstraints.insets = new Insets(5, 0, 5, 0);

        // Add the login field
        add(new JLabel("Login:"), centerConstraints);
        add(loginField, centerConstraints);

        // Add the password field
        add(new JLabel("Password:"), centerConstraints);
        add(passwordField, centerConstraints);

        // Add the confirm button
        add(confirmButton, centerConstraints);
        add(registerButton, centerConstraints);
        add(sairButton, centerConstraints);

        // Set the action listener for the confirm button
        confirmButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String login = loginField.getText();
                char[] passwordChars = passwordField.getPassword();
                String password = new String(passwordChars);

                // AQUI VALIDA O QUE FOI INSERIDO NO LOGIN E SENHA
                /*







                 */

                // Clear the fields after confirming
                loginField.setText("");
                passwordField.setText("");
            }
        });

        registerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();

                SwingUtilities.invokeLater(new Runnable() {
                    public void run() {
                        JFrame registerFrame = new OpcoesRegistroFrame();
                        registerFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                        registerFrame.setLocationRelativeTo(null); // Center the frame on the screen
                        registerFrame.setVisible(true);
                    }
                });
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