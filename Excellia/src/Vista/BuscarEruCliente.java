/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import LogicaNegocio.ClienteBL;
import Modelo.Eru;
import Modelo.JefeProyecto;
import Modelo.Proyecto;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class BuscarEruCliente extends javax.swing.JDialog {

   ClienteBL cliente=new ClienteBL();
   String id;
   Proyecto proy;
   private Cliente objseleccionado;

    public Cliente getObjseleccionado() {
        return objseleccionado;
    }

    public void setObjseleccionado(Cliente objseleccionado) {
        this.objseleccionado = objseleccionado;
    }
    public BuscarEruCliente(java.awt.Frame parent, boolean modal,String id) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(parent);
        this.setTitle("Búsqueda de ERU");
        this.id = id;
        cliente.tabla_eru_busqueda(tabla_eru_busqueda,id);
    }
    public BuscarEruCliente(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(parent);
        this.setTitle("Búsqueda de ERU");
        cliente.tabla_eru_busqueda(tabla_eru_busqueda,id);
    }

    BuscarEruCliente() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_eru_busqueda = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 153, 51));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Búsqueda de ERU's");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 4, 269, 51));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 60));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Búsqueda por nombre de proyecto:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 71, 248, 26));
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 103, 323, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Yes.png"))); // NOI18N
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(453, 91, 54, 44));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/No.png"))); // NOI18N
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(513, 91, 52, 44));

        tabla_eru_busqueda.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tabla_eru_busqueda);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 153, 600, 164));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 350));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        //objseleccionado=(cliente)
        
        //String rpta = "¿Estás seguro?";
        //if(JOptionPane.showConfirmDialog(null, rpta,
          //  "ADVERTENCIA",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION){
        //JOptionPane.showMessageDialog(null,"Se tomaron correctamente los datos");
        int FilaSelec = tabla_eru_busqueda.getSelectedRow();
        ArrayList<Proyecto>listaProyectos = new ArrayList<Proyecto>();
        listaProyectos = cliente.listar(id);
        proy = listaProyectos.get(FilaSelec);
        /*SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd",Locale.ENGLISH);
        proy= new Proyecto();
        proy.setNombre(tabla_eru_busqueda.getValueAt(FilaSelec, 0).toString());
        try {
           proy.setFechaFinEstimada(formatter.parse(tabla_eru_busqueda.getValueAt(FilaSelec, 1).toString()));
        } catch (ParseException ex) {
           Logger.getLogger(BuscarEruCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        Eru e = new Eru();
        e.setEstadoString(tabla_eru_busqueda.getValueAt(FilaSelec, 2).toString());        
        proy.setTipoFase(tabla_eru_busqueda.getValueAt(FilaSelec, 3).toString());
        JefeProyecto jf = new JefeProyecto();
        jf.setNombre(tabla_eru_busqueda.getValueAt(FilaSelec, 4).toString());        
        e.setObjString(tabla_eru_busqueda.getValueAt(FilaSelec,5).toString());
        proy.setEru(e);
        proy.setJefeProyecto(jf);*/
        dispose();
        //}
    }//GEN-LAST:event_jButton1ActionPerformed

    private Proyecto getProyecto(){
        return proy;
    }
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BuscarEruCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BuscarEruCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BuscarEruCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BuscarEruCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                BuscarEruCliente dialog = new BuscarEruCliente(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTable tabla_eru_busqueda;
    // End of variables declaration//GEN-END:variables
}
