/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.Timer;



/**
 *
 * @author Ioana
 */
public class Presentacion extends JFrame {
    
    public Presentacion() {
        setTitle("Presentación");
        setSize(400, 300); 
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setUndecorated(true); 
        JLabel label = new JLabel("Cargando...", SwingConstants.CENTER);
        label.setFont(new Font("Arial", Font.BOLD, 24)); add(label);
        Timer timer = new Timer(3000, e -> { 
            dispose();
            new Login().setVisible(true); 
        });
        timer.setRepeats(false);
        timer.start();
    }
}
