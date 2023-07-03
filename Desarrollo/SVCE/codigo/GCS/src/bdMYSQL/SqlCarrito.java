package bdMYSQL;

import Clases.ListaCompras;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Grupo 6
 */
public class SqlCarrito extends ConexionBD{
    
    public SqlCarrito(){
        
    }
    public void agregarCarrito (ListaCompras lista){
        PreparedStatement ps = null;
        String sql = "INSERT INTO venta (id_cliente, id_producto, fecha, cantidad) VALUES (?, ?, ?, ?)";
        try{
            ps = conn.prepareStatement(sql);
            ps.setInt(1,lista.getIdCliente());
            ps.setInt(2,lista.getIdProducto());
            ps.setDate(3,Date.valueOf(lista.getFecha()));
            ps.setInt(4,lista.getCantidad());
            ps.executeUpdate();
        }catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al registrar.\n" + ex,"Error de registro", JOptionPane.ERROR_MESSAGE);
        }
    }

}
