/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *Clase que representa la configuración
 * @author Ioana
 */
public class Configuracion {
    private String lookAndFeel;
    private String detallesConcierto;
    
    /** * Constructor de la clase Configuracion.
     * @param lookAndFeel El look and feel de la interfaz.
     * @param detallesConcierto .
     */
    public Configuracion(String lookAndFeel, String detallesConcierto) {
        this.lookAndFeel = lookAndFeel;
        this.detallesConcierto = detallesConcierto; 
    }
    /**
     * Obtiene el look and feel de la interfaz. 
     * @return El look and feel de la interfaz. 
     */
    public String getLookAndFeel() {
        return lookAndFeel;
    }
    /** 
     * Establece el look and feel de la interfaz. 
     * @param lookAndFeel El look and feel de la interfaz.
     */
    public void setLookAndFeel(String lookAndFeel) {
        this.lookAndFeel = lookAndFeel;
    }
    /** * Obtiene los detalles del concierto. 
     * @return Los detalles del concierto. 
     */
    public String getDetallesConcierto() {
        return detallesConcierto; 
    }
    /** 
     * Establece los detalles del concierto. 
     * @param detallesConcierto Los detalles del concierto.
     */
    public void setDetallesConcierto(String detallesConcierto) {
        this.detallesConcierto = detallesConcierto; 
    }
}
