/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import LogicaNegocio.ClienteBL;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Ronaldo
 */
public class ModificarEru extends javax.swing.JPanel {

    /**
     * Creates new form ModificarEru
     */
    Cliente x;
    JPanel panelPrincipal;
    String id;
    private ClienteBL clientebl;
    private Cliente objseleccionado;

    public Cliente getObjseleccionado() {
        return objseleccionado;
    }

    public void setObjseleccionado(Cliente objseleccionado) {
        this.objseleccionado = objseleccionado;
    }
    public ModificarEru() {
        initComponents();
    }
    
    public ModificarEru(Cliente c,JPanel d,String id){
        initComponents();
        x = c;
        panelPrincipal = d;
        this.id = id;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtnomproyc = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtobjetivomod = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaErusmodificar = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        txtrequerimientomod = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        cboxprioridad = new javax.swing.JComboBox<>();
        btnAgregarmod = new javax.swing.JButton();
        btnmodificarmod = new javax.swing.JButton();
        btnEliminarmod = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Modificar Requerimiento de Usuario");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 26, 634, 39));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("Datos Generales del Proyecto");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 76, 284, 38));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("Nombre del Proyecto:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(159, 120, 175, 30));

        txtnomproyc.setEditable(false);
        add(txtnomproyc, new org.netbeans.lib.awtextra.AbsoluteConstraints(338, 120, 207, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setText("Descripción de los Requerimientos");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 284, 30));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Yes.png"))); // NOI18N
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 500, 195, 53));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Buscar.png"))); // NOI18N
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 110, -1, 30));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setText("Objetivo del Requerimiento:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(119, 151, -1, -1));
        add(txtobjetivomod, new org.netbeans.lib.awtextra.AbsoluteConstraints(338, 150, 207, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setText("Fecha Estimada:");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, -1, -1));

        tablaErusmodificar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Requerimiento", "Prioridad"
            }
        ));
        jScrollPane3.setViewportView(tablaErusmodificar);

        add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 360, 680, 140));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        jLabel9.setText("Requerimiento:");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, -1, -1));

        txtrequerimientomod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtrequerimientomodActionPerformed(evt);
            }
        });
        add(txtrequerimientomod, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 290, 430, -1));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        jLabel8.setText("Prioridad:");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 330, -1, -1));

        cboxprioridad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3" }));
        cboxprioridad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxprioridadActionPerformed(evt);
            }
        });
        add(cboxprioridad, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 320, -1, -1));

        btnAgregarmod.setText("Agregar");
        add(btnAgregarmod, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 270, 90, -1));

        btnmodificarmod.setText("Modificar");
        add(btnmodificarmod, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 300, 90, -1));

        btnEliminarmod.setText("Eliminar");
        add(btnEliminarmod, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 330, 90, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 10)); // NOI18N
        jLabel5.setText("[100 caracteres]");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 310, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String rpta = "¿Estás seguro?";
        if(JOptionPane.showConfirmDialog(null, rpta,
                "ADVERTENCIA",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION){
            JOptionPane.showMessageDialog(null,"Modificación exitosa");
        }            
        new CambiaPanel(panelPrincipal, new HomeCliente());
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        new BuscarEruCliente(x,true,id).setVisible(true);
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtrequerimientomodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtrequerimientomodActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtrequerimientomodActionPerformed

    private void cboxprioridadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxprioridadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboxprioridadActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarmod;
    private javax.swing.JButton btnEliminarmod;
    private javax.swing.JButton btnmodificarmod;
    private javax.swing.JComboBox<String> cboxprioridad;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tablaErusmodificar;
    private javax.swing.JTextField txtnomproyc;
    private javax.swing.JTextField txtobjetivomod;
    private javax.swing.JTextField txtrequerimientomod;
    // End of variables declaration//GEN-END:variables
}
