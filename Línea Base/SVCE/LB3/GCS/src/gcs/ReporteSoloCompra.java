
package gcs;
import javax.swing.table.DefaultTableModel;
import Clases.ListaCarrito;

public class ReporteSoloCompra extends javax.swing.JFrame {
    private static final String FUENTE1 = "Arial";
    private static final String FUENTE2 = "Segoe UI";
    
    public ReporteSoloCompra() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
         // Llamar al método para llenar la tabla
        llenarTabla();  
    }
    
     private void llenarTabla() {
        // Crear el modelo de tabla
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Descripción");
        modelo.addColumn("Marca");
        modelo.addColumn("Talla");
        modelo.addColumn("Cantidad");
        modelo.addColumn("Precio Unitario");
        modelo.addColumn("Subtotal");

            for( int i=0;i<ListaCarrito.getSize();i++){
                Object[] fila = new Object[6];
                fila[0] = ListaCarrito.getDataList().get(i).getProducto().getDescripcion();
                fila[1] = ListaCarrito.getDataList().get(i).getProducto().getMarca();
                fila[2] = ListaCarrito.getDataList().get(i).getProducto().getTipo();
                fila[3] = ListaCarrito.getDataList().get(i).getCantidad();
                fila[4] = ListaCarrito.getDataList().get(i).getProducto().getDescuento();
                double precioCantidad = ListaCarrito.getDataList().get(i).getCantidad()*ListaCarrito.getDataList().get(i).getProducto().getDescuento();
                fila[5] = precioCantidad;
              
                modelo.addRow(fila);
            }
        jReporte.setModel(modelo);
        
        total.setText(" " +ListaCarrito.getTotal());        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.JPanel jPanel1 = new javax.swing.JPanel();
        javax.swing.JLabel lblTituloPedido = new javax.swing.JLabel();
        javax.swing.JScrollPane jScrollPane1 = new javax.swing.JScrollPane();
        jReporte = new javax.swing.JTable();
        javax.swing.JLabel lblTituloPedido1 = new javax.swing.JLabel();
        javax.swing.JLabel lblTituloPedido2 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel1 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel2 = new javax.swing.JLabel();
        javax.swing.JSeparator jSeparator1 = new javax.swing.JSeparator();
        javax.swing.JPanel jPanel2 = new javax.swing.JPanel();
        javax.swing.JButton btnVolver = new javax.swing.JButton();
        org.edisoncor.gui.panel.PanelImage imgIcon = new org.edisoncor.gui.panel.PanelImage();
        javax.swing.JLabel jLabel3 = new javax.swing.JLabel();
        total = new javax.swing.JLabel();
        javax.swing.JSeparator jSeparator2 = new javax.swing.JSeparator();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTituloPedido.setFont(new java.awt.Font(FUENTE1, 1, 14));
        lblTituloPedido.setForeground(new java.awt.Color(255, 255, 255));
        lblTituloPedido.setText("Dirección: Los Cedros 209,  San Isidro Lima ");
        jPanel1.add(lblTituloPedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 90, 320, 20));

        jReporte.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Descripción", "Marca", "Talla", "Cantidad", "Precio Unitario"
            }
        ));
        jReporte.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jReporte);
        if (jReporte.getColumnModel().getColumnCount() > 0) {
            jReporte.getColumnModel().getColumn(0).setResizable(false);
            jReporte.getColumnModel().getColumn(0).setPreferredWidth(250);
            jReporte.getColumnModel().getColumn(1).setResizable(false);
            jReporte.getColumnModel().getColumn(1).setPreferredWidth(150);
            jReporte.getColumnModel().getColumn(2).setResizable(false);
            jReporte.getColumnModel().getColumn(2).setPreferredWidth(100);
            jReporte.getColumnModel().getColumn(3).setResizable(false);
            jReporte.getColumnModel().getColumn(3).setPreferredWidth(100);
            jReporte.getColumnModel().getColumn(4).setResizable(false);
            jReporte.getColumnModel().getColumn(4).setPreferredWidth(150);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, 590, 200));

        lblTituloPedido1.setFont(new java.awt.Font(FUENTE1, 1, 32));
        lblTituloPedido1.setForeground(new java.awt.Color(255, 255, 255));
        lblTituloPedido1.setText("REPORTE DE COMPRA");
        jPanel1.add(lblTituloPedido1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 40, 380, 60));

        lblTituloPedido2.setFont(new java.awt.Font(FUENTE1, 1, 14));
        lblTituloPedido2.setForeground(new java.awt.Color(255, 255, 255));
        lblTituloPedido2.setText("Celular: 923 869 298");
        jPanel1.add(lblTituloPedido2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 110, 140, 20));

        jLabel1.setFont(new java.awt.Font(FUENTE2, 2, 12));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/instagram.png"))); // NOI18N
        jLabel1.setText("TechSales");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 150, -1, -1));

        jLabel2.setFont(new java.awt.Font(FUENTE2, 2, 12));
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/mensajero.png"))); // NOI18N
        jLabel2.setText("TechSales");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 150, -1, -1));

        jSeparator1.setForeground(new java.awt.Color(102, 102, 255));
        jSeparator1.setAlignmentX(1.5F);
        jSeparator1.setAlignmentY(1.5F);
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 490, 470, 30));

        jPanel2.setBackground(new java.awt.Color(255, 153, 0));
        jPanel2.setForeground(new java.awt.Color(255, 153, 0));

        btnVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/FlechaVolver.png"))); // NOI18N
        btnVolver.setBorderPainted(false);
        btnVolver.setContentAreaFilled(false);
        btnVolver.addActionListener(evt -> btnVolverActionPerformed());

        imgIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconEmpresa.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(imgIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 475, Short.MAX_VALUE)
                .addComponent(btnVolver)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(imgIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 240));

        jLabel3.setFont(new java.awt.Font(FUENTE2, 1, 14));
        jLabel3.setText("TOTAL");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 480, -1, -1));

        total.setFont(new java.awt.Font(FUENTE2, 1, 16));
        jPanel1.add(total, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 470, 110, 30));

        jSeparator2.setForeground(new java.awt.Color(102, 102, 255));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 720, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 521, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    private void btnVolverActionPerformed() {                                          
        Catalogo.getInstance().setVisible(true); 
        this.dispose(); 
    } 
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
            java.util.logging.Logger.getLogger(ReporteSoloCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new ReporteSoloCompra().setVisible(true));
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable jReporte;
    private javax.swing.JLabel total;
    // End of variables declaration//GEN-END:variables
}
