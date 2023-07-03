package bdMYSQL;

import Clases.ListaCarrito;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;
import javax.swing.JOptionPane;

public class SqlPedido extends ConexionBD {
    public SqlPedido(){
         
   }
    
public boolean guardarEnvio(String ciudad, String direccion) {
    String sql = "UPDATE cliente SET ciudad = ?, direccion = ? WHERE id_cliente = ?";
    try (PreparedStatement ps = conectar().prepareStatement(sql, java.sql.Statement.RETURN_GENERATED_KEYS)) {
        ps.setString(1, ciudad);
        ps.setString(2, direccion);
        ps.setInt(3, ListaCarrito.getIdCliente());
        ps.executeUpdate();
        return true;
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al guardar la información de envío.\n" + ex.getMessage(),
                "Error de envío", JOptionPane.ERROR_MESSAGE);
    }
    return false;   
}


    public void guardarPedido() {
        SqlProductos prod = new SqlProductos();
        String sql = "INSERT INTO venta (id_cliente, id_producto, fecha, cantidad, precio) VALUES (?, ?, ?, ?, ?)";
        try (PreparedStatement ps = conectar().prepareStatement(sql)) {
            for (int i = 0; i < ListaCarrito.getDataList().size(); i++) {
                ps.setInt(1, ListaCarrito.getIdCliente());
                ps.setInt(2, ListaCarrito.getDataList().get(i).getProducto().getId_producto());
                ps.setDate(3, java.sql.Date.valueOf(LocalDate.now()));
                ps.setInt(4, ListaCarrito.getDataList().get(i).getCantidad());
                ps.setDouble(5, ListaCarrito.getDataList().get(i).getProducto().getDescuento());
                int act = ListaCarrito.getDataList().get(i).getProducto().getStock() - ListaCarrito.getDataList().get(i).getCantidad();
                ListaCarrito.getDataList().get(i).getProducto().setStock(act);
                prod.actualizarProducto(ListaCarrito.getDataList().get(i).getProducto());
                ps.executeUpdate();
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al guardar el pedido.\n" + ex.getMessage(),
                    "Error de pedido", JOptionPane.ERROR_MESSAGE);
        }
    }

}