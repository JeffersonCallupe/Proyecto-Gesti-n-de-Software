/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gcs;

import Clases.compras;
import javax.swing.JOptionPane;

/**
 *
 * @author CRISTHIAN
 */
public class EdicionCompra extends javax.swing.JFrame {
    int i = 0, ind;
    ListaDeCompras frame;
    protected int cantidad;
    public EdicionCompra() {
        initComponents();
        setLocationRelativeTo(null);
    }

    void generar(String nombre, int cant, int ind){
        txtProducto.setText(nombre);
        txtCant.setText(""+cant);
        i = cant;
        this.ind = ind;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblCantidad = new javax.swing.JLabel();
        lblProducto = new javax.swing.JLabel();
        txtProducto = new javax.swing.JTextField();
        txtCant = new javax.swing.JTextField();
        lblMenos = new javax.swing.JLabel();
        lblMas = new javax.swing.JLabel();
        btnMenos = new javax.swing.JButton();
        btnMas = new javax.swing.JButton();
        btnAceptar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(415, 201));
        setMinimumSize(new java.awt.Dimension(415, 201));
        setName("Editar"); // NOI18N
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(415, 201));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblCantidad.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        lblCantidad.setForeground(new java.awt.Color(0, 0, 0));
        lblCantidad.setText("Cantidad:");
        jPanel1.add(lblCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 70, -1));

        lblProducto.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        lblProducto.setForeground(new java.awt.Color(0, 0, 0));
        lblProducto.setText("Producto:");
        jPanel1.add(lblProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 70, -1));

        txtProducto.setEditable(false);
        txtProducto.setEnabled(false);
        jPanel1.add(txtProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 53, 230, 30));

        txtCant.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCant.setText("0");
        jPanel1.add(txtCant, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 103, 40, 30));

        lblMenos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblMenos.setText("-");
        jPanel1.add(lblMenos, new org.netbeans.lib.awtextra.AbsoluteConstraints(151, 106, -1, -1));

        lblMas.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblMas.setText("+");
        jPanel1.add(lblMas, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 106, -1, -1));

        btnMenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenosActionPerformed(evt);
            }
        });
        jPanel1.add(btnMenos, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 103, 30, 30));

        btnMas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMasActionPerformed(evt);
            }
        });
        jPanel1.add(btnMas, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 103, 30, 30));

        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });
        jPanel1.add(btnAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 100, -1));

        jButton1.setText("Cancelar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 160, 90, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 200));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMasActionPerformed
        if (Integer.parseInt(txtCant.getText())< 10){
            i++;
            txtCant.setText(""+i);
        }
    }//GEN-LAST:event_btnMasActionPerformed

    private void btnMenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenosActionPerformed
        if (Integer.parseInt(txtCant.getText())> 0){
            i--;
            txtCant.setText(""+i);
        }
    }//GEN-LAST:event_btnMenosActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        if (Integer.parseInt(txtCant.getText())!= 0){
            compras.productos.get(ind).setCantidad(i);
            frame.llenarTabla();
        }else{
            int resp = JOptionPane.showConfirmDialog(null, "¿Está seguro de eliminar este producto?", "Eliminar producto", JOptionPane.YES_NO_OPTION);
            if (resp == 0)
               compras.productos.remove(ind);
        }
        this.setVisible(false);
        frame.setEnabled(true);
        frame.toFront();
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
        frame.setEnabled(true);
        frame.toFront();
    }//GEN-LAST:event_jButton1ActionPerformed
    
    public void setFrame (ListaDeCompras origen){
        this.frame = origen;
        frame.setEnabled(false);
    }
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
            java.util.logging.Logger.getLogger(EdicionCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EdicionCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EdicionCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EdicionCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EdicionCompra().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnMas;
    private javax.swing.JButton btnMenos;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblCantidad;
    private javax.swing.JLabel lblMas;
    private javax.swing.JLabel lblMenos;
    private javax.swing.JLabel lblProducto;
    private javax.swing.JTextField txtCant;
    private javax.swing.JTextField txtProducto;
    // End of variables declaration//GEN-END:variables
}
