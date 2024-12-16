/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *Clase que representa a un usuario
 * @author Ioana
 */
public class Usuario {
    private String nombre;
    private String rol;
    
    /** * Constructor de la clase Usuario.
     * @param nombre del usuario.
     * @param rol del usuario. 
     */
    public Usuario(String nombre, String rol) {
        this.nombre = nombre; 
        this.rol = rol; 
    }
    /** * Obtiene el nombre del usuario.
     * @return  nombre del usuario.
     */
    public String getNombre() { 
        return nombre; 
    }
    /** * Obtiene el rol del usuario. 
     * @return  rol del usuario. 
     */
    public String getRol() { 
        return rol; 
    }
}
