/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatronesDiseño;

/**
 *
 * @author Daniela Chaux
 */
public interface TrabajadorVisitador {
    void cambiarTarjeta(String tarjeta);
    boolean inicioSesion(Long id);
}
