/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Ioana
 */
public class Configuracion {
    private String lookAndFeel;
    private String detallesConcierto;
    
    public Configuracion(String lookAndFeel, String detallesConcierto) {
        this.lookAndFeel = lookAndFeel;
        this.detallesConcierto = detallesConcierto; 
    }
    public String getLookAndFeel() {
        return lookAndFeel;
    }
    public void setLookAndFeel(String lookAndFeel) {
        this.lookAndFeel = lookAndFeel;
    }
    public String getDetallesConcierto() {
        return detallesConcierto; 
    }
    public void setDetallesConcierto(String detallesConcierto) {
        this.detallesConcierto = detallesConcierto; 
    }
}
