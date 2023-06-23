package bdMYSQL;

import Clases.Producto;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
        
public class SqlProductos extends ConexionBD{
    
    public void ObtenerProducto (ArrayList <Producto> producto) throws SQLException{
        PreparedStatement ps;
        ResultSet rs;
        String sql = "SELECT id_producto, descripcion, marca, precio, stock, tipo, imagen FROM producto ";
        Connection con = conectar();
        ps = con.prepareStatement(sql);
        try{
            rs = ps.executeQuery();
            while (rs.next()){
                Producto prod = new Producto();
                prod.setId_producto (rs.getInt(1));
                prod.setDescripcion (rs.getString(2));
                prod.setMarca (rs.getString(3));
                prod.setPrecio(rs.getFloat(4));
                prod.setStock(rs.getInt(5));
                prod.setTipo(rs.getString(6));
                prod.setImage(rs.getString(7));
                producto.add(prod);
            }
        }catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al consultar a la base de datos." + ex,"Error de conexión", JOptionPane.ERROR_MESSAGE);
        }finally{
            ps.close();
        }
    }
    public boolean registrar (Producto prod){
        PreparedStatement ps = null;
        conectar();
        String sql = "INSERT INTO producto (descripcion, marca, precio, stock, tipo, imagen) VALUES (?, ?, ?, ?, ?, ?)";
        try{
            
            ps = conn.prepareStatement(sql);
            ps.setString(1,prod.getDescripcion());
            ps.setString(2,prod.getMarca());
            ps.setDouble(3,prod.getPrecio());
            ps.setInt(4,prod.getStock());
            ps.setString(5,prod.getTipo());
            ps.setString(6,prod.getImage());
            ps.executeUpdate();
            return true;
        }
        catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al registrar.\n" + ex,"Error de registro", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
    
}
