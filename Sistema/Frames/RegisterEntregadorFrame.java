package Sistema.Frames;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegisterEntregadorFrame extends JFrame {

    public RegisterEntregadorFrame() {
        super("Registrar Entregador"); // Set the title

        // Create the text fields
        JTextField cpfField = new JTextField(15);
        JTextField nomeField = new JTextField(15);
        JTextField loginField = new JTextField(15);
        JPasswordField senhaField = new JPasswordField(15);
        JTextField veiculoField = new JTextField(15);

        // Create the register button
        JButton registerButton = new JButton("Confirmar Registro");

        // Set the layout manager for the frame
        setLayout(new GridBagLayout());

        // Create constraints for centering components
        GridBagConstraints centerConstraints = new GridBagConstraints();
        centerConstraints.gridx = 0;
        centerConstraints.gridy = GridBagConstraints.RELATIVE;
        centerConstraints.insets = new Insets(5, 0, 5, 0);

        // Add the CPF field
        add(new JLabel("CPF:"), centerConstraints);
        add(cpfField, centerConstraints);

        // Add the Nome field
        add(new JLabel("Nome:"), centerConstraints);
        add(nomeField, centerConstraints);

        // Add the Login field
        add(new JLabel("Login:"), centerConstraints);
        add(loginField, centerConstraints);

        // Add the Senha field
        add(new JLabel("Senha:"), centerConstraints);
        add(senhaField, centerConstraints);

        // Add the veiculo field
        add(new JLabel("Veículo:"), centerConstraints);
        add(veiculoField, centerConstraints);

        // Add the register button
        add(registerButton, centerConstraints);

        // Set the action listener for the register button
        registerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String cpf = cpfField.getText();
                String nome = nomeField.getText();
                String login = loginField.getText();
                char[] senhaChars = senhaField.getPassword();
                String senha = new String(senhaChars);
                String veiculo = veiculoField.getText();

                // EXECUTAR VALIDAÇÃO E REGISTTRO AQUI
                /*






                 */

                // Clear the fields after registering
                cpfField.setText("");
                nomeField.setText("");
                loginField.setText("");
                senhaField.setText("");
                veiculoField.setText("");
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