package gcs;

import Clases.Usuario;
import bdMYSQL.Hash;
import bdMYSQL.SqlUsers;
import java.awt.Cursor;
import static java.awt.Frame.HAND_CURSOR;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Grupo 6
 */
public class Registro extends javax.swing.JFrame {
    public static String usuarios [];
    public static String contra [];
    Login log = new Login();
    int coordX, coordY; //Para mover el form
    
    public Registro() {
        initComponents();
        setLocationRelativeTo(null);
        btnRegistrar.setCursor(new Cursor(HAND_CURSOR));
        btnCancelar.setCursor(new Cursor(HAND_CURSOR));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contenedor = new javax.swing.JPanel();
        btnRegistrar = new images.PanelRound1();
        lblRegistrar = new javax.swing.JLabel();
        panelCorreo = new images.PanelRound1();
        lblCorreo = new javax.swing.JLabel();
        imgCorreo = new org.edisoncor.gui.panel.PanelImage();
        txtCorreo = new javax.swing.JTextField();
        namePanel = new images.PanelRound1();
        lblN = new javax.swing.JLabel();
        txtN = new javax.swing.JTextField();
        imgUser = new org.edisoncor.gui.panel.PanelImage();
        apellidoPanel = new images.PanelRound1();
        lblA = new javax.swing.JLabel();
        txtA = new javax.swing.JTextField();
        imgUser1 = new org.edisoncor.gui.panel.PanelImage();
        panelDNI = new images.PanelRound1();
        lblDNI = new javax.swing.JLabel();
        txtD = new javax.swing.JTextField();
        imgDNI = new org.edisoncor.gui.panel.PanelImage();
        panelTel = new images.PanelRound1();
        imgTel = new org.edisoncor.gui.panel.PanelImage();
        lblD1 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        panelContraseña = new images.PanelRound1();
        lblContraseña = new javax.swing.JLabel();
        imgContraseña = new org.edisoncor.gui.panel.PanelImage();
        txtPass = new javax.swing.JPasswordField();
        panelContraseña2 = new images.PanelRound1();
        lblContraseña1 = new javax.swing.JLabel();
        imgContraseña1 = new org.edisoncor.gui.panel.PanelImage();
        txtPass2 = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        btnCancelar = new images.PanelRound1();
        lblCancelar = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(720, 562));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        contenedor.setBackground(new java.awt.Color(255, 255, 255));
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

