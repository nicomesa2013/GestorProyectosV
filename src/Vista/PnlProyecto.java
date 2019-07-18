/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.EmpresaControlador;
import Modelo.*;
import PatronesDiseño.EmpresaVisitador;
import PatronesDiseño.ProyectoVisitador;
import java.awt.CardLayout;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.table.DefaultTableModel;
import org.joda.time.Duration;
import org.joda.time.format.PeriodFormatter;
import org.joda.time.format.PeriodFormatterBuilder;


/**
 *
 * @author Daniela Chaux
 */
public class PnlProyecto extends javax.swing.JPanel implements ProyectoVisitador{

    /**
     * Creates new form PnlProyecto
     */
    public PnlProyecto() {
        initComponents();
        pnlProyectoAgregarT1.setVisitador(this);
        pnlProyectoAgregarU1.setVisitador(this);
        proyectos = EmpresaControlador.getInstance().getProyectos(); 
        cargarLista();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jToggleButton1 = new javax.swing.JToggleButton();
        jToggleButton2 = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jSplitPane1 = new javax.swing.JSplitPane();
        pnlTarjetas = new javax.swing.JPanel();
        pnlProyectoAgregarU1 = new Vista.PnlProyectoAgregarU();
        pnlProyectoAgregarT1 = new Vista.PnlProyectoAgregarT();
        pnlMenuRegistro = new javax.swing.JPanel();
        btnRegistroT = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        pnlTiempoP = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtTiempoTP = new javax.swing.JLabel();
        pnlTiempoT = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblTiempoTareas = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        pnlTiempoU = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblTiempoUsuario = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblTiempoTareaU = new javax.swing.JTable();
        txtNombrepnlTiempoU = new javax.swing.JLabel();
        PnlListaProyectos = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        BtnUsuario = new javax.swing.JButton();
        BtnRegistro = new javax.swing.JButton();
        BtnTarea = new javax.swing.JButton();
        BtnCancelar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ListProyectos = new javax.swing.JList();

        jToggleButton1.setText("jToggleButton1");

        jToggleButton2.setText("jToggleButton2");

        setLayout(new java.awt.BorderLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("PROYECTOS");
        add(jLabel1, java.awt.BorderLayout.PAGE_START);

        pnlTarjetas.setPreferredSize(new java.awt.Dimension(25, 254));
        pnlTarjetas.setLayout(new java.awt.CardLayout());
        pnlTarjetas.add(pnlProyectoAgregarU1, "Usuario");
        pnlTarjetas.add(pnlProyectoAgregarT1, "Tarea");

        btnRegistroT.setText("Tiempo Invertido en Tareas");
        btnRegistroT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistroTActionPerformed(evt);
            }
        });

        jButton3.setText("Tiempo Invertido en Proyectos");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Tiempo Invertido por usuario");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlMenuRegistroLayout = new javax.swing.GroupLayout(pnlMenuRegistro);
        pnlMenuRegistro.setLayout(pnlMenuRegistroLayout);
        pnlMenuRegistroLayout.setHorizontalGroup(
            pnlMenuRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMenuRegistroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlMenuRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRegistroT)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addContainerGap(97, Short.MAX_VALUE))
        );
        pnlMenuRegistroLayout.setVerticalGroup(
            pnlMenuRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMenuRegistroLayout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnRegistroT)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton4)
                .addContainerGap(175, Short.MAX_VALUE))
        );

        pnlTarjetas.add(pnlMenuRegistro, "MenuRegistro");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Tiempo Proyecto:");

        txtTiempoTP.setText(" ");

        javax.swing.GroupLayout pnlTiempoPLayout = new javax.swing.GroupLayout(pnlTiempoP);
        pnlTiempoP.setLayout(pnlTiempoPLayout);
        pnlTiempoPLayout.setHorizontalGroup(
            pnlTiempoPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTiempoPLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTiempoTP, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlTiempoPLayout.setVerticalGroup(
            pnlTiempoPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTiempoPLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlTiempoPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtTiempoTP))
                .addContainerGap(309, Short.MAX_VALUE))
        );

        pnlTarjetas.add(pnlTiempoP, "TiempoProyecto");

        tblTiempoTareas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null}
            },
            new String [] {
                "Tarea", "Tiempo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblTiempoTareas);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Tiempo Tarea");

        javax.swing.GroupLayout pnlTiempoTLayout = new javax.swing.GroupLayout(pnlTiempoT);
        pnlTiempoT.setLayout(pnlTiempoTLayout);
        pnlTiempoTLayout.setHorizontalGroup(
            pnlTiempoTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTiempoTLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlTiempoTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlTiempoTLayout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 24, Short.MAX_VALUE))
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlTiempoTLayout.setVerticalGroup(
            pnlTiempoTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTiempoTLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(205, Short.MAX_VALUE))
        );

        pnlTarjetas.add(pnlTiempoT, "TiempoTarea");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Tiempo Usuarios:");

        tblTiempoUsuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null}
            },
            new String [] {
                "Usuario", "Tiempo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblTiempoUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblTiempoUsuarioMouseReleased(evt);
            }
        });
        jScrollPane3.setViewportView(tblTiempoUsuario);

        tblTiempoTareaU.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null}
            },
            new String [] {
                "Tarea", "Tiempo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(tblTiempoTareaU);

        txtNombrepnlTiempoU.setText(" ");

        javax.swing.GroupLayout pnlTiempoULayout = new javax.swing.GroupLayout(pnlTiempoU);
        pnlTiempoU.setLayout(pnlTiempoULayout);
        pnlTiempoULayout.setHorizontalGroup(
            pnlTiempoULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTiempoULayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlTiempoULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(txtNombrepnlTiempoU, javax.swing.GroupLayout.DEFAULT_SIZE, 266, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlTiempoULayout.setVerticalGroup(
            pnlTiempoULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTiempoULayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(txtNombrepnlTiempoU)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pnlTarjetas.add(pnlTiempoU, "TiempoUsuario");

        jSplitPane1.setRightComponent(pnlTarjetas);

        PnlListaProyectos.setLayout(new java.awt.BorderLayout());

        java.awt.GridBagLayout jPanel2Layout = new java.awt.GridBagLayout();
        jPanel2Layout.columnWidths = new int[] {0, 5, 0};
        jPanel2Layout.rowHeights = new int[] {0, 8, 0, 8, 0, 8, 0, 8, 0, 8, 0};
        jPanel2.setLayout(jPanel2Layout);

        BtnUsuario.setText("Usuario");
        BtnUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnUsuarioActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 2;
        gridBagConstraints.ipady = 3;
        gridBagConstraints.insets = new java.awt.Insets(9, 0, 9, 0);
        jPanel2.add(BtnUsuario, gridBagConstraints);

        BtnRegistro.setText("Registro");
        BtnRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRegistroActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 2;
        gridBagConstraints.ipady = 3;
        gridBagConstraints.insets = new java.awt.Insets(9, 0, 9, 0);
        jPanel2.add(BtnRegistro, gridBagConstraints);

        BtnTarea.setText("Tarea");
        BtnTarea.setPreferredSize(new java.awt.Dimension(73, 23));
        BtnTarea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnTareaActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 2;
        gridBagConstraints.ipady = 3;
        gridBagConstraints.insets = new java.awt.Insets(9, 0, 9, 0);
        jPanel2.add(BtnTarea, gridBagConstraints);

        BtnCancelar.setText("Cancelar");
        BtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCancelarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.ipadx = 2;
        gridBagConstraints.ipady = 3;
        gridBagConstraints.insets = new java.awt.Insets(9, 0, 0, 0);
        jPanel2.add(BtnCancelar, gridBagConstraints);

        PnlListaProyectos.add(jPanel2, java.awt.BorderLayout.PAGE_END);

        jScrollPane1.setViewportView(ListProyectos);

        PnlListaProyectos.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jSplitPane1.setLeftComponent(PnlListaProyectos);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSplitPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSplitPane1)
                .addContainerGap())
        );

        add(jPanel1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void BtnRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRegistroActionPerformed
        cambiarTarjeta("MenuRegistro");
    }//GEN-LAST:event_BtnRegistroActionPerformed

    private void BtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCancelarActionPerformed
        // TODO add your handling code here:
        visitador.cambiarTarjeta("Principal");
    }//GEN-LAST:event_BtnCancelarActionPerformed

    private void BtnUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnUsuarioActionPerformed
        // TODO add your handling code here:
        cambiarTarjeta("Usuario");
    }//GEN-LAST:event_BtnUsuarioActionPerformed

    private void BtnTareaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnTareaActionPerformed
        // TODO add your handling code here:
        cambiarTarjeta("Tarea");
        pnlProyectoAgregarT1.setProyecto(proyectos.get(ListProyectos.getSelectedIndex()));
    }//GEN-LAST:event_BtnTareaActionPerformed

    private void btnRegistroTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistroTActionPerformed
        cambiarTarjeta("TiempoTarea");
    }//GEN-LAST:event_btnRegistroTActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        cambiarTarjeta("TiempoProyecto");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        cambiarTarjeta("TiempoUsuario");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void tblTiempoUsuarioMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblTiempoUsuarioMouseReleased
        if(evt.getClickCount() >= 2){
            Usuario usuario = EmpresaControlador.getInstance().getUsuario(tblTiempoUsuario.getValueAt(tblTiempoUsuario.getSelectedRow(), 0).toString());
            cargarTablaTareasUsuario(usuario, proyectos.get(ListProyectos.getSelectedIndex()).getTareas());
        }
    }//GEN-LAST:event_tblTiempoUsuarioMouseReleased
    public void setVisitador(EmpresaVisitador visitador) {
        this.visitador = visitador;
    }
    
    public void cambiarTarjeta(String tarjeta){
        Proyecto proyecto = EmpresaControlador.getInstance().getProyectos().get(ListProyectos.getSelectedIndex());
        PeriodFormatter ptf = new PeriodFormatterBuilder().appendHours()
                .appendSuffix("h")
                .appendMinutes()
                .appendSuffix("m")
                .appendSeconds()
                .appendSuffix("s")
                .toFormatter();
        ((CardLayout) pnlTarjetas.getLayout()).show(pnlTarjetas, tarjeta);
        switch (tarjeta) {
            case "Tarea":
                pnlProyectoAgregarT1.vaciarCampos();
                break;
            case "Usuario":
                pnlProyectoAgregarU1.vaciarCampos();
                break;
            case "TiempoTarea":
                cargarTablaTareas(proyecto.getTareas());
                break;
            case "TiempoProyecto":
                txtTiempoTP.setText(ptf.print(EmpresaControlador.getInstance().sumarTiemposProyecto(proyecto)
                        .toPeriod()));
                break;
            case "TiempoUsuario":
                cargarTablaUsuarios(proyecto.getUsuarios());
                
        }
        
    }
   
    public void cargarLista(){  
        modeloLista = new DefaultListModel();
        ListProyectos.setModel(modeloLista);
        for (int i = 0; i < proyectos.size(); i++) {
            modeloLista.addElement(proyectos.get(i).getNombre());
        }
    }
    
    public void cargarTablaTareas(List<Tarea> tareas){
        PeriodFormatter ptf = new PeriodFormatterBuilder().appendHours()
                .appendSuffix("h")
                .appendMinutes()
                .appendSuffix("m")
                .appendSeconds()
                .appendSuffix("s")
                .toFormatter();
        int numero = ((DefaultTableModel)tblTiempoTareas.getModel()).getRowCount();
        for (int i = 0; i < numero; i++) {
            ((DefaultTableModel)tblTiempoTareas.getModel()).removeRow(0);
        }
        DefaultTableModel mT = (DefaultTableModel) tblTiempoTareas.getModel();
        for (int i = 0; i < tareas.size(); i++) {
            String nombreT = tareas.get(i).getNombre();
            String contador = ptf.print(EmpresaControlador.getInstance().sumarTiemposTarea(tareas.get(i)).toPeriod());
            
            mT.addRow(new Object[]{
                nombreT,
                contador
            });
        }
        tblTiempoTareas.setModel(mT);
    }
    
    public void cargarTablaUsuarios(List<Usuario> usuarios){
        PeriodFormatter ptf = new PeriodFormatterBuilder().appendHours()
                .appendSuffix("h")
                .appendMinutes()
                .appendSuffix("m")
                .appendSeconds()
                .appendSuffix("s")
                .toFormatter();
        int numero = ((DefaultTableModel)tblTiempoUsuario.getModel()).getRowCount();
        for (int i = 0; i < numero; i++) {
            ((DefaultTableModel)tblTiempoUsuario.getModel()).removeRow(0);
        }
        DefaultTableModel mt = (DefaultTableModel) tblTiempoUsuario.getModel();
        for (int i = 0; i < usuarios.size(); i++) {
            String nombreU = usuarios.get(i).getNombre();
            String contador = ptf.print(EmpresaControlador.getInstance().sumarTiemposUsuario(usuarios.get(i), EmpresaControlador.getInstance().
                    getProyecto(ListProyectos.getSelectedIndex())).toPeriod());
            
            mt.addRow(new Object[]{
                nombreU,
                contador
            });
        }
        tblTiempoTareas.setModel(mt);
    }
    
    public void cargarTablaTareasUsuario(Usuario usuario, List<Tarea> tareas){
        PeriodFormatter ptf = new PeriodFormatterBuilder().appendHours()
                .appendSuffix("h")
                .appendMinutes()
                .appendSuffix("m")
                .appendSeconds()
                .appendSuffix("s")
                .toFormatter();
        int numero = ((DefaultTableModel)tblTiempoTareaU.getModel()).getRowCount();
        for (int i = 0; i < numero; i++) {
            ((DefaultTableModel)tblTiempoTareaU.getModel()).removeRow(0);
        }
        DefaultTableModel mt = (DefaultTableModel) tblTiempoTareaU.getModel();
        for (int i = 0; i < tareas.size(); i++) {
            String nombreT = tareas.get(i).getNombre();
            String contador = ptf.print(EmpresaControlador.getInstance().
                    sumarTiemposTareaU(usuario, tareas.get(i)).toPeriod());
            mt.addRow(new Object[]{
                nombreT,
                contador
            });
        }
        tblTiempoTareaU.setModel(mt);
    }
    public void agregarTarea(String nombre, String descripcion, Proyecto proyecto){
        Tarea tarea = new Tarea(nombre, descripcion, proyecto);
        EmpresaControlador.getInstance().
                agregarTareaAProyecto(ListProyectos.getSelectedIndex(), tarea);
    }
    
    public void agregarUsuario(String nombre, Long id){
        Usuario usuario = new Usuario(nombre, id);
        EmpresaControlador.getInstance().agregarUsusarioAProyecto(ListProyectos.getSelectedIndex(), usuario);
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCancelar;
    private javax.swing.JButton BtnRegistro;
    private javax.swing.JButton BtnTarea;
    private javax.swing.JButton BtnUsuario;
    private javax.swing.JList ListProyectos;
    private javax.swing.JPanel PnlListaProyectos;
    private javax.swing.JButton btnRegistroT;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JPanel pnlMenuRegistro;
    private Vista.PnlProyectoAgregarT pnlProyectoAgregarT1;
    private Vista.PnlProyectoAgregarU pnlProyectoAgregarU1;
    private javax.swing.JPanel pnlTarjetas;
    private javax.swing.JPanel pnlTiempoP;
    private javax.swing.JPanel pnlTiempoT;
    private javax.swing.JPanel pnlTiempoU;
    private javax.swing.JTable tblTiempoTareaU;
    private javax.swing.JTable tblTiempoTareas;
    private javax.swing.JTable tblTiempoUsuario;
    private javax.swing.JLabel txtNombrepnlTiempoU;
    private javax.swing.JLabel txtTiempoTP;
    // End of variables declaration//GEN-END:variables
    private EmpresaVisitador visitador;
    private DefaultListModel modeloLista;
    private List<Proyecto> proyectos;
}
