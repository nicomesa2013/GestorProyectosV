/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.EmpresaControlador;
import Modelo.*;
import PatronesDiseño.PrincipalVisitador;
import PatronesDiseño.TrabajadorVisitador;
import java.awt.CardLayout;
import java.util.List;

/**
 *
 * @author Daniela Chaux
 */
public class PnlTrabajadorPrincipal extends javax.swing.JPanel implements TrabajadorVisitador{
    private List<Usuario> usuarios;
    /**
     * Creates new form PnlInicioTrabajador
     */
    public PnlTrabajadorPrincipal() {
        initComponents();
        pnlInicioTrabajador1.setVisitador(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        PnlCartas = new javax.swing.JPanel();
        pnlInicioTrabajador1 = new Vista.PnlInicioTrabajador();
        pnlTrabajador1 = new Vista.Trabajador();

        setLayout(new java.awt.BorderLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Usuario Trabajador");
        add(jLabel3, java.awt.BorderLayout.PAGE_START);

        PnlCartas.setLayout(new java.awt.CardLayout());
        PnlCartas.add(pnlInicioTrabajador1, "Inicio");
        PnlCartas.add(pnlTrabajador1, "Trabajador");

        add(PnlCartas, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    public void setVisitador(PrincipalVisitador visitador) {
        this.visitador = visitador;
    }
    
    public void cambiarTarjeta(String tarjeta){
        ((CardLayout) PnlCartas.getLayout()).show(PnlCartas, tarjeta);
    }
    
    public void cambiarTarjetaAbuelo(String tarjeta){
        visitador.cambiarTarjeta(tarjeta);
    }
    public void iniciarFormulario(){
        pnlInicioTrabajador1.setVisitador(this);
    }
    public boolean inicioSesion(Long id){
        boolean bandera = false;
        System.out.println("Entrooooo");
        usuarios = EmpresaControlador.getInstance().getUsuarios();
        for (int i = 0; i < usuarios.size(); i++) {
            if(usuarios.get(i).getId().equals(id)){
                bandera = true;
                pnlTrabajador1.iniciarFormulario(usuarios.get(i));
                break;
            }
        }
        return bandera;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PnlCartas;
    private javax.swing.JLabel jLabel3;
    private Vista.PnlInicioTrabajador pnlInicioTrabajador1;
    private Vista.Trabajador pnlTrabajador1;
    // End of variables declaration//GEN-END:variables
    private PrincipalVisitador visitador;
}
