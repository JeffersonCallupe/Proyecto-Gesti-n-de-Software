/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gcs;

public class Carrito extends javax.swing.JFrame {

    Catalogo frame;
    public Carrito() {
        initComponents();
        setLocationRelativeTo(null);    
        setResizable(false);
    }

    public void setFrame (Catalogo origen){
        this.frame = origen;
        frame.setEnabled(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MetodosDePagos = new javax.swing.ButtonGroup();
        jScrollBar1 = new javax.swing.JScrollBar();
        jPanel = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        pnlDatos = new javax.swing.JPanel();
        lblDatos = new javax.swing.JLabel();
        pnlMetodos = new javax.swing.JPanel();
        lblMetodos = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        btnContinuar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        lblImageVisa = new javax.swing.JLabel();
        lblImageMaster = new javax.swing.JLabel();
        lblImageBBVA = new javax.swing.JLabel();
        jRadioButton4 = new javax.swing.JRadioButton();
        imgOh = new org.edisoncor.gui.panel.PanelImage();
        panelImage2 = new org.edisoncor.gui.panel.PanelImage();
        jRadioButton5 = new javax.swing.JRadioButton();
        btnVolver = new javax.swing.JButton();
        btnListaCompras = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        txtDNI = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        txtCorreo = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        txtDireccion = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel.setBackground(new java.awt.Color(255, 255, 255));
        jPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 153, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CARRITO DE COMPRAS");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, -1, 40));

        jPanel.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 817, -1));

        pnlDatos.setBackground(new java.awt.Color(255, 153, 0));
        pnlDatos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlDatos.setForeground(new java.awt.Color(255, 153, 0));

        lblDatos.setBackground(new java.awt.Color(255, 255, 255));
        lblDatos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblDatos.setForeground(new java.awt.Color(255, 255, 255));
        lblDatos.setText("DATOS");

