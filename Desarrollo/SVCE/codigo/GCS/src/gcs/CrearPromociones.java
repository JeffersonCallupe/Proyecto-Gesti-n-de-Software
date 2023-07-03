/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gcs;

import bdMYSQL.SqlProductos;
import bdMYSQL.SqlPromocion;
import java.sql.SQLException;
import java.time.ZoneId;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import Clases.ListaProductos;
import Clases.Promocion;

/**
 *
 * @author Lenovo
 */
public class CrearPromociones extends javax.swing.JFrame {
    private static final String FUENTE1 = "Trebuchet MS";
    
    public CrearPromociones() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    public void llenarCombo (String tipo){
        DefaultComboBoxModel<String> modelo = new DefaultComboBoxModel<>();
        for (int i = 0; i < ListaProductos.getDataList().size(); i++) {
            if (tipo.equals(ListaProductos.getDataList().get(i).getTipo()))
                modelo.addElement(ListaProductos.getDataList().get(i).getDescripcion());
        }

        cboProductos.setModel(modelo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.JPanel jPanel2 = new javax.swing.JPanel();
        javax.swing.JLabel lblTitulo = new javax.swing.JLabel();
        javax.swing.JPanel line1 = new javax.swing.JPanel();
        javax.swing.JLabel lblFechaInicio = new javax.swing.JLabel();
        javax.swing.JLabel lblFechaFin = new javax.swing.JLabel();
        javax.swing.JLabel lblDescuentos = new javax.swing.JLabel();
        javax.swing.JLabel lblProductos = new javax.swing.JLabel();
        javax.swing.JLabel lblTipo = new javax.swing.JLabel();
        javax.swing.JLabel lblNaturaleza = new javax.swing.JLabel();
        jdtFechaFin = new com.toedter.calendar.JDateChooser();
        jdtFechaInicio = new com.toedter.calendar.JDateChooser();
        txtDescuento = new javax.swing.JTextField();
        cboProductos = new javax.swing.JComboBox<>();
        cboTipo = new javax.swing.JComboBox<>();
        javax.swing.JButton btnGuardar = new javax.swing.JButton();
        javax.swing.JButton btnCancelar = new javax.swing.JButton();
        cboNaturaleza = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        lblTitulo.setFont(new java.awt.Font(FUENTE1, 1, 24));
        lblTitulo.setForeground(new java.awt.Color(0, 0, 0));
        lblTitulo.setText("Crear Promocion");

        line1.setBackground(new java.awt.Color(255, 153, 0));

        lblFechaInicio.setForeground(new java.awt.Color(0, 0, 0));
        lblFechaInicio.setText("Fecha de inicio:");

        lblFechaFin.setForeground(new java.awt.Color(0, 0, 0));
        lblFechaFin.setText("Fecha de fin:");

        lblDescuentos.setForeground(new java.awt.Color(0, 0, 0));
        lblDescuentos.setText("Descuento:");

        lblProductos.setForeground(new java.awt.Color(0, 0, 0));
        lblProductos.setText("Productos incluidos:");

        lblTipo.setForeground(new java.awt.Color(0, 0, 0));
        lblTipo.setText("Tipo");

        lblNaturaleza.setForeground(new java.awt.Color(0, 0, 0));
        lblNaturaleza.setText("Naturaleza de la promocion:");

        txtDescuento.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDescuentoFocusLost(evt);
            }
        });
        txtDescuento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDescuentoKeyTyped(evt);
            }
        });

        cboProductos.addFocusListener(new java.awt.event.FocusAdapter() {
            @Override
            public void focusGained(java.awt.event.FocusEvent evt) {
                cboProductosFocusGained();
            }
        });

        cboTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tarjeta gráfica", "Procesador", "Mouse", "Impresora", "Auricular", "Teclado" }));
        cboTipo.setSelectedIndex(-1);
        cboTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboTipoActionPerformed(evt);
            }
        });

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(evt -> btnGuardarActionPerformed());

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(evt -> btnCancelarActionPerformed());

        cboNaturaleza.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "S/", "%" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblFechaInicio)
                    .addComponent(lblFechaFin)
                    .addComponent(lblDescuentos)
                    .addComponent(lblProductos)
                    .addComponent(lblTipo)
                    .addComponent(lblNaturaleza))
                .addGap(44, 44, 44)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jdtFechaFin, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cboTipo, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtDescuento)
                    .addComponent(jdtFechaInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cboProductos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cboNaturaleza, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(67, 67, 67))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addComponent(btnGuardar)
                        .addGap(121, 121, 121)
                        .addComponent(btnCancelar))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(194, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 40, Short.MAX_VALUE)
                    .addComponent(line1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 40, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTipo)
                    .addComponent(cboTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblProductos)
                    .addComponent(cboProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNaturaleza)
                    .addComponent(cboNaturaleza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblDescuentos)
                    .addComponent(txtDescuento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblFechaInicio)
                        .addGap(25, 25, 25)
                        .addComponent(lblFechaFin))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jdtFechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jdtFechaFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar)
                    .addComponent(btnCancelar))
                .addGap(50, 50, 50))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 69, Short.MAX_VALUE)
                    .addComponent(line1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 415, Short.MAX_VALUE)))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cboTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboTipoActionPerformed
        String seleccionado = cboTipo.getSelectedItem().toString();
        llenarCombo(seleccionado);
    }//GEN-LAST:event_cboTipoActionPerformed

    private void txtDescuentoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDescuentoKeyTyped
        char c = evt.getKeyChar();
        if(Character.isLetter(c)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtDescuentoKeyTyped

    private void txtDescuentoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDescuentoFocusLost
        if (cboNaturaleza.getSelectedItem().toString().equals("%") && (Integer.parseInt(txtDescuento.getText())>100 || Integer.parseInt(txtDescuento.getText()) <= 0)){
            JOptionPane.showMessageDialog(null,"Agregue un descuento válido.", "Descuento no valido", JOptionPane.ERROR_MESSAGE);
            txtDescuento.setText("");
        }
    }//GEN-LAST:event_txtDescuentoFocusLost
    
    private void btnCancelarActionPerformed() {                                            
        this.dispose();
    }                                           

    private void cboProductosFocusGained() {                                         
        
    }                                        

    private void btnGuardarActionPerformed() {                                           
        int idPromocion = -1;
        try {
            Promocion promocion = new Promocion();
            SqlPromocion prom = new SqlPromocion();
            promocion.setTipo(cboNaturaleza.getSelectedItem().toString());
            promocion.setDescuento(Integer.parseInt(txtDescuento.getText()));
            promocion.setFechaInicio(jdtFechaInicio.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
            promocion.setFechaFin(jdtFechaFin.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
            idPromocion = prom.insertarPromocion(promocion);
            JOptionPane.showMessageDialog(null,"Promoción creada correctamente", "Promoción creada", JOptionPane.INFORMATION_MESSAGE);
            this.dispose();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,ex, "Error de promoción", JOptionPane.ERROR_MESSAGE);
        }
        int idProducto = ListaProductos.getId(cboProductos.getSelectedItem().toString());
            SqlProductos prod = new SqlProductos();
            prod.asignarPromocion(idProducto, idPromocion);
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
            java.util.logging.Logger.getLogger(CrearPromociones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new CrearPromociones().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cboNaturaleza;
    private javax.swing.JComboBox<String> cboProductos;
    private javax.swing.JComboBox<String> cboTipo;
    private com.toedter.calendar.JDateChooser jdtFechaFin;
    private com.toedter.calendar.JDateChooser jdtFechaInicio;
    private javax.swing.JTextField txtDescuento;
    // End of variables declaration//GEN-END:variables
}
