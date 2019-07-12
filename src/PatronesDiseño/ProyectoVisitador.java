/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatronesDiseño;

import javax.swing.JTextField;

/**
 *
 * @author Daniela Chaux
 */
public interface ProyectoVisitador {
    void cambiarTarjeta(String tarjeta);
    void agregarTarea(String nombre, String descripcion);
    void agregarUsuario(String nombre, Long id);
}
