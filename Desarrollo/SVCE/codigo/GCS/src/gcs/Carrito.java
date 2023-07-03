/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package gcs;

import java.awt.Color;
import javax.swing.JOptionPane;
import Clases.Compra;
import Clases.ListaCarrito;

public class Carrito extends javax.swing.JPanel {
    int [] cant = {0,0,0,0};
    double total = 0.0;
    private static final String FUENTE = "Verdana";
    org.edisoncor.gui.panel.PanelImage [] paneles = new  org.edisoncor.gui.panel.PanelImage [4];
    javax.swing.JPanel [] panelesP = new javax.swing.JPanel[4];
    javax.swing.JLabel [] descripcion = new javax.swing.JLabel[4];
    javax.swing.JLabel [] cantidad = new javax.swing.JLabel[4];
    javax.swing.JLabel [] marca = new javax.swing.JLabel[4];
    javax.swing.JLabel [] tipo = new javax.swing.JLabel[4];
    javax.swing.JLabel [] precio = new javax.swing.JLabel[4];
    javax.swing.JButton [] btnMenosP = new javax.swing.JButton[4];
    javax.swing.JButton [] btnMasP = new javax.swing.JButton[4];
    javax.swing.JButton [] btnEliminar = new javax.swing.JButton[4];
    Compra [] producto = new Compra [4];
    Catalogo cat;
    //Variables globales
    int posInicial = 0; 
    public Carrito() {
        initComponents();
        llenarVector();
        seleccionP ();
        manejarCarrito();
        actualizarTotal();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        carritoVacio = new javax.swing.JPanel();
        panelImage1 = new org.edisoncor.gui.panel.PanelImage();
        lblCarritoVacio = new javax.swing.JLabel();
        lblAgregarProducto = new javax.swing.JLabel();
        btnSeguir = new org.edisoncor.gui.button.ButtonRound();
        javax.swing.JLabel lblSubtotal = new javax.swing.JLabel();
        lblCostoSub = new javax.swing.JLabel();
        lblCostoTotal = new javax.swing.JLabel();
        javax.swing.JLabel lblTotal = new javax.swing.JLabel();
        btnPagar = new org.edisoncor.gui.button.ButtonRound();
        javax.swing.JPanel contenedor = new javax.swing.JPanel();
        btnSiguiente = new javax.swing.JButton();
        panel1 = new javax.swing.JPanel();
        panel2 = new javax.swing.JPanel();
        panel3 = new javax.swing.JPanel();
        panel4 = new javax.swing.JPanel();
        btnAtras = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        carritoVacio.setBackground(new java.awt.Color(255, 255, 255));
        carritoVacio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelImage1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/CarritoVacio.png"))); // NOI18N
        carritoVacio.add(panelImage1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 110, 120, 120));

