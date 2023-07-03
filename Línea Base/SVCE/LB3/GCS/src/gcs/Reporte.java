
package gcs;

import Clases.ListaCarrito;
import java.sql.*;
import bdMYSQL.ConexionBD;
import java.sql.Connection;
import java.util.Arrays;
import javax.swing.table.DefaultTableModel;

public class Reporte extends javax.swing.JFrame {
    private static Reporte instance;
    
    public Reporte() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        //llenarTabla();
    }
    
    public static Reporte getInstance() {
        if (instance == null) {
            instance = new Reporte();
        }
        return instance;
    }
    
protected void llenarTabla() {
    int idCliente = ListaCarrito.getIdCliente();
    ConexionBD conexionBD = new ConexionBD();
    Connection conexion = conexionBD.conectar();
    ResultSet resultado;
    DefaultTableModel modelo = new DefaultTableModel();
    modelo.addColumn("Fecha");
    modelo.addColumn("Descripción");
    modelo.addColumn("Marca");
    modelo.addColumn("Tipo");
    modelo.addColumn("Cantidad");
    modelo.addColumn("Precio Unitario");

    String consulta = "SELECT v.fecha, p.descripcion, p.marca, p.tipo, v.cantidad, v.precio " +
            "FROM venta v " +
            "JOIN producto p ON v.id_producto = p.id_producto " +
            "WHERE v.id_cliente = ? " +
            "ORDER BY v.id_venta";

    try (PreparedStatement st = conexion.prepareStatement(consulta)){
        st.setInt(1, idCliente);
        resultado = st.executeQuery();
        while (resultado.next()) {
            Object[] fila = new Object[6];
            fila[0] = resultado.getDate("fecha");
            fila[1] = resultado.getString("descripcion");
            fila[2] = resultado.getString("marca");
            fila[3] = resultado.getString("tipo");
            fila[4] = resultado.getInt("cantidad");
            fila[5] = resultado.getDouble("precio");
            System.out.println("" + Arrays.toString(fila));
            modelo.addRow(fila);
        }
        resultado.close();
        st.close();
        conexion.close();
    } catch (SQLException e) {
        // Manejo de excepción
    }
    jReporte.setModel(modelo);
}



    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.JPanel jPanel2 = new javax.swing.JPanel();
        javax.swing.JLabel jLabel1 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel2 = new javax.swing.JLabel();
        javax.swing.JSeparator jSeparator1 = new javax.swing.JSeparator();
        javax.swing.JPanel jPanel1 = new javax.swing.JPanel();
        javax.swing.JScrollPane jScrollPane1 = new javax.swing.JScrollPane();
        jReporte = new javax.swing.JTable();
        javax.swing.JButton btnVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(238, 238, 238));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel1.setText("Historial de compras ");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 280, 50));

        jLabel2.setBackground(new java.awt.Color(204, 255, 204));
        jLabel2.setFont(new java.awt.Font("Microsoft Tai Le", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(74, 197, 238));
        jLabel2.setText("Detalles");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        jSeparator1.setBackground(new java.awt.Color(51, 204, 255));
        jSeparator1.setForeground(new java.awt.Color(74, 197, 238));
        jSeparator1.setAlignmentX(0.8F);
        jSeparator1.setOpaque(true);
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 760, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 204, 255)));

        jReporte.setForeground(new java.awt.Color(102, 102, 255));
        jReporte.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Fecha", "Descripción", "Marca", "Talla", "Cantidad", "Precio Unitario"
            }
        ));
        jReporte.setAlignmentX(1.0F);
        jReporte.setAlignmentY(2.0F);
        jReporte.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jReporte.setEnabled(false);
        jReporte.setGridColor(new java.awt.Color(153, 204, 255));
        jReporte.setRowHeight(40);
        jReporte.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jReporte);
        if (jReporte.getColumnModel().getColumnCount() > 0) {
            jReporte.getColumnModel().getColumn(0).setResizable(false);
            jReporte.getColumnModel().getColumn(0).setPreferredWidth(60);
            jReporte.getColumnModel().getColumn(1).setResizable(false);
            jReporte.getColumnModel().getColumn(1).setPreferredWidth(180);
            jReporte.getColumnModel().getColumn(2).setResizable(false);
            jReporte.getColumnModel().getColumn(2).setPreferredWidth(100);
            jReporte.getColumnModel().getColumn(3).setResizable(false);
            jReporte.getColumnModel().getColumn(3).setPreferredWidth(50);
            jReporte.getColumnModel().getColumn(4).setResizable(false);
            jReporte.getColumnModel().getColumn(4).setPreferredWidth(50);
            jReporte.getColumnModel().getColumn(5).setResizable(false);
            jReporte.getColumnModel().getColumn(5).setPreferredWidth(50);
        }

        btnVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/FlechaVolver.png"))); // NOI18N
        btnVolver.setText("Volver");
        btnVolver.setBorderPainted(false);
        btnVolver.setContentAreaFilled(false);
        btnVolver.addActionListener(evt -> btnVolverActionPerformed());

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 716, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(314, 314, 314)
                .addComponent(btnVolver)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 730, 420));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 762, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 555, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed() {                                          
        Catalogo.getInstance().setVisible(true); 
        this.setVisible(false); 
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
            java.util.logging.Logger.getLogger(Reporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new Reporte().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable jReporte;
    // End of variables declaration//GEN-END:variables
 
}
