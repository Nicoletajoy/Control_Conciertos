/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import Modelo.Configuracion;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Ioana
 */
public class ConfiguracionDialog extends JDialog{
    private JTextField txtLookAndFeel; 
    private JTextField txtDetallesConcierto; 
    private Configuracion configuracion;
    
   public ConfiguracionDialog(JFrame parent, Configuracion configuracion) {
       super(parent, "Configuración", true);
       this.configuracion = configuracion;
       
       setSize(400, 300); 
       setLocationRelativeTo(parent);
        
        JPanel panel = new JPanel(new GridLayout(3, 2));
        panel.add(new JLabel("Look and Feel:"));
        txtLookAndFeel = new JTextField(configuracion.getLookAndFeel());
        panel.add(txtLookAndFeel);
        panel.add(new JLabel("Detalles del Concierto:")); 
        txtDetallesConcierto = new JTextField(configuracion.getDetallesConcierto()); 
        panel.add(txtDetallesConcierto);
        
        JButton btnGuardar = new JButton("Guardar");
        btnGuardar.addActionListener(new ActionListener() {
            @Override 
            public void actionPerformed(ActionEvent e) { 
                guardarConfiguracion(); 
            } 
        });
        panel.add(btnGuardar); 
        JButton btnCargar = new JButton("Cargar");
        btnCargar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) { 
                cargarConfiguracion();
            } 
        });
        panel.add(btnCargar);
        add(panel); 
   }
   private void guardarConfiguracion() { 
       configuracion.setLookAndFeel(txtLookAndFeel.getText()); 
       configuracion.setDetallesConcierto(txtDetallesConcierto.getText());
       try 
           (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("configuracion.dat"))) {
           oos.writeObject(configuracion); 
           JOptionPane.showMessageDialog(this, "Configuración guardada correctamente.");
       } catch (IOException e) { 
           JOptionPane.showMessageDialog(this, "Error al guardar la configuración: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
       }
   }
   private void cargarConfiguracion() { 
       try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("configuracion.dat"))) { 
           Configuracion configCargada = (Configuracion) ois.readObject(); txtLookAndFeel.setText(configCargada.getLookAndFeel()); 
           txtDetallesConcierto.setText(configCargada.getDetallesConcierto()); 
           JOptionPane.showMessageDialog(this, "Configuración cargada correctamente."); 
       } catch (IOException | ClassNotFoundException e) { 
           JOptionPane.showMessageDialog(this, "Error al cargar la configuración: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
       } 
   }
    }

