/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import LogicaNegocio.ExpertoBL;
import javax.swing.JOptionPane;

/**
 *
 * @author Ronaldo
 */
public class EstimarEru extends javax.swing.JPanel {

    /**
     * Creates new form EstimarEru
     */
    ExpertoBL ex = new ExpertoBL();
    public EstimarEru() {
        initComponents();        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jLabel37 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jLabel38 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        txtPreAnaCosto = new javax.swing.JTextField();
        txtPreAnaDias = new javax.swing.JTextField();
        txtPruAnaCosto = new javax.swing.JTextField();
        txtPruAnaDias = new javax.swing.JTextField();
        txtDesAnaCosto = new javax.swing.JTextField();
        txtDesAnaDias = new javax.swing.JTextField();
        txtAnaAnaCosto = new javax.swing.JTextField();
        txtAnaAnaDias = new javax.swing.JTextField();
        txtPlanAnaCosto = new javax.swing.JTextField();
        txtPlanAnaDias = new javax.swing.JTextField();
        txtPosAnaDias = new javax.swing.JTextField();
        txtPosAnaCosto = new javax.swing.JTextField();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        txtPreProCosto = new javax.swing.JTextField();
        txtPreProDias = new javax.swing.JTextField();
        txtPruProCosto = new javax.swing.JTextField();
        txtPruProDias = new javax.swing.JTextField();
        txtDesProCosto = new javax.swing.JTextField();
        txtDesProDias = new javax.swing.JTextField();
        txtAnaProCosto = new javax.swing.JTextField();
        txtAnaProDias = new javax.swing.JTextField();
        txtPlanProCosto = new javax.swing.JTextField();
        txtPlanProDias = new javax.swing.JTextField();
        txtPosProDias = new javax.swing.JTextField();
        txtPosProCosto = new javax.swing.JTextField();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jPanel19 = new javax.swing.JPanel();
        jPanel20 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtPreTesCosto = new javax.swing.JTextField();
        txtPreTesDias = new javax.swing.JTextField();
        txtPruTesCosto = new javax.swing.JTextField();
        txtPruTesDias = new javax.swing.JTextField();
        txtDesTesCosto = new javax.swing.JTextField();
        txtDesTesDias = new javax.swing.JTextField();
        txtAnaTesCosto = new javax.swing.JTextField();
        txtAnaTesDias = new javax.swing.JTextField();
        txtPlanTesCosto = new javax.swing.JTextField();
        txtPlanTesDias = new javax.swing.JTextField();
        txtPosTesDias = new javax.swing.JTextField();
        txtPosTesCosto = new javax.swing.JTextField();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtTotalCosto = new javax.swing.JTextField();
        txtTotalDias = new javax.swing.JTextField();
        txtTesTotalCosto = new javax.swing.JTextField();
        txtTesTotalDias = new javax.swing.JTextField();
        txtProTotalCosto = new javax.swing.JTextField();
        txtProTotalDias = new javax.swing.JTextField();
        txtAnaTotalCosto = new javax.swing.JTextField();
        txtAnaTotalDias = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Realizar Estimación");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, 390, 30));

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Realizar Estimación");
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, 390, 30));

        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel19.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("Realizar Estimación");
        jPanel7.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, 390, 30));

        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel20.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("Realizar Estimación");
        jPanel8.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, 390, 30));

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Realizar Estimación");
        jPanel5.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, 390, 30));

        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Realizar Estimación");
        jPanel6.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, 390, 30));

        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel37.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel37.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel37.setText("Realizar Estimación");
        jPanel13.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, 390, 30));

        jPanel14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel38.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel38.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel38.setText("Realizar Estimación");
        jPanel14.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, 390, 30));

        jPanel15.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Analista Desarrollo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 14))); // NOI18N
        jPanel15.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel16.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Estimación de Tiempos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 12))); // NOI18N
        jPanel16.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel39.setText("Post-Producción:");
        jPanel16.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, 20));

        jLabel40.setText("Planificación:");
        jPanel16.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, 20));

        jLabel41.setText("Análisis:");
        jPanel16.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, 20));

        jLabel42.setText("Pruebas:");
        jPanel16.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, 20));

        jLabel43.setText("Preparado:");
        jPanel16.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, 20));

        jLabel44.setText("Desarrollo:");
        jPanel16.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, 20));
        jPanel16.add(txtPreAnaCosto, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, 60, -1));
        jPanel16.add(txtPreAnaDias, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 60, -1));
        jPanel16.add(txtPruAnaCosto, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, 60, -1));
        jPanel16.add(txtPruAnaDias, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 60, -1));
        jPanel16.add(txtDesAnaCosto, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, 60, -1));

        txtDesAnaDias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDesAnaDiasActionPerformed(evt);
            }
        });
        jPanel16.add(txtDesAnaDias, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 60, -1));
        jPanel16.add(txtAnaAnaCosto, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, 60, -1));
        jPanel16.add(txtAnaAnaDias, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, 60, -1));
        jPanel16.add(txtPlanAnaCosto, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, 60, -1));

        txtPlanAnaDias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPlanAnaDiasActionPerformed(evt);
            }
        });
        jPanel16.add(txtPlanAnaDias, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, 60, -1));
        jPanel16.add(txtPosAnaDias, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 60, -1));
        jPanel16.add(txtPosAnaCosto, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, 60, -1));

        jLabel45.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel45.setText("Costo (S\\.)");
        jPanel16.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 60, -1));

        jLabel46.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel46.setText("Días");
        jPanel16.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, 60, -1));

        jPanel15.add(jPanel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 290, 210));

        jPanel14.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 350, 240));

        jPanel17.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Programador", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 14))); // NOI18N
        jPanel17.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel18.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Estimación de Tiempos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 12))); // NOI18N
        jPanel18.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel47.setText("Post-Producción:");
        jPanel18.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, 20));

        jLabel48.setText("Planificación:");
        jPanel18.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, 20));

        jLabel49.setText("Análisis:");
        jPanel18.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, 20));

        jLabel50.setText("Pruebas:");
        jPanel18.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, 20));

        jLabel51.setText("Preparado:");
        jPanel18.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, 20));

        jLabel52.setText("Desarrollo:");
        jPanel18.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, 20));
        jPanel18.add(txtPreProCosto, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, 60, -1));
        jPanel18.add(txtPreProDias, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 60, -1));
        jPanel18.add(txtPruProCosto, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, 60, -1));
        jPanel18.add(txtPruProDias, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 60, -1));
        jPanel18.add(txtDesProCosto, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, 60, -1));

        txtDesProDias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDesProDiasActionPerformed(evt);
            }
        });
        jPanel18.add(txtDesProDias, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 60, -1));
        jPanel18.add(txtAnaProCosto, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, 60, -1));
        jPanel18.add(txtAnaProDias, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, 60, -1));
        jPanel18.add(txtPlanProCosto, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, 60, -1));

        txtPlanProDias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPlanProDiasActionPerformed(evt);
            }
        });
        jPanel18.add(txtPlanProDias, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, 60, -1));
        jPanel18.add(txtPosProDias, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 60, -1));
        jPanel18.add(txtPosProCosto, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, 60, -1));

        jLabel53.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel53.setText("Costo (S\\.)");
        jPanel18.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 60, -1));

        jLabel54.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel54.setText("Días");
        jPanel18.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, 60, -1));

        jPanel17.add(jPanel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 290, 210));

        jPanel14.add(jPanel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 50, 350, 240));

        jPanel19.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Tester", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 14))); // NOI18N
        jPanel19.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel20.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Estimación de Tiempos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 12))); // NOI18N
        jPanel20.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setText("Post-Producción:");
        jPanel20.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, 20));

        jLabel14.setText("Planificación:");
        jPanel20.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, 20));

        jLabel15.setText("Análisis:");
        jPanel20.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, 20));

        jLabel16.setText("Pruebas:");
        jPanel20.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, 20));

        jLabel17.setText("Preparado:");
        jPanel20.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, 20));

        jLabel18.setText("Desarrollo:");
        jPanel20.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, 20));
        jPanel20.add(txtPreTesCosto, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, 60, -1));
        jPanel20.add(txtPreTesDias, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 60, -1));
        jPanel20.add(txtPruTesCosto, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, 60, -1));
        jPanel20.add(txtPruTesDias, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 60, -1));
        jPanel20.add(txtDesTesCosto, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, 60, -1));

        txtDesTesDias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDesTesDiasActionPerformed(evt);
            }
        });
        jPanel20.add(txtDesTesDias, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 60, -1));
        jPanel20.add(txtAnaTesCosto, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, 60, -1));
        jPanel20.add(txtAnaTesDias, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, 60, -1));
        jPanel20.add(txtPlanTesCosto, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, 60, -1));

        txtPlanTesDias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPlanTesDiasActionPerformed(evt);
            }
        });
        jPanel20.add(txtPlanTesDias, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, 60, -1));
        jPanel20.add(txtPosTesDias, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 60, -1));
        jPanel20.add(txtPosTesCosto, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, 60, -1));

        jLabel55.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel55.setText("Costo (S\\.)");
        jPanel20.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 60, -1));

        jLabel56.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel56.setText("Días");
        jPanel20.add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, 60, -1));

        jPanel19.add(jPanel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 290, 210));

        jPanel14.add(jPanel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 350, 240));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Resumen", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 14))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Total", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 12))); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setText("Analista Desarrollo");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, 20));

        jLabel4.setText("Programador:");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, 20));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Total:");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 90, 20));

        jLabel7.setText("Tester:");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, 20));

        txtTotalCosto.setEditable(false);
        jPanel3.add(txtTotalCosto, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, 60, -1));

        txtTotalDias.setEditable(false);
        jPanel3.add(txtTotalDias, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 60, -1));

        txtTesTotalCosto.setEditable(false);
        jPanel3.add(txtTesTotalCosto, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, 60, -1));

        txtTesTotalDias.setEditable(false);
        txtTesTotalDias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTesTotalDiasActionPerformed(evt);
            }
        });
        jPanel3.add(txtTesTotalDias, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 60, -1));

        txtProTotalCosto.setEditable(false);
        jPanel3.add(txtProTotalCosto, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, 60, -1));

        txtProTotalDias.setEditable(false);
        jPanel3.add(txtProTotalDias, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, 60, -1));

        txtAnaTotalCosto.setEditable(false);
        jPanel3.add(txtAnaTotalCosto, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, 60, -1));

        txtAnaTotalDias.setEditable(false);
        txtAnaTotalDias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAnaTotalDiasActionPerformed(evt);
            }
        });
        jPanel3.add(txtAnaTotalDias, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, 60, -1));

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Costo (S\\.)");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 60, -1));

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Días");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, 60, -1));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 290, 160));

        jPanel14.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 300, 350, 190));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Estimar.png"))); // NOI18N
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel14.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 490, -1, 50));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Yes.png"))); // NOI18N
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel14.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 490, 50, 50));

        jPanel13.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 560));

        jPanel6.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 560));

        jPanel5.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 560));

        jPanel8.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 560));

        jPanel7.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 560));

        jPanel4.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 560));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 560));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 560));
    }// </editor-fold>//GEN-END:initComponents

    private void txtAnaTotalDiasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAnaTotalDiasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAnaTotalDiasActionPerformed

    private void txtTesTotalDiasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTesTotalDiasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTesTotalDiasActionPerformed

    private void txtDesAnaDiasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDesAnaDiasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDesAnaDiasActionPerformed

    private void txtPlanAnaDiasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPlanAnaDiasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPlanAnaDiasActionPerformed

    private void txtDesProDiasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDesProDiasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDesProDiasActionPerformed

    private void txtPlanProDiasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPlanProDiasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPlanProDiasActionPerformed

    private void txtDesTesDiasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDesTesDiasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDesTesDiasActionPerformed

    private void txtPlanTesDiasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPlanTesDiasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPlanTesDiasActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int totalAnaDias,totalProDias,totalTesDias,totalDias;
        double totalAnaCosto,totalProCosto,totalTesCosto,totalCosto;
        //Cálculo de días de cada rol.
        totalAnaDias = Integer.parseInt(txtPlanAnaDias.getText())+
                Integer.parseInt(txtAnaAnaDias.getText())+
                Integer.parseInt(txtDesAnaDias.getText())+
                Integer.parseInt(txtPruAnaDias.getText())+
                Integer.parseInt(txtPreAnaDias.getText())+
                Integer.parseInt(txtPosAnaDias.getText());
        totalProDias = Integer.parseInt(txtPlanProDias.getText())+
                Integer.parseInt(txtAnaProDias.getText())+
                Integer.parseInt(txtDesProDias.getText())+
                Integer.parseInt(txtPruProDias.getText())+
                Integer.parseInt(txtPreProDias.getText())+
                Integer.parseInt(txtPosProDias.getText());
        totalTesDias = Integer.parseInt(txtPlanTesDias.getText())+
                Integer.parseInt(txtAnaTesDias.getText())+
                Integer.parseInt(txtDesTesDias.getText())+
                Integer.parseInt(txtPruTesDias.getText())+
                Integer.parseInt(txtPreTesDias.getText())+
                Integer.parseInt(txtPosTesDias.getText());        
        //Cálculo de costo de cada rol.
        totalAnaCosto = Integer.parseInt(txtPlanAnaCosto.getText())+
                Integer.parseInt(txtAnaAnaCosto.getText())+
                Integer.parseInt(txtDesAnaCosto.getText())+
                Integer.parseInt(txtPruAnaCosto.getText())+
                Integer.parseInt(txtPreAnaCosto.getText())+
                Integer.parseInt(txtPosAnaCosto.getText());
        totalProCosto = Integer.parseInt(txtPlanProCosto.getText())+
                Integer.parseInt(txtAnaProCosto.getText())+
                Integer.parseInt(txtDesProCosto.getText())+
                Integer.parseInt(txtPruProCosto.getText())+
                Integer.parseInt(txtPreProCosto.getText())+
                Integer.parseInt(txtPosProCosto.getText());
        totalTesCosto = Integer.parseInt(txtPlanTesCosto.getText())+
                Integer.parseInt(txtAnaTesCosto.getText())+
                Integer.parseInt(txtDesTesCosto.getText())+
                Integer.parseInt(txtPruTesCosto.getText())+
                Integer.parseInt(txtPreTesCosto.getText())+
                Integer.parseInt(txtPosTesCosto.getText());     
        //Cálculo total de días y costo.
        totalDias = totalAnaDias + totalProDias + totalTesDias;        
        totalCosto = totalAnaCosto + totalProCosto + totalTesCosto;        
        
        //Set de las casillas
        txtAnaTotalDias.setText(String.valueOf(totalAnaDias));
        txtProTotalDias.setText(String.valueOf(totalProDias));
        txtTesTotalDias.setText(String.valueOf(totalTesDias));
        txtAnaTotalCosto.setText(String.valueOf(totalAnaCosto));
        txtProTotalCosto.setText(String.valueOf(totalProCosto));
        txtTesTotalCosto.setText(String.valueOf(totalTesCosto));
        txtTotalDias.setText(String.valueOf(totalDias));
        txtTotalCosto.setText(String.valueOf(totalCosto));
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String totalDiasAna = txtAnaTotalDias.getText();
        String totalDiasPro = txtProTotalDias.getText();
        String totalDiasTes = txtTesTotalDias.getText();
        String totalCostoAna = txtAnaTotalCosto.getText();
        String totalCostoPro = txtProTotalCosto.getText();
        String totalCostoTes = txtTesTotalCosto.getText();
        ex.registrarLineaEsimacion(totalDiasAna, totalDiasPro, totalDiasTes,
                totalCostoAna, totalCostoPro, totalCostoTes);
        String rpta = "¿Estás seguro?";
        if(JOptionPane.showConfirmDialog(null, rpta,
            "ADVERTENCIA",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION){
        JOptionPane.showMessageDialog(null,"La estimación se realizó con éxito");
        }
        limpiarCeldas();
    }//GEN-LAST:event_jButton2ActionPerformed
    
    public void limpiarCeldas(){
        txtPlanAnaDias.setText("");
        txtAnaAnaDias.setText("");
        txtDesAnaDias.setText("");
        txtPruAnaDias.setText("");
        txtPreAnaDias.setText("");
        txtPosAnaDias.setText("");
        txtPlanTesDias.setText("");
        txtAnaTesDias.setText("");
        txtDesTesDias.setText("");
        txtPruTesDias.setText("");
        txtPreTesDias.setText("");
        txtPosTesDias.setText("");
        txtPlanProDias.setText("");
        txtAnaProDias.setText("");
        txtDesProDias.setText("");
        txtPruProDias.setText("");
        txtPreProDias.setText("");
        txtPosProDias.setText("");
        txtPlanAnaCosto.setText("");
        txtAnaAnaCosto.setText("");
        txtDesAnaCosto.setText("");
        txtPruAnaCosto.setText("");
        txtPreAnaCosto.setText("");
        txtPosAnaCosto.setText("");
        txtPlanTesCosto.setText("");
        txtAnaTesCosto.setText("");
        txtDesTesCosto.setText("");
        txtPruTesCosto.setText("");
        txtPreTesCosto.setText("");
        txtPosTesCosto.setText("");
        txtPlanProCosto.setText("");
        txtAnaProCosto.setText("");
        txtDesProCosto.setText("");
        txtPruProCosto.setText("");
        txtPreProCosto.setText("");
        txtPosProCosto.setText("");
        txtAnaTotalDias.setText("");
        txtProTotalDias.setText("");
        txtTesTotalDias.setText("");
        txtAnaTotalCosto.setText("");
        txtProTotalCosto.setText("");
        txtTesTotalCosto.setText("");
        txtTotalDias.setText("");
        txtTotalCosto.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JTextField txtAnaAnaCosto;
    private javax.swing.JTextField txtAnaAnaDias;
    private javax.swing.JTextField txtAnaProCosto;
    private javax.swing.JTextField txtAnaProDias;
    private javax.swing.JTextField txtAnaTesCosto;
    private javax.swing.JTextField txtAnaTesDias;
    private javax.swing.JTextField txtAnaTotalCosto;
    private javax.swing.JTextField txtAnaTotalDias;
    private javax.swing.JTextField txtDesAnaCosto;
    private javax.swing.JTextField txtDesAnaDias;
    private javax.swing.JTextField txtDesProCosto;
    private javax.swing.JTextField txtDesProDias;
    private javax.swing.JTextField txtDesTesCosto;
    private javax.swing.JTextField txtDesTesDias;
    private javax.swing.JTextField txtPlanAnaCosto;
    private javax.swing.JTextField txtPlanAnaDias;
    private javax.swing.JTextField txtPlanProCosto;
    private javax.swing.JTextField txtPlanProDias;
    private javax.swing.JTextField txtPlanTesCosto;
    private javax.swing.JTextField txtPlanTesDias;
    private javax.swing.JTextField txtPosAnaCosto;
    private javax.swing.JTextField txtPosAnaDias;
    private javax.swing.JTextField txtPosProCosto;
    private javax.swing.JTextField txtPosProDias;
    private javax.swing.JTextField txtPosTesCosto;
    private javax.swing.JTextField txtPosTesDias;
    private javax.swing.JTextField txtPreAnaCosto;
    private javax.swing.JTextField txtPreAnaDias;
    private javax.swing.JTextField txtPreProCosto;
    private javax.swing.JTextField txtPreProDias;
    private javax.swing.JTextField txtPreTesCosto;
    private javax.swing.JTextField txtPreTesDias;
    private javax.swing.JTextField txtProTotalCosto;
    private javax.swing.JTextField txtProTotalDias;
    private javax.swing.JTextField txtPruAnaCosto;
    private javax.swing.JTextField txtPruAnaDias;
    private javax.swing.JTextField txtPruProCosto;
    private javax.swing.JTextField txtPruProDias;
    private javax.swing.JTextField txtPruTesCosto;
    private javax.swing.JTextField txtPruTesDias;
    private javax.swing.JTextField txtTesTotalCosto;
    private javax.swing.JTextField txtTesTotalDias;
    private javax.swing.JTextField txtTotalCosto;
    private javax.swing.JTextField txtTotalDias;
    // End of variables declaration//GEN-END:variables
}