        btnRegistrar.setBackground(new java.awt.Color(255, 153, 0));
        btnRegistrar.setRoundBottomLeft(35);
        btnRegistrar.setRoundBottomRight(35);
        btnRegistrar.setRoundTopLeft(35);
        btnRegistrar.setRoundTopRight(35);
        btnRegistrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRegistrarMouseClicked(evt);
            }
        });
        btnRegistrar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblRegistrar.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lblRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        lblRegistrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRegistrar.setText("REGISTRAR");
        btnRegistrar.add(lblRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 12, 90, -1));

        contenedor.add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 480, 240, 45));

        panelCorreo.setBackground(new java.awt.Color(243, 246, 251));
        panelCorreo.setRoundBottomLeft(15);
        panelCorreo.setRoundBottomRight(15);
        panelCorreo.setRoundTopLeft(15);
        panelCorreo.setRoundTopRight(15);
        panelCorreo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblCorreo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblCorreo.setForeground(new java.awt.Color(90, 90, 90));
        lblCorreo.setText("Correo electrónico");
        panelCorreo.add(lblCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 110, -1));

        imgCorreo.setBackground(new java.awt.Color(255, 255, 255));
        imgCorreo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/correoE.png"))); // NOI18N
        panelCorreo.add(imgCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(235, 10, 40, 40));

        txtCorreo.setBackground(new java.awt.Color(243, 246, 251));
        txtCorreo.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        txtCorreo.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        panelCorreo.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 200, 25));

        contenedor.add(panelCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 280, 290, 60));

        namePanel.setBackground(new java.awt.Color(243, 246, 251));
        namePanel.setRoundBottomLeft(15);
        namePanel.setRoundBottomRight(15);
        namePanel.setRoundTopLeft(15);
        namePanel.setRoundTopRight(15);
        namePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblN.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblN.setForeground(new java.awt.Color(90, 90, 90));
        lblN.setText("Nombre");
        namePanel.add(lblN, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 70, -1));

        txtN.setBackground(new java.awt.Color(243, 246, 251));
        txtN.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        txtN.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        namePanel.add(txtN, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 200, 25));

        imgUser.setBackground(new java.awt.Color(255, 255, 255));
        imgUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/nombreApellido.jpg"))); // NOI18N
        namePanel.add(imgUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 15, 30, 30));

        contenedor.add(namePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 290, 60));

        apellidoPanel.setBackground(new java.awt.Color(243, 246, 251));
        apellidoPanel.setRoundBottomLeft(15);
        apellidoPanel.setRoundBottomRight(15);
        apellidoPanel.setRoundTopLeft(15);
        apellidoPanel.setRoundTopRight(15);
        apellidoPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblA.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblA.setForeground(new java.awt.Color(90, 90, 90));
        lblA.setText("Apellido");
        apellidoPanel.add(lblA, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 70, -1));

        txtA.setBackground(new java.awt.Color(243, 246, 251));
        txtA.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        txtA.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        apellidoPanel.add(txtA, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 200, 25));

        imgUser1.setBackground(new java.awt.Color(255, 255, 255));
        imgUser1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/nombreApellido.jpg"))); // NOI18N
        apellidoPanel.add(imgUser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 15, 30, 30));

        contenedor.add(apellidoPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 120, 280, 60));

        panelDNI.setBackground(new java.awt.Color(243, 246, 251));
        panelDNI.setRoundBottomLeft(15);
        panelDNI.setRoundBottomRight(15);
        panelDNI.setRoundTopLeft(15);
        panelDNI.setRoundTopRight(15);
        panelDNI.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblDNI.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblDNI.setForeground(new java.awt.Color(90, 90, 90));
        lblDNI.setText("DNI");
        panelDNI.add(lblDNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 70, -1));

        txtD.setBackground(new java.awt.Color(243, 246, 251));
        txtD.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        txtD.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        panelDNI.add(txtD, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 200, 25));

        imgDNI.setBackground(new java.awt.Color(255, 255, 255));
        imgDNI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/dni.jpg"))); // NOI18N
        panelDNI.add(imgDNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 15, 30, 30));

        contenedor.add(panelDNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, 290, 60));

        panelTel.setBackground(new java.awt.Color(243, 246, 251));
        panelTel.setRoundBottomLeft(15);
        panelTel.setRoundBottomRight(15);
        panelTel.setRoundTopLeft(15);
        panelTel.setRoundTopRight(15);
        panelTel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        imgTel.setBackground(new java.awt.Color(255, 255, 255));
        imgTel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/telefono.png"))); // NOI18N
        panelTel.add(imgTel, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, 35, 35));

        lblD1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblD1.setForeground(new java.awt.Color(90, 90, 90));
        lblD1.setText("Telefono");
        panelTel.add(lblD1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 70, -1));

        txtTelefono.setBackground(new java.awt.Color(243, 246, 251));
        txtTelefono.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        txtTelefono.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        panelTel.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 200, 25));

        contenedor.add(panelTel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, 290, 60));

        panelContraseña.setBackground(new java.awt.Color(243, 246, 251));
        panelContraseña.setRoundBottomLeft(15);
        panelContraseña.setRoundBottomRight(15);
        panelContraseña.setRoundTopLeft(15);
        panelContraseña.setRoundTopRight(15);
        panelContraseña.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblContraseña.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblContraseña.setForeground(new java.awt.Color(90, 90, 90));
        lblContraseña.setText("Contraseña");
        panelContraseña.add(lblContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 110, -1));

        imgContraseña.setBackground(new java.awt.Color(255, 255, 255));
        imgContraseña.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/contraseña.png"))); // NOI18N
        panelContraseña.add(imgContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 12, 35, 35));

        txtPass.setBackground(new java.awt.Color(243, 246, 251));
        txtPass.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        txtPass.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        panelContraseña.add(txtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 200, 25));

        contenedor.add(panelContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 360, 290, 60));

        panelContraseña2.setBackground(new java.awt.Color(243, 246, 251));
        panelContraseña2.setRoundBottomLeft(15);
        panelContraseña2.setRoundBottomRight(15);
        panelContraseña2.setRoundTopLeft(15);
        panelContraseña2.setRoundTopRight(15);
        panelContraseña2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblContraseña1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblContraseña1.setForeground(new java.awt.Color(90, 90, 90));
        lblContraseña1.setText("Confirmar contraseña");
        panelContraseña2.add(lblContraseña1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 130, -1));

        imgContraseña1.setBackground(new java.awt.Color(255, 255, 255));
        imgContraseña1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/contraseña.png"))); // NOI18N
        panelContraseña2.add(imgContraseña1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 12, 35, 35));

        txtPass2.setBackground(new java.awt.Color(243, 246, 251));
        txtPass2.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        txtPass2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        panelContraseña2.add(txtPass2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 200, 25));

        contenedor.add(panelContraseña2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 360, 290, 60));

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Empecemos...");
        contenedor.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 540, 50));

        btnCancelar.setBackground(new java.awt.Color(221, 230, 237));
        btnCancelar.setRoundBottomLeft(35);
        btnCancelar.setRoundBottomRight(35);
        btnCancelar.setRoundTopLeft(35);
        btnCancelar.setRoundTopRight(35);
        btnCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCancelarMouseClicked(evt);
            }
        });
        btnCancelar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblCancelar.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lblCancelar.setForeground(new java.awt.Color(153, 153, 153));
        lblCancelar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCancelar.setText("CANCELAR");
        btnCancelar.add(lblCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 120, -1));

        contenedor.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 480, 200, 45));

        getContentPane().add(contenedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void setFrame(Login log){
        this.log = log;
        this.log.setEnabled(false);
    }
    
    private String crear(String nombre, String apellido){
        String [] nom;
        String [] apell;
        String correo;
        nom = nombre.split("\\s+"); //Separa los nombres por fragmentos en base a los espacios
        apell = apellido.split("\\s+");//Separa los apellidos por fragmentos en base a los espacios
        correo = (nom[0] + "." + apell[0] + "@techsales.com"); //Concatena el primer nombre y primer apellido.
        correo = correo.toLowerCase(); //Coloca en minusculas todo el correo.
        return correo; //Retorna el correo
    }
    
    private void btnRegistrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarMouseClicked
        SqlUsers mod = new SqlUsers();
        String nombre = txtN.getText(), apellido = txtA.getText(), dni = txtD.getText(), tel = txtTelefono.getText();
        String correoE = txtCorreo.getText(), correo, pass = new String (txtPass.getPassword());
        if (nombre.isEmpty() || apellido.isEmpty() || dni.isEmpty() || correoE.isEmpty() || tel.isEmpty())
            JOptionPane.showMessageDialog(null, "Rellene todos los datos.","Erro de registro", JOptionPane.ERROR_MESSAGE);
        else{
            if (pass.equals(new String (txtPass2.getPassword()))){
                correo = crear (nombre, apellido); //Genera un correo en base a su nombre y apellido
                pass = Hash.getSHA256(pass); //Encripta la contraseña usando SHA256
                try {
                    if (mod.existe(correo) == 0){
                        Usuario u = new Usuario (); //Instancia un objeto en base a la clase Usuario
                        u.setNombre (nombre); //Llenamos datos
                        u.setApellido (apellido);
                        u.setDni(dni);
                        u.setTelefono(tel);
                        u.setCorreoE (correoE);
                        u.setCorreo (correo);
                        u.setContraseña(pass);
                        u.setRol("cliente");
                        if (mod.registrar(u)){
                            JOptionPane.showMessageDialog(null, "Ha sido registrado correctamente.");
                            log.txtC.setText(correo);
                        }
                    }else{
                        JOptionPane.showMessageDialog(null, "El usuario ya existe.","Error de registro", JOptionPane.ERROR_MESSAGE);
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(Registro.class.getName()).log(Level.SEVERE, null, ex);
                }
        }else{
            JOptionPane.showMessageDialog(null, "Las contraseñas son distintas.");
        }
        }
        this.setVisible(false);
        log.setEnabled(true);
        log.toFront();
    }//GEN-LAST:event_btnRegistrarMouseClicked

    private void btnCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseClicked
        this.setVisible(false);
        log.setEnabled(true);
        log.toFront();
    }//GEN-LAST:event_btnCancelarMouseClicked

    private void contenedorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contenedorMousePressed
        coordX = evt.getX();
        coordY = evt.getY();
    }//GEN-LAST:event_contenedorMousePressed

    private void contenedorMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contenedorMouseDragged
        this.setLocation(this.getLocation().x + evt.getX() - coordX, this.getLocation().y + evt.getY() - coordY);
    }//GEN-LAST:event_contenedorMouseDragged

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
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private images.PanelRound1 apellidoPanel;
    private images.PanelRound1 btnCancelar;
    private images.PanelRound1 btnRegistrar;
    private javax.swing.JPanel contenedor;
    private org.edisoncor.gui.panel.PanelImage imgContraseña;
    private org.edisoncor.gui.panel.PanelImage imgContraseña1;
    private org.edisoncor.gui.panel.PanelImage imgCorreo;
    private org.edisoncor.gui.panel.PanelImage imgDNI;
    private org.edisoncor.gui.panel.PanelImage imgTel;
    private org.edisoncor.gui.panel.PanelImage imgUser;
    private org.edisoncor.gui.panel.PanelImage imgUser1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel lblA;
    private javax.swing.JLabel lblCancelar;
    private javax.swing.JLabel lblContraseña;
    private javax.swing.JLabel lblContraseña1;
    private javax.swing.JLabel lblCorreo;
    private javax.swing.JLabel lblD1;
    private javax.swing.JLabel lblDNI;
    private javax.swing.JLabel lblN;
    private javax.swing.JLabel lblRegistrar;
    private images.PanelRound1 namePanel;
    private images.PanelRound1 panelContraseña;
    private images.PanelRound1 panelContraseña2;
    private images.PanelRound1 panelCorreo;
    private images.PanelRound1 panelDNI;
    private images.PanelRound1 panelTel;
    private javax.swing.JTextField txtA;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtD;
    private javax.swing.JTextField txtN;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JPasswordField txtPass2;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
