/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


/**
 *
 * @author Ioana
 */
public class ConfiguracionDialog extends JDialog { 
 private JComboBox<String> colorComboBox;
 private JTextField txtLookAndFeel;
 private JTextField txtDetallesConcierto;

public ConfiguracionDialog(JFrame parent) {
    super(parent, "Configuración", true);
    setSize(400, 300); 
    setLocationRelativeTo(parent);
    
    JPanel panel = new JPanel(new GridLayout(5, 3));
    panel.add(new JLabel("Look and Feel:"));
    txtLookAndFeel = new JTextField();
    panel.add(txtLookAndFeel);
    panel.add(new JLabel("Detalles del Concierto:"));
    txtDetallesConcierto = new JTextField();
    panel.add(txtDetallesConcierto);
    panel.add(new JLabel("Color de Fondo:")); 
    colorComboBox = new JComboBox<>(new String[]{"Blanco", "Rojo", "Verde", "Azul"}); 
    panel.add(colorComboBox); 
    JButton btnGuardar = new JButton("Guardar");
    btnGuardar.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            String colorSeleccionado = (String) colorComboBox.getSelectedItem();
            cambiarColorFondo(parent, colorSeleccionado);
            dispose();
        }
    });
    panel.add(btnGuardar);
    add(panel);
    
} /** * Cambia el color de fondo de la ventana principal. 
 * * @param parent la ventana principal.
 * @param color el color seleccionado. */ 
private void cambiarColorFondo(JFrame parent, String color) {
    switch (color) {
    case "Blanco": parent.getContentPane().setBackground(Color.WHITE);
    break; 
    case "Rojo": parent.getContentPane().setBackground(Color.RED);
    break;
    case "Verde": parent.getContentPane().setBackground(Color.GREEN);
    break;
    case "Azul": parent.getContentPane().setBackground(Color.BLUE);
    break; 
    }
} 
}