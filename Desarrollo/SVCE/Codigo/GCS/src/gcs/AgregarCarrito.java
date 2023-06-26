/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gcs;

import Clases.ListaCompras;
import Clases.Producto;
import Clases.Usuario;
import Clases.compras;
import java.awt.Color;
import java.time.LocalDate;
import javax.swing.JOptionPane;

/**
 *
 * @author CRISTHIAN
 */
public class AgregarCarrito extends javax.swing.JFrame {
    int i = 0;
    int coordX, coordY;
    Producto prod;
    Usuario usr;
    Catalogo frame;
    public AgregarCarrito() {
        this.setUndecorated(true);
        this.setBackground(new Color (0,0,0,0));
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
     public void setFrame (Catalogo cat){
        this.frame = cat;
        frame.setEnabled(false);
    }
    
    public void setUsuario (Usuario usr){
        this.usr = usr;
    }
     
    void iniciarComponentes(Producto producto){
        prod = producto;
        lblDescripcion.setText(strHTML(producto.getDescripcion()));
        lblMarca.setText(producto.getMarca());
        imgProducto.setIcon(new javax.swing.ImageIcon (getClass().getResource(producto.getImage())));
        imgProducto.repaint();
        lblPrecio.setText("S/ " + producto.getPrecio());
    }
    
    public String strHTML (String text){
        return "<html><p>" + text + "</p></html>";
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contenedor = new images.PanelRound1();
        imgProducto = new org.edisoncor.gui.panel.PanelImage();
        lblTitulo = new javax.swing.JLabel();
        lblTDescripcion = new javax.swing.JLabel();
        lblDescripcion = new javax.swing.JLabel();
        lblPrecio = new javax.swing.JLabel();
        lblTPrecio = new javax.swing.JLabel();
        lblTMarca = new javax.swing.JLabel();
        lblMarca = new javax.swing.JLabel();
        txtCant = new javax.swing.JTextField();
        lblMenos = new javax.swing.JLabel();
        lblMas = new javax.swing.JLabel();
        btnMenos = new javax.swing.JButton();
        btnMas = new javax.swing.JButton();
        lblTCantidad = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(470, 420));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        contenedor.setBackground(new java.awt.Color(255, 153, 0));
        contenedor.setRoundBottomLeft(40);
        contenedor.setRoundBottomRight(40);
        contenedor.setRoundTopLeft(40);
        contenedor.setRoundTopRight(40);
        contenedor.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                contenedorMouseDragged(evt);
            }
        });
        contenedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                contenedorMousePressed(evt);
            }
        });
        contenedor.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout imgProductoLayout = new javax.swing.GroupLayout(imgProducto);
        imgProducto.setLayout(imgProductoLayout);
        imgProductoLayout.setHorizontalGroup(
            imgProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );
        imgProductoLayout.setVerticalGroup(
            imgProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );

        contenedor.add(imgProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 150, 150));

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(229, 229, 229));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("AGREGAR AL CARRITO");
        contenedor.add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 280, -1));

        lblTDescripcion.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblTDescripcion.setForeground(new java.awt.Color(229, 229, 229));
        lblTDescripcion.setText("Descripción");
        contenedor.add(lblTDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, 90, -1));

        lblDescripcion.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblDescripcion.setForeground(new java.awt.Color(229, 229, 229));
        contenedor.add(lblDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 120, 210, 60));

        lblPrecio.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblPrecio.setForeground(new java.awt.Color(229, 229, 229));
        contenedor.add(lblPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 270, 100, 40));

        lblTPrecio.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblTPrecio.setForeground(new java.awt.Color(229, 229, 229));
        lblTPrecio.setText("Precio");
        contenedor.add(lblTPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 250, 90, -1));

        lblTMarca.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblTMarca.setForeground(new java.awt.Color(229, 229, 229));
        lblTMarca.setText("Marca");
        contenedor.add(lblTMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 190, 90, -1));

        lblMarca.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblMarca.setForeground(new java.awt.Color(229, 229, 229));
        contenedor.add(lblMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 220, 210, 20));

        txtCant.setEditable(false);
        txtCant.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtCant.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCant.setText("0");
        contenedor.add(txtCant, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 280, 40, 30));

        lblMenos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblMenos.setText("-");
        contenedor.add(lblMenos, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, -1, -1));

        lblMas.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblMas.setText("+");
        contenedor.add(lblMas, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 280, -1, -1));

        btnMenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenosActionPerformed(evt);
            }
        });
        contenedor.add(btnMenos, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 30, 30));

        btnMas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMasActionPerformed(evt);
            }
        });
        contenedor.add(btnMas, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 280, 30, 30));

        lblTCantidad.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblTCantidad.setForeground(new java.awt.Color(229, 229, 229));
        lblTCantidad.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTCantidad.setText("Cantidad");
        contenedor.add(lblTCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, 90, -1));

        btnCancelar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        contenedor.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 350, 110, 40));

        btnAgregar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        contenedor.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 350, 110, 40));

        getContentPane().add(contenedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenosActionPerformed
        if (Integer.parseInt(txtCant.getText())> 0){
            i--;
            txtCant.setText(""+i);
        }
    }//GEN-LAST:event_btnMenosActionPerformed

    private void btnMasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMasActionPerformed
        if (Integer.parseInt(txtCant.getText())< 10){
            i++;
            txtCant.setText(""+i);
        }
    }//GEN-LAST:event_btnMasActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
        frame.setEnabled(true);
        frame.toFront();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void contenedorMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contenedorMouseDragged
        this.setLocation(this.getLocation().x + evt.getX() - coordX, this.getLocation().y + evt.getY() - coordY);
    }//GEN-LAST:event_contenedorMouseDragged

    private void contenedorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contenedorMousePressed
        coordX = evt.getX();
        coordY = evt.getY();
    }//GEN-LAST:event_contenedorMousePressed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        ListaCompras list = new ListaCompras();
        list.setIdProducto(prod.getId_producto());
        if (usr != null){
            list.setIdCliente(usr.getId_cliente());
            list.setNombre(prod.getDescripcion());
            list.setFecha(LocalDate.now());
            list.setCantidad(Integer.parseInt(txtCant.getText()));
            list.setPrecio(prod.getPrecio());
            compras.productos.add(list);
            JOptionPane.showMessageDialog(null, "Añadido a su carrito.");
            this.setVisible(false);
            frame.setEnabled(true);
            frame.toFront(); 
        }
        else{
            this.setVisible(false);
            frame.dispose();
            JOptionPane.showMessageDialog(null, "Inicie sesión para continuar.");
            Login log = new Login ();
            log.setVisible(true);
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

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
            java.util.logging.Logger.getLogger(AgregarCarrito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgregarCarrito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgregarCarrito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgregarCarrito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgregarCarrito().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnMas;
    private javax.swing.JButton btnMenos;
    private images.PanelRound1 contenedor;
    private org.edisoncor.gui.panel.PanelImage imgProducto;
    private javax.swing.JLabel lblDescripcion;
    private javax.swing.JLabel lblMarca;
    private javax.swing.JLabel lblMas;
    private javax.swing.JLabel lblMenos;
    private javax.swing.JLabel lblPrecio;
    private javax.swing.JLabel lblTCantidad;
    private javax.swing.JLabel lblTDescripcion;
    private javax.swing.JLabel lblTMarca;
    private javax.swing.JLabel lblTPrecio;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextField txtCant;
    // End of variables declaration//GEN-END:variables
}