        lblCarritoVacio.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        lblCarritoVacio.setForeground(new java.awt.Color(0, 0, 0));
        lblCarritoVacio.setText("Tu Carro de Compras está vacío");
        carritoVacio.add(lblCarritoVacio, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 250, 430, 30));

        lblAgregarProducto.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblAgregarProducto.setForeground(new java.awt.Color(0, 0, 0));
        lblAgregarProducto.setText("Agrega productos ahora");
        carritoVacio.add(lblAgregarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 300, 200, -1));

        btnSeguir.setBackground(new java.awt.Color(255, 153, 0));
        btnSeguir.setText("Seguir Comprando");
        btnSeguir.setColorDeSombra(new java.awt.Color(85, 105, 204));
        btnSeguir.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnSeguir.addActionListener(evt -> btnSeguirActionPerformed());
        carritoVacio.add(btnSeguir, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 360, 210, 40));

        add(carritoVacio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, 590));

        lblSubtotal.setFont(new java.awt.Font(FUENTE, 0, 16));
        lblSubtotal.setForeground(new java.awt.Color(45, 45, 45));
        lblSubtotal.setText("SubTotal");
        add(lblSubtotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 160, 100, 20));
        add(lblCostoSub, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 160, 70, 20));
        add(lblCostoTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 200, 70, 20));

        lblTotal.setFont(new java.awt.Font(FUENTE, 1, 14));
        lblTotal.setForeground(new java.awt.Color(102, 102, 102));
        lblTotal.setText("Total");
        add(lblTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 200, 40, 20));

        btnPagar.setBackground(new java.awt.Color(255, 153, 0));
        btnPagar.setText("IR A PAGAR");
        btnPagar.setColorDeSombra(new java.awt.Color(85, 105, 204));
        btnPagar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnPagar.addActionListener(evt -> btnMetodoPagoActionPerformed());
        add(btnPagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 280, -1, 40));

        contenedor.setBackground(new java.awt.Color(235, 235, 235));
        contenedor.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSiguiente.setText("Siguiente");
        btnSiguiente.addActionListener(evt -> btnSiguienteActionPerformed());
        contenedor.add(btnSiguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 530, -1, -1));

        panel1.setBackground(new java.awt.Color(235, 235, 235));
        panel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        contenedor.add(panel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 510, 120));

        panel2.setBackground(new java.awt.Color(235, 235, 235));
        panel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        contenedor.add(panel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 510, 120));

        panel3.setBackground(new java.awt.Color(235, 235, 235));
        panel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        contenedor.add(panel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 510, 120));

        panel4.setBackground(new java.awt.Color(235, 235, 235));
        panel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        contenedor.add(panel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, 510, 120));

        btnAtras.setText("Atrás");
        btnAtras.addActionListener(evt -> btnAtrasActionPerformed());
        contenedor.add(btnAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 530, -1, -1));
        btnAtras.setVisible(false);

        add(contenedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 570, 590));
    }// </editor-fold>//GEN-END:initComponents
    
    private void manejarCarrito(){
        if (ListaCarrito.getSize() != 0)
            carritoVacio.setVisible(false);
        else
            carritoVacio.setVisible(true);
    }
    
    public void setFrame(Catalogo cat){
        this.cat = cat;
    }
    
    private void btnSiguienteActionPerformed() {                                             
        posInicial += 4;
        seleccionP();
        btnAtras.setVisible(true);
    }   
    
    private void btnAtrasActionPerformed() {                                         
        posInicial -= 4;
        if (posInicial < 4){
            btnAtras.setVisible(false);
            posInicial = 0;
        }else
            btnAtras.setVisible(true);
        btnSiguiente.setVisible(true);
        seleccionP();
    }   
    
    private void btnMetodoPagoActionPerformed() {                                              
        ProcesarPago pago = new ProcesarPago(); 
        pago.setSize(830, 520);
        pago.setLocation(0, 0);
        this.removeAll();
        this.add(pago, new org.netbeans.lib.awtextra.AbsoluteConstraints(0,0,-1,-1));
        this.revalidate();
    }  
    
    private void btnSeguirActionPerformed() {  
        cat.setIndex(0);
    }
    private void llenarVector(){
        panelesP [0] = panel1;
        panelesP [1] = panel2;
        panelesP [2] = panel3;
        panelesP [3] = panel4;
    }
    
    private void actualizarTotal (){
        total = ListaCarrito.getTotal();
        lblCostoSub.setText("" + total);
        lblCostoTotal.setText("" + total);
    }
    
    private void iniciarCarrito (int i){
        //Limpia ventana de productos.
        panelesP[i].removeAll();
        panelesP[i].revalidate();
        
        //Paneles imagenes
        paneles [i] = new  org.edisoncor.gui.panel.PanelImage();
        paneles[i].setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        paneles[i].setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout pnlProducto1Layout = new javax.swing.GroupLayout(paneles[i]);
        paneles[i].setLayout(pnlProducto1Layout);
        pnlProducto1Layout.setHorizontalGroup(
            pnlProducto1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        pnlProducto1Layout.setVerticalGroup(
            pnlProducto1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        panelesP[i].add(paneles[i], new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));
        
        //Labels descripcion
        descripcion[i] = new javax.swing.JLabel();
        descripcion[i].setFont(new java.awt.Font(FUENTE, 1, 13));
        panelesP[i].add(descripcion[i], new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, 250, 20));
        
        //Labels precio
        precio[i] = new javax.swing.JLabel();
        precio[i].setFont(new java.awt.Font(FUENTE, 1, 13)); // NOI18N
        precio[i].setForeground(new java.awt.Color(85, 105, 204));
        panelesP[i].add(precio[i], new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 20, 70, -1));

        // labels tipo
        tipo[i] = new javax.swing.JLabel();
        tipo[i].setFont(new java.awt.Font(FUENTE, 1, 13));
        tipo[i].setForeground(new Color(102,102,102));
        panelesP[i].add(tipo[i], new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 250, 20));
        
        // labels marcas
        marca[i] = new javax.swing.JLabel();
        marca[i].setFont(new java.awt.Font(FUENTE, 1, 13));
        marca[i].setForeground(new Color(102,102,102));
        panelesP[i].add(marca[i], new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, 250, 20));
        
        //Boton menos
        btnMenosP[i]= new javax.swing.JButton();
        btnMenosP[i].setText("-");
        panelesP[i].add(btnMenosP[i], new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 50, -1, -1));
        
        btnMenosP[i].addActionListener(evt -> btnMenosActionPerformed(i));
        
        //Boton mas
        btnMasP[i]= new javax.swing.JButton();
        btnMasP[i].setText("+");
        panelesP[i].add(btnMasP[i], new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 50, -1, -1));
        
        btnMasP[i].addActionListener(evt -> btnMasActionPerformed(i));
        
        //Boton eliminar
        btnEliminar[i]= new javax.swing.JButton();
        btnEliminar[i].setText("×");
        btnEliminar[i].setBackground(new Color(246,53,55));
        btnEliminar[i].setForeground(Color.WHITE);
        btnEliminar[i].setFont(new java.awt.Font(FUENTE, 0, 14));
        panelesP[i].add(btnEliminar[i], new org.netbeans.lib.awtextra.AbsoluteConstraints(-2, 48, -1, -1));
        
        btnEliminar[i].addActionListener(evt -> btnEliminarActionPerformed(i));
        
        //Labels cantidad
        cantidad[i] = new javax.swing.JLabel();
        cantidad[i].setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        panelesP[i].add(cantidad[i], new org.netbeans.lib.awtextra.AbsoluteConstraints(435, 55, 35, 20));
        
        //Rellenando compras
        actualizarTotal();
    }
    
    public void btnEliminarActionPerformed(int i){
        if (JOptionPane.showConfirmDialog(null, "¿Está seguro de eliminar el producto?", "Eliminar producto",
        JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            ListaCarrito.getDataList().remove(i);
            seleccionP();
            actualizarTotal();
            Catalogo catalogo = Catalogo.getInstance();
            catalogo.actualizarCarrito();
            if (ListaCarrito.getSize()== 0)
                carritoVacio.setVisible(true);
        }
    }
    
    public void btnMenosActionPerformed(int i){
        cant[i] = Integer.parseInt(cantidad[i].getText());
        if (cant[i] > 1){
            cant[i]--;
            cantidad[i].setText("" + cant[i]);
            ListaCarrito.getDataList().get(i).setCantidad(cant[i]);
            actualizarTotal();
        }
        precio[i].setText("S/ " + cant[i] * ListaCarrito.getDataList().get(i).getProducto().getPrecio());
    }
    
    public void btnMasActionPerformed(int i){
        cant[i] = Integer.parseInt(cantidad[i].getText());
        if (cant[i] < 10){
            cant[i]++;
            cantidad[i].setText("" + cant[i]);
            ListaCarrito.getDataList().get(i).setCantidad(cant[i]);
            actualizarTotal();
        }
        precio[i].setText("S/ " + cant[i] * ListaCarrito.getDataList().get(i).getProducto().getPrecio());
    }
    
    private void seleccionP (){
        int posFinal = Math.min(posInicial + 4, ListaCarrito.getDataList().size());
        int j = 0;
        limpiarCatalogo();
        for (int i = posInicial; j < 4 && i < ListaCarrito.getDataList().size(); i++, j++) {
            panelesP[j].setVisible(true);
            iniciarCarrito (j);
            actualizarProductos(i, j);
        }
        if(posFinal >= ListaCarrito.getDataList().size() || j < 4){
            btnSiguiente.setVisible(false);
        }
    }
    private void limpiarCatalogo(){
        for (int i = 0; i < 4; i++){
            panelesP[i].setVisible(false);
        }
    }
    private void actualizarProductos( int i, int j) {
        String image = ListaCarrito.getDataList().get(i).getProducto().getImage();
        double precioCantidad;
            paneles[j].setVisible(true);
            descripcion[j].setVisible(true);
            cantidad[j].setVisible(true);
        try {
            paneles[j].setIcon(new javax.swing.ImageIcon(getClass().getResource(image)));
            paneles[j].repaint();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al cargar imagen: ", "Error de carga", JOptionPane.ERROR_MESSAGE);
        }
        descripcion[j].setText(ListaCarrito.getDataList().get(i).getProducto().getDescripcion());
        precioCantidad = ListaCarrito.getDataList().get(i).getCantidad()*ListaCarrito.getDataList().get(i).getProducto().getDescuento();
        precio[j].setText("S/ " + precioCantidad);
        producto[j] = ListaCarrito.getDataList().get(i);
        cantidad[j].setText(""+ListaCarrito.getDataList().get(i).getCantidad());
        marca[j].setText("Marca: " + ListaCarrito.getDataList().get(i).getProducto().getMarca());
        tipo[j].setText(ListaCarrito.getDataList().get(i).getProducto().getTipo());
}


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    private org.edisoncor.gui.button.ButtonRound btnPagar;
    private org.edisoncor.gui.button.ButtonRound btnSeguir;
    private javax.swing.JButton btnSiguiente;
    private javax.swing.JPanel carritoVacio;
    private javax.swing.JLabel lblAgregarProducto;
    private javax.swing.JLabel lblCarritoVacio;
    private javax.swing.JLabel lblCostoSub;
    private javax.swing.JLabel lblCostoTotal;
    private javax.swing.JPanel panel1;
    private javax.swing.JPanel panel2;
    private javax.swing.JPanel panel3;
    private javax.swing.JPanel panel4;
    private org.edisoncor.gui.panel.PanelImage panelImage1;
    // End of variables declaration//GEN-END:variables
}
