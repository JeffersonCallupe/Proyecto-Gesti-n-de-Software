/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package gcs;

import Clases.ListaCarrito;
import bdMYSQL.SqlPedido;
import javax.swing.JOptionPane;

/**
 *
 * @author Lenovo
 */
public class ProcesarPago extends javax.swing.JPanel {
    private static final String FUENTE = "Segoe UI";
    private static final String FUENTE1 = "Arial";
    private static final String SELECCIONE = "Seleccione una opción";
    
    public ProcesarPago() {
        initComponents();
        cboCIudad.addItem("Lima");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnTarjetas = new javax.swing.ButtonGroup();
        jtpPago = new javax.swing.JTabbedPane();
        pnlEnvio = new javax.swing.JPanel();
        javax.swing.JLabel lblDireccion = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        javax.swing.JLabel lblDistrito = new javax.swing.JLabel();
        cboCIudad = new javax.swing.JComboBox<>();
        javax.swing.JButton btnAceptarP = new javax.swing.JButton();
        javax.swing.JButton btnLimpiarP = new javax.swing.JButton();
        javax.swing.JButton btnRegresarP = new javax.swing.JButton();
        lblTituloPedido = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        org.edisoncor.gui.panel.PanelImage imgIcon = new org.edisoncor.gui.panel.PanelImage();
        pnlTarjetas = new javax.swing.JPanel();
        javax.swing.JLabel lblNumeroTarjeta = new javax.swing.JLabel();
        javax.swing.JLabel lblFecha = new javax.swing.JLabel();
        javax.swing.JLabel lblCVV = new javax.swing.JLabel();
        lblTituloTarjeta = new javax.swing.JLabel();
        pnlTarjeta1 = new org.edisoncor.gui.panel.PanelImage();
        rbtVisa = new javax.swing.JRadioButton();
        pnlTarjeta2 = new org.edisoncor.gui.panel.PanelImage();
        pnlTarjeta3 = new org.edisoncor.gui.panel.PanelImage();
        rbtMasterCard = new javax.swing.JRadioButton();
        rbtOh = new javax.swing.JRadioButton();
        lblTituloTarjeta1 = new javax.swing.JLabel();
        activar = new javax.swing.JCheckBox();
        javax.swing.JLabel lblNumeroTarjeta1 = new javax.swing.JLabel();
        btnFinalizar = new org.edisoncor.gui.button.ButtonRound();
        txtTarjeta = new javax.swing.JFormattedTextField();
        txtVencimiento = new javax.swing.JFormattedTextField();
        txtCVV = new javax.swing.JFormattedTextField();
        btnAtras = new javax.swing.JButton();
        rbtBBVA = new javax.swing.JRadioButton();
        pnlTarjeta4 = new org.edisoncor.gui.panel.PanelImage();
        pnlTarjeta5 = new org.edisoncor.gui.panel.PanelImage();
        rbtBBVA1 = new javax.swing.JRadioButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(835, 590));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlEnvio.setBackground(new java.awt.Color(255, 255, 255));
        pnlEnvio.setPreferredSize(new java.awt.Dimension(830, 520));
        pnlEnvio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblDireccion.setFont(new java.awt.Font(FUENTE, 0, 14));
        lblDireccion.setText("Dirección:");
        pnlEnvio.add(lblDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 220, -1, -1));
        pnlEnvio.add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 220, 270, -1));

        lblDistrito.setFont(new java.awt.Font(FUENTE, 0, 14));
        lblDistrito.setText("Ciudad");
        pnlEnvio.add(lblDistrito, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 170, -1, -1));

        cboCIudad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { SELECCIONE }));
        pnlEnvio.add(cboCIudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 170, 270, -1));

        btnAceptarP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/aprobar.png"))); // NOI18N
        btnAceptarP.setText("Continuar");
        btnAceptarP.setBorderPainted(false);
        btnAceptarP.setContentAreaFilled(false);
        btnAceptarP.addActionListener(evt -> btnAceptarPActionPerformed());
        pnlEnvio.add(btnAceptarP, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 300, -1, -1));

        btnLimpiarP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/limpieza-de-datos.png"))); // NOI18N
        btnLimpiarP.setText("Limpiar");
        btnLimpiarP.setBorderPainted(false);
        btnLimpiarP.setContentAreaFilled(false);
        btnLimpiarP.addActionListener(evt -> btnLimpiarPActionPerformed());
        pnlEnvio.add(btnLimpiarP, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 300, -1, -1));

        btnRegresarP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/VolverP.png"))); // NOI18N
        btnRegresarP.setText("Volver");
        btnRegresarP.setBorderPainted(false);
        btnRegresarP.setContentAreaFilled(false);
        btnRegresarP.addActionListener(evt -> btnRegresarPActionPerformed());
        pnlEnvio.add(btnRegresarP, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 360, -1, -1));

        lblTituloPedido.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lblTituloPedido.setForeground(new java.awt.Color(47, 58, 81));
        lblTituloPedido.setText("¿En dónde recibirás tu pedido?");
        pnlEnvio.add(lblTituloPedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 70, 430, 60));

        jPanel1.setBackground(new java.awt.Color(255, 153, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        imgIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconEmpresa.png"))); // NOI18N
        jPanel1.add(imgIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 180, 200));

        pnlEnvio.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 520));

        jtpPago.addTab("tab1", pnlEnvio);

        pnlTarjetas.setBackground(new java.awt.Color(255, 255, 255));
        pnlTarjetas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNumeroTarjeta.setFont(new java.awt.Font(FUENTE, 0, 14));
        lblNumeroTarjeta.setText("Numero de tarjeta:");
        pnlTarjetas.add(lblNumeroTarjeta, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 310, -1, -1));

        lblFecha.setFont(new java.awt.Font(FUENTE, 0, 14));
        lblFecha.setText("Fecha de Vencimiento:");
        pnlTarjetas.add(lblFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 360, -1, -1));

        lblCVV.setFont(new java.awt.Font(FUENTE, 0, 14));
        lblCVV.setText("CVV:");
        pnlTarjetas.add(lblCVV, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 360, -1, -1));

        lblTituloTarjeta.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lblTituloTarjeta.setForeground(new java.awt.Color(47, 58, 81));
        lblTituloTarjeta.setText("   ¿Cómo desea pagar?");
        pnlTarjetas.add(lblTituloTarjeta, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 380, 60));

        pnlTarjeta1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/visa.png"))); // NOI18N
        pnlTarjetas.add(pnlTarjeta1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 75, 50));

        btnTarjetas.add(rbtVisa);
        rbtVisa.setText("Visa");
        pnlTarjetas.add(rbtVisa, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, -1, -1));

        pnlTarjeta2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/mastercard.png"))); // NOI18N
        pnlTarjetas.add(pnlTarjeta2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 130, 80, 50));

        pnlTarjeta3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Oh.png"))); // NOI18N
        pnlTarjetas.add(pnlTarjeta3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 130, 80, 50));

        btnTarjetas.add(rbtMasterCard);
        rbtMasterCard.setText("MasterCard");
        pnlTarjetas.add(rbtMasterCard, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 190, -1, -1));

        btnTarjetas.add(rbtOh);
        rbtOh.setText("Oh");
        pnlTarjetas.add(rbtOh, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 190, -1, -1));

        lblTituloTarjeta1.setFont(new java.awt.Font("Arial", 1, 22)); // NOI18N
        lblTituloTarjeta1.setForeground(new java.awt.Color(47, 58, 81));
        lblTituloTarjeta1.setText("Datos de la tarjeta");
        pnlTarjetas.add(lblTituloTarjeta1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, 210, 60));

        activar.setFont(new java.awt.Font(FUENTE, 0, 13));
        activar.setForeground(new java.awt.Color(47, 58, 81));
        activar.setText("Active esta opción si deseas que se genere un reporte de compra");
        pnlTarjetas.add(activar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 410, 390, -1));

        lblNumeroTarjeta1.setFont(new java.awt.Font(FUENTE1, 0, 14));
        lblNumeroTarjeta1.setForeground(new java.awt.Color(153, 153, 153));
        lblNumeroTarjeta1.setText("Elija una tarjeta");
        pnlTarjetas.add(lblNumeroTarjeta1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 130, -1));

        btnFinalizar.setBackground(new java.awt.Color(255, 153, 0));
        btnFinalizar.setText("Finalizar Compra");
        btnFinalizar.setColorDeSombra(new java.awt.Color(85, 105, 204));
        btnFinalizar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnFinalizar.addActionListener(evt -> btnFinalizarActionPerformed());
        pnlTarjetas.add(btnFinalizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 410, 160, 40));

        try {
            txtTarjeta.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-####-####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        pnlTarjetas.add(txtTarjeta, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 310, 330, -1));

        try {
            txtVencimiento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        pnlTarjetas.add(txtVencimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 360, 90, -1));

        try {
            txtCVV.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#### ")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        pnlTarjetas.add(txtCVV, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 360, 60, -1));

        btnAtras.setText("Atrás");
        btnAtras.addActionListener(evt -> btnAtrasActionPerformed());

        pnlTarjetas.add(btnAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 440, -1, -1));

        btnTarjetas.add(rbtBBVA);
        rbtBBVA.setText("BBVA");
        pnlTarjetas.add(rbtBBVA, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 190, -1, -1));

        pnlTarjeta4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bbva.png"))); // NOI18N
        pnlTarjetas.add(pnlTarjeta4, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 130, 80, 50));

        pnlTarjeta5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/imgInterbank.png"))); // NOI18N
        pnlTarjetas.add(pnlTarjeta5, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 130, 80, 50));

        btnTarjetas.add(rbtBBVA1);
        rbtBBVA1.setText("Interbank");
        pnlTarjetas.add(rbtBBVA1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 190, -1, -1));

        jtpPago.addTab("tab2", pnlTarjetas);

        add(jtpPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -30, 830, 550));
    }// </editor-fold>//GEN-END:initComponents

    private boolean camposVacios(String txt1, String txt2) {
        return txt1.isEmpty() || txt2.isEmpty();
    }
    
    public void btnFinalizarActionPerformed(){
        String tipo;
        if (!rbtVisa.isSelected() && !rbtMasterCard.isSelected() && !rbtOh.isSelected()){
            JOptionPane.showMessageDialog(null, "Complete todos los datos.");
        }else{
            if (rbtVisa.isSelected())
                tipo = "Visa";
            else if (rbtMasterCard.isSelected())
                tipo = "MasterCard";
            else if (rbtOh.isSelected())
                tipo = "Oh";
            else
                tipo = "BBVA";
            
            SqlPedido ped = new SqlPedido();
            ped.guardarPedido();
            if (ped.guardarEnvio(cboCIudad.getSelectedItem().toString(), txtDireccion.getText())){
                
                JOptionPane.showMessageDialog(null, "Su compra se ha realizado con éxito.",
                "Compra realizada", JOptionPane.INFORMATION_MESSAGE);
                
                if (activar.isSelected()) {
                    ReporteSoloCompra reporteFrame = new ReporteSoloCompra();
                    reporteFrame.setVisible(true);
                }
                ListaCarrito.deleteCarrito();
                Catalogo cat = Catalogo.getInstance();
                cat.setIndex(0);
            }else
                JOptionPane.showMessageDialog(null, "Error al comprar",
                "Error de compra", JOptionPane.ERROR_MESSAGE);
        }
    
    }
    
    public void btnAtrasActionPerformed(){
        jtpPago.setSelectedIndex(0);
    }
    
    public void btnRegresarPActionPerformed(){
        Catalogo cat = Catalogo.getInstance();
        cat.activarCarrito();
    }
    
    private void btnAceptarPActionPerformed() {                                            
        String distrito = cboCIudad.getSelectedItem().toString();
        String direccion = txtDireccion.getText();
        if (camposVacios( distrito, direccion)) {
            JOptionPane.showMessageDialog(null, "Rellene todos los datos.");
        } else {
            jtpPago.setSelectedIndex(1);
        }
    }                                           

    private void btnLimpiarPActionPerformed() {                                            
        txtTarjeta.setText("");
        txtVencimiento.setText("");
        txtCVV.setText("");
        cboCIudad.setSelectedIndex(0);
        txtDireccion.setText("");    
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox activar;
    private javax.swing.JButton btnAtras;
    private org.edisoncor.gui.button.ButtonRound btnFinalizar;
    private javax.swing.ButtonGroup btnTarjetas;
    private javax.swing.JComboBox<String> cboCIudad;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTabbedPane jtpPago;
    private javax.swing.JLabel lblTituloPedido;
    private javax.swing.JLabel lblTituloTarjeta;
    private javax.swing.JLabel lblTituloTarjeta1;
    private javax.swing.JPanel pnlEnvio;
    private org.edisoncor.gui.panel.PanelImage pnlTarjeta1;
    private org.edisoncor.gui.panel.PanelImage pnlTarjeta2;
    private org.edisoncor.gui.panel.PanelImage pnlTarjeta3;
    private org.edisoncor.gui.panel.PanelImage pnlTarjeta4;
    private org.edisoncor.gui.panel.PanelImage pnlTarjeta5;
    private javax.swing.JPanel pnlTarjetas;
    private javax.swing.JRadioButton rbtBBVA;
    private javax.swing.JRadioButton rbtBBVA1;
    private javax.swing.JRadioButton rbtMasterCard;
    private javax.swing.JRadioButton rbtOh;
    private javax.swing.JRadioButton rbtVisa;
    private javax.swing.JFormattedTextField txtCVV;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JFormattedTextField txtTarjeta;
    private javax.swing.JFormattedTextField txtVencimiento;
    // End of variables declaration//GEN-END:variables
}
