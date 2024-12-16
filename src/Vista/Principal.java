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
import javax.swing.JOptionPane;



/**
 *Clase Principal que representa la ventana principal
 * @author Ioana
 */
public class Principal extends JFrame { 
    
    /** 
     * Constructor de la clase Principal.
     * Configura la ventana principal y añade los elementos del menú. 
     */
    
    public Principal() {
        // Establece el título de la ventana 
        setTitle("Principal");
   // Establece el tamaño de la ventana 
        setSize(600, 400);
// Centra la ventana en la pantalla 
       setLocationRelativeTo(null);
// Configura la operación de cierre 
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

// Crea la barra de menú 
      JMenuBar menuBar = new JMenuBar();
// Crea el menú "Archivo" 
      JMenu menuArchivo = new JMenu("Archivo");
// Crea el ítem de menú "Ajustes" 
      JMenuItem itemAjustes = new JMenuItem("Ajustes");
     itemAjustes.addActionListener(new ActionListener() {
@Override
    public void actionPerformed(ActionEvent e) {
         new ConfiguracionDialog(Principal.this).setVisible(true); 
} 
});
// Añade el ítem "Ajustes" al menú "Archivo"
      menuArchivo.add(itemAjustes);
// Añade el menú "Archivo" a la barra de menú 
      menuBar.add(menuArchivo);
// Crea el menú "Editar" 
     JMenu menuEditar = new JMenu("Editar"); 
// Crea el ítem de menú "Copiar" 
     JMenuItem itemCopiar = new JMenuItem("Copiar");
     itemCopiar.addActionListener(new ActionListener() { 
@Override
   public void actionPerformed(ActionEvent e) {
     System.out.println("Copiar seleccionado");
}
}); 
// Crea el ítem de menú "Pegar" 
     JMenuItem itemPegar = new JMenuItem("Pegar"); 
    itemPegar.addActionListener(new ActionListener() {
@Override
     public void actionPerformed(ActionEvent e) {
     System.out.println("Pegar seleccionado");
}
});
// Añade los ítems "Copiar" y "Pegar" al menú "Editar" 
    menuEditar.add(itemCopiar);
    menuEditar.add(itemPegar); 
// Añade el menú "Editar" a la barra de menú 
    menuBar.add(menuEditar); 
// Crea el menú "Ayuda" 
    JMenu menuAyuda = new JMenu("Ayuda");
// Crea el ítem de menú "Acerca de" 
      JMenuItem itemAcercaDe = new JMenuItem("Acerca de");
      itemAcercaDe.addActionListener(new ActionListener() {
@Override 
      public void actionPerformed(ActionEvent e) {
     JOptionPane.showMessageDialog(Principal.this, "Control de Conciertos por Ioana", "Acerca de", JOptionPane.INFORMATION_MESSAGE); 
} 
});
// Añade el ítem "Acerca de" al menú "Ayuda"
    menuAyuda.add(itemAcercaDe); 
// Añade el menú "Ayuda" a la barra de menú
    menuBar.add(menuAyuda); 
// Establece la barra de menú en la ventana principal 
    setJMenuBar(menuBar); 
} 
}
    

