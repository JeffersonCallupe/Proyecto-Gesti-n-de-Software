package bdMYSQL;

import Clases.ListaProductos;
import Clases.Producto;
import Clases.Promocion;
import java.sql.*;
import javax.swing.JOptionPane;
        
public class SqlProductos extends ConexionBD{
    
    public void ObtenerProducto (){
        ListaProductos.getDataList().clear();
        ResultSet rs;
        String sql = "SELECT id_producto, descripcion, marca, precio, stock, tipo, imagen, id_promocion FROM producto ";
        Connection con = conectar();
        try (PreparedStatement ps = con.prepareStatement(sql)){
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
                Integer idPromo = (Integer) rs.getObject(8);
                prod.setIdPromo(rs.getInt(8));
                if (!rs.wasNull())
                    prod.setDescuento(setPromocion(rs.getFloat(4),idPromo));
                else
                    prod.setDescuento(rs.getFloat("precio"));
                ListaProductos.addProducto(prod);
            }
        }catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al cargar los productos: ", "Error de carga", JOptionPane.ERROR_MESSAGE);
        }
    }

    public boolean registrar (Producto prod){
        PreparedStatement ps;
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
    public void actualizarProducto(Producto producto){
        String sql = "UPDATE producto SET precio = ?, stock = ? WHERE id_producto = ?";
        try (PreparedStatement stmt = conectar().prepareStatement(sql)) {
            stmt.setDouble(1, producto.getPrecio());
            stmt.setInt (2, producto.getStock());
            stmt.setInt (3, producto.getId_producto());
            stmt.executeUpdate();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error al actualizar producto.");
        }
    }
    public void eliminarProducto(int idProducto) {
        String sql = "DELETE FROM producto WHERE id_producto = ?";
        try (PreparedStatement stmt = conectar().prepareStatement(sql)) {
            stmt.setInt(1, idProducto);
            stmt.executeUpdate();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error al eliminar producto.");
        }
    }
    
    public double setPromocion (double precio, int idPromocion){
        double descuento;
        SqlPromocion recibirProm = new SqlPromocion();
        Promocion prom = recibirProm.buscarPromocion(idPromocion);
        if (prom.getTipo().equals("%"))
            descuento = precio * prom.getDescuento()/100;
        else
            descuento = precio - prom.getDescuento();

        return descuento;
    }
        public void asignarPromocion(int idProducto, int idPromocion){
        String updateProducto = "UPDATE producto SET id_promocion = ? WHERE id_producto = ?";

        try (PreparedStatement psProducto = conectar().prepareStatement(updateProducto)) {
            psProducto.setInt(1, idPromocion);
            psProducto.setInt(2, idProducto);

            int rowsAffected = psProducto.executeUpdate();
            if (rowsAffected == 0) {
                throw new SQLException("No se pudo asignar la promoción al producto.");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"No se pudo guardar la promoción." + ex, "Error de promoción", JOptionPane.ERROR_MESSAGE);
        }
    }
    
}
