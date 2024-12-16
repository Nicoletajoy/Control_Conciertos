/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Ioana
 */
public class Login extends JFrame {
    private JTextField txtUsuario; 
    private JPasswordField txtPassword;
    
    public Login() {
        setTitle("Login");
        setSize(300, 200); 
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        
        JPanel panel = new JPanel(new GridLayout(4, 3));
        panel.add(new JLabel("Usuario:")); 
        txtUsuario = new JTextField("Administrador");
        panel.add(txtUsuario); panel.add(new JLabel("Contraseña:"));
        txtPassword = new JPasswordField(); panel.add(txtPassword); 
        JButton btnLogin = new JButton("Login");
        btnLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (txtUsuario.getText().equals("Administrador") && new String(txtPassword.getPassword()).equals("admin")) {
                    dispose();
                    new Principal().setVisible(true); 
                } else {
                    JOptionPane.showMessageDialog(Login.this, "Usuario o contraseña incorrectos", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        panel.add(btnLogin);
        add(panel); 
    }
}

