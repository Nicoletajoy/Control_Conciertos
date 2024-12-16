/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;



/**
 *
 * @author Ioana
 */
public class Principal extends JFrame {
    
    public Principal() {
        setTitle("Principal"); 
        setSize(600, 400); 
        setLocationRelativeTo(null); 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JMenuBar menuBar = new JMenuBar(); 
        JMenu menuArchivo = new JMenu("Archivo"); 
        JMenuItem itemAjustes = new JMenuItem("Ajustes"); 
        itemAjustes.addActionListener(new ActionListener() {
            @Override 
            public void actionPerformed(ActionEvent e) {
                new ConfiguracionDialog(Principal.this).setVisible(true);
            } 
        });
        menuArchivo.add(itemAjustes); 
        menuBar.add(menuArchivo);
        setJMenuBar(menuBar);
    } 
}
    

