/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package control_conciertos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

/**
 *
 * @author Nicoleta
 */
public class Control_Concierto extends javax.swing.JFrame {

    /**
     * Vista del proyecto
     */
    public Control_Concierto() {
        initComponents();
        
         manejadorVentana Co = new manejadorVentana();
         manejadorComponentes Con = new manejadorComponentes();
         this.addComponentListener (Con);
         this.addWindowListener(Co);
        
         manejadorClicks CClick = new manejadorClicks();
         btnAceptar.addActionListener(CClick);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jLabel1 = new javax.swing.JLabel();
        btnAceptar = new javax.swing.JButton();

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe Script", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 255));
        jLabel1.setText("*Control_Concierto*");
        jLabel1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 102, 102)));

        btnAceptar.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        btnAceptar.setText("Aceptar");
        btnAceptar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(79, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(70, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(93, 93, 93))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLayeredPane jLayeredPane1;
    // End of variables declaration//GEN-END:variables
}
class manejadorClicks  implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(e.getActionCommand()); 
        System.out.println("Se ha pulsado el boton ");
    }
    
}
class manejadorComponentes implements ComponentListener{

    @Override
    public void componentResized(ComponentEvent e) {
        System.out.println("Cambia tamaño");
    }

   
    @Override
    public void componentMoved(ComponentEvent e) {
        System.out.println("Se ha movido");
    }


    @Override
    public void componentShown(ComponentEvent e) {
        System.out.println("Se muestra los componentes");
    }

    @Override
    public void componentHidden(ComponentEvent e) {
        System.out.println("Se ha ocultado");
    }
    
}
class manejadorVentana implements WindowListener{

    @Override
    public void windowOpened(WindowEvent e) {
        System.out.println("Se abre la ventana");
    }

    @Override
    public void windowClosing(WindowEvent e) {
        System.out.println("Cerrando la ventana");
    }

    @Override
    public void windowClosed(WindowEvent e) {
        System.out.println("Cerrado");
    }

    @Override
    public void windowIconified(WindowEvent e) {
        System.out.println("Se ha iconizando");
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
       System.out.println("Se ha deziconizando");
    }

    @Override
    public void windowActivated(WindowEvent e) {
        System.out.println("Se activa la ventana");
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        System.out.println("Se ha desactivado la ventana");
    }

}