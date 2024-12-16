/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
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
  private JTextField txtLookAndFeel;
  private JTextField txtDetallesConcierto;

public ConfiguracionDialog(JFrame parent) {
  super(parent, "Configuración", true);
  setSize(400, 300); setLocationRelativeTo(parent); 
  JPanel panel = new JPanel(new GridLayout(3, 2));
  panel.add(new JLabel("Look and Feel:"));
  txtLookAndFeel = new JTextField();
  panel.add(txtLookAndFeel);
  panel.add(new JLabel("Detalles del Concierto:"));
  txtDetallesConcierto = new JTextField();
  panel.add(txtDetallesConcierto);
  JButton btnGuardar = new JButton("Guardar");
  btnGuardar.addActionListener(new ActionListener() {
    @Override
public void actionPerformed(ActionEvent e) {
      dispose(); 
}
});
  panel.add(btnGuardar);
  add(panel);
} 
}