        javax.swing.GroupLayout pnlDatosLayout = new javax.swing.GroupLayout(pnlDatos);
        pnlDatos.setLayout(pnlDatosLayout);
        pnlDatosLayout.setHorizontalGroup(
            pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDatosLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(lblDatos)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlDatosLayout.setVerticalGroup(
            pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDatosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblDatos)
                .addContainerGap())
        );

        jPanel.add(pnlDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, -1, -1));

        pnlMetodos.setBackground(new java.awt.Color(255, 153, 0));
        pnlMetodos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlMetodos.setForeground(new java.awt.Color(255, 153, 0));

        lblMetodos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblMetodos.setForeground(new java.awt.Color(255, 255, 255));
        lblMetodos.setText("MÉTODO DE PAGO");

        javax.swing.GroupLayout pnlMetodosLayout = new javax.swing.GroupLayout(pnlMetodos);
        pnlMetodos.setLayout(pnlMetodosLayout);
        pnlMetodosLayout.setHorizontalGroup(
            pnlMetodosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMetodosLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(lblMetodos)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlMetodosLayout.setVerticalGroup(
            pnlMetodosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMetodosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblMetodos)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel.add(pnlMetodos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 345, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel4.setText("Nombre");
        jPanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("Indique los datos de la persona quien recepcionará los productos");
        jPanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel6.setText("DNI");
        jPanel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel7.setText("Dirección");
        jPanel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 280, -1, -1));

        txtNombre.setBorder(null);
        jPanel.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, 350, 20));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel8.setText("Correo");
        jPanel.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, -1, -1));

        btnContinuar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/FlechaContinuar.png"))); // NOI18N
        btnContinuar.setText("Continuar");
        btnContinuar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnContinuar.setBorderPainted(false);
        btnContinuar.setContentAreaFilled(false);
        btnContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContinuarActionPerformed(evt);
            }
        });
        jPanel.add(btnContinuar, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 600, 100, 30));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        MetodosDePagos.add(jRadioButton1);
        jRadioButton1.setText("VISA");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        MetodosDePagos.add(jRadioButton2);
        jRadioButton2.setText("MasterCard");

        MetodosDePagos.add(jRadioButton3);
        jRadioButton3.setText("BBVA");

        lblImageVisa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/visa (1).png"))); // NOI18N

        lblImageMaster.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Mastercard (1).png"))); // NOI18N

        lblImageBBVA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/bbvaa.png"))); // NOI18N

        jRadioButton4.setText("Tarjeta Oh");

        imgOh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Tarjeta_Oh.jpg"))); // NOI18N

        javax.swing.GroupLayout imgOhLayout = new javax.swing.GroupLayout(imgOh);
        imgOh.setLayout(imgOhLayout);
        imgOhLayout.setHorizontalGroup(
            imgOhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 86, Short.MAX_VALUE)
        );
        imgOhLayout.setVerticalGroup(
            imgOhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 58, Short.MAX_VALUE)
        );

        panelImage2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/interbank.jpg"))); // NOI18N

        javax.swing.GroupLayout panelImage2Layout = new javax.swing.GroupLayout(panelImage2);
        panelImage2.setLayout(panelImage2Layout);
        panelImage2Layout.setHorizontalGroup(
            panelImage2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        panelImage2Layout.setVerticalGroup(
            panelImage2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        jRadioButton5.setText("Interbank");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblImageVisa)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jRadioButton1)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblImageMaster)
                    .addComponent(jRadioButton2))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jRadioButton3)
                        .addGap(41, 41, 41)
                        .addComponent(jRadioButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblImageBBVA, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(imgOh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(panelImage2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jRadioButton2)
                                .addComponent(jRadioButton3)
                                .addComponent(jRadioButton4)
                                .addComponent(jRadioButton5))
                            .addComponent(jRadioButton1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblImageMaster)
                            .addComponent(lblImageVisa)
                            .addComponent(lblImageBBVA)
                            .addComponent(imgOh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(panelImage2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        jPanel.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 370, -1, 150));

        btnVolver.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/FlechaVolver.png"))); // NOI18N
        btnVolver.setText("Volver");
        btnVolver.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnVolver.setBorderPainted(false);
        btnVolver.setContentAreaFilled(false);
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        jPanel.add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 600, 90, 30));

        btnListaCompras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/bienes (1).png"))); // NOI18N
        btnListaCompras.setBorder(null);
        btnListaCompras.setBorderPainted(false);
        btnListaCompras.setContentAreaFilled(false);
        btnListaCompras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListaComprasActionPerformed(evt);
            }
        });
        jPanel.add(btnListaCompras, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 200, 70, 70));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, 350, 20));

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        jPanel.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, 350, 20));

        txtDNI.setBorder(null);
        jPanel.add(txtDNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, 350, 20));

        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        jPanel.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 260, 350, 20));

        txtCorreo.setBorder(null);
        jPanel.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, 350, 20));

        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));
        jPanel.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 300, 350, 20));

        txtDireccion.setBorder(null);
        jPanel.add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 280, 350, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 644, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnListaComprasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListaComprasActionPerformed
 
// TODO add your handling code here:
    }//GEN-LAST:event_btnListaComprasActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void btnContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContinuarActionPerformed

    }//GEN-LAST:event_btnContinuarActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        frame.setVisible(true);
        this.setVisible(false);
        frame.setEnabled(true);
        frame.toFront();
      
// TODO add your handling code here:
    }//GEN-LAST:event_btnVolverActionPerformed

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
            java.util.logging.Logger.getLogger(Carrito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Carrito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Carrito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Carrito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Carrito().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.ButtonGroup MetodosDePagos;
    private javax.swing.JButton btnContinuar;
    private javax.swing.JButton btnListaCompras;
    private javax.swing.JButton btnVolver;
    private org.edisoncor.gui.panel.PanelImage imgOh;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JLabel lblDatos;
    private javax.swing.JLabel lblImageBBVA;
    private javax.swing.JLabel lblImageMaster;
    private javax.swing.JLabel lblImageVisa;
    private javax.swing.JLabel lblMetodos;
    private org.edisoncor.gui.panel.PanelImage panelImage2;
    private javax.swing.JPanel pnlDatos;
    private javax.swing.JPanel pnlMetodos;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDNI;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
