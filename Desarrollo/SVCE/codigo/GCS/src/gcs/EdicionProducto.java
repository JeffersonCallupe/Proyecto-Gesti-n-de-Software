/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gcs;

import bdMYSQL.SqlProductos;
import javax.swing.JOptionPane;
import Clases.ListaProductos;

/**
 *
 * @author CRISTHIAN
 */
public class EdicionProducto extends javax.swing.JFrame {
    int ind;
    ventanaAdmin frame;
    protected int cantidad;
    private static final String FUENTE = "Segoe UI";
    public EdicionProducto() {
        initComponents();
        setLocationRelativeTo(null);
    }

    void generar(String nombre, int cant, double precio, int ind){
        txtProducto.setText(nombre);
        txtStock.setText(""+cant);
        txtPrecio.setText(""+precio);
        this.ind = ind;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.JPanel pnlContenedor = new javax.swing.JPanel();
        javax.swing.JLabel lblStock = new javax.swing.JLabel();
        txtStock = new javax.swing.JTextField();
        javax.swing.JLabel lblCantidad = new javax.swing.JLabel();
        javax.swing.JLabel lblProducto = new javax.swing.JLabel();
        txtProducto = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        javax.swing.JButton btnAceptar = new javax.swing.JButton();
        javax.swing.JButton btnCancelar = new javax.swing.JButton();
        javax.swing.JLabel lblSimbolo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(415, 201));
        setName("Editar"); // NOI18N
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlContenedor.setBackground(new java.awt.Color(255, 255, 255));
        pnlContenedor.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblStock.setFont(new java.awt.Font(FUENTE, 1, 13));
        lblStock.setForeground(new java.awt.Color(0, 0, 0));
        lblStock.setText("Stock");
        pnlContenedor.add(lblStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 95, 70, -1));

        txtStock.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtStock.setText("0");
        pnlContenedor.add(txtStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 90, 70, 30));

        lblCantidad.setFont(new java.awt.Font(FUENTE, 1, 13));
        lblCantidad.setForeground(new java.awt.Color(0, 0, 0));
        lblCantidad.setText("Precio");
        pnlContenedor.add(lblCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 95, 50, -1));

        lblProducto.setFont(new java.awt.Font(FUENTE, 1, 13));
        lblProducto.setForeground(new java.awt.Color(0, 0, 0));
        lblProducto.setText("Producto:");
        pnlContenedor.add(lblProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 70, -1));

        txtProducto.setEditable(false);
        txtProducto.setEnabled(false);
        pnlContenedor.add(txtProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, 230, 30));

        txtPrecio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtPrecio.setText("0");
        txtPrecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrecioKeyTyped(evt);
            }
        });
        pnlContenedor.add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 80, 30));

        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(evt -> btnAceptarActionPerformed());
        pnlContenedor.add(btnAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 100, -1));

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(evt -> btnCancelarActionPerformed());
        pnlContenedor.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 160, 90, -1));

        lblSimbolo.setFont(new java.awt.Font(FUENTE, 1, 13));
        lblSimbolo.setForeground(new java.awt.Color(0, 0, 0));
        lblSimbolo.setText("S/");
        pnlContenedor.add(lblSimbolo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 95, 20, -1));

        getContentPane().add(pnlContenedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 200));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPrecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioKeyTyped
	char c=evt.getKeyChar();
	if(Character.isLetter(c)) {
		getToolkit().beep();
		evt.consume();
	}
    }//GEN-LAST:event_txtPrecioKeyTyped
    
      private void btnAceptarActionPerformed() {  
        SqlProductos sqlProd = new SqlProductos();
        if (Integer.parseInt(txtStock.getText())> 0){
            ListaProductos.getDataList().get(ind).setStock(Integer.parseInt(txtStock.getText()));
        }else{
            int resp = JOptionPane.showConfirmDialog(null, "¿Está seguro de eliminar este producto?", "Eliminar producto", JOptionPane.YES_NO_OPTION);
            if (resp == 0){
                sqlProd.eliminarProducto(ListaProductos.getDataList().get(ind).getId_producto());
            }
        }
        if (Double.parseDouble(txtPrecio.getText())> 0){
            ListaProductos.getDataList().get(ind).setPrecio((float) Double.parseDouble(txtPrecio.getText()));
        }
        sqlProd.actualizarProducto(ListaProductos.getDataList().get(ind)); //Exception
        this.setVisible(false);
        frame.llenarProductos();
        frame.setEnabled(true);
        frame.toFront();
    }                                          

    private void btnCancelarActionPerformed() {                                            
        this.setVisible(false);
        frame.setEnabled(true);
        frame.toFront();
    }     
    
    public void setFrame (ventanaAdmin origen){
        this.frame = origen;
        frame.setEnabled(false);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EdicionProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new EdicionProducto().setVisible(true));

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtProducto;
    private javax.swing.JTextField txtStock;
    // End of variables declaration//GEN-END:variables
}
