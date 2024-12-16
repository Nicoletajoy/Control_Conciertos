/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Modelo.Configuracion;
import Modelo.Usuario;
import Vista.Login;
import Vista.Principal;

/**
 *
 * @author Ioana
 */
public class Controlador { 
    private Usuario usuario; 
    private Configuracion configuracion;
    public Controlador() {
        this.configuracion = new Configuracion("Default", "Detalles del concierto"); 
    }
    public void iniciar() { 
        new Login().setVisible(true);
    }
    public void login(String nombre, String rol) {
        this.usuario = new Usuario(nombre, rol);
        new Principal().setVisible(true);
    }
    public Configuracion getConfiguracion() { 
        return configuracion; 
    }
    public void setConfiguracion(Configuracion configuracion) {
        this.configuracion = configuracion;
    }
}

