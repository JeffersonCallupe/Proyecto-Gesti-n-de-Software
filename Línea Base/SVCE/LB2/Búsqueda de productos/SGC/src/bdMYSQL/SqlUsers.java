package bdMYSQL;

import Clases.Producto;
import Clases.Usuario;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
        
public class SqlUsers extends ConexionBD{
    
    public void ObtenerProducto (ArrayList <Producto> producto) throws SQLException{
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = "SELECT * FROM producto ";
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
        }finally{
            ps.close();
        }
        
    }
    
    public boolean registrar (Usuario usr){
        PreparedStatement ps = null;
        int id = -1;
        ResultSet rs = null;
        String sql = "INSERT INTO cliente (nombre, apellido, telefono, correo) VALUES (?, ?, ?, ?)";
        try{
            
            ps = conn.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
            ps.setString(1,usr.getNombre());
            ps.setString(2,usr.getApellido());
            ps.setString(3,usr.getTelefono());
            ps.setString(4,usr.getCorreo());
            ps.executeUpdate();
            ResultSet generatedKeys = ps.getGeneratedKeys();
            if (generatedKeys.next()) {
                id = generatedKeys.getInt(1);
            }
            usr.setId_cliente(id);
            registrarUsuario (usr);
            return true;
        }
        catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al registrar.\n" + ex,"Error de registro", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
    
    public boolean registrarUsuario (Usuario usr) throws SQLException{
        PreparedStatement ps = null;
        String sql = "INSERT INTO usuario (id_cliente, correo, contrasena) VALUES (?, ?, ?)";
        try{
            ps = conn.prepareStatement(sql);
            ps.setInt(1, usr.getId_cliente());
            ps.setString(2,usr.getCorreo());
            ps.setString(3,usr.getContraseña());
            ps.executeUpdate();
            return true;
        }
        catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al registrar.\n" + ex,"Erro de registro", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    public int obtenerId (Usuario usr) throws SQLException{
        int id = -1;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try{
            Connection con = conectar();
            String sql = "SELECT id_cliente, rol FROM usuario WHERE correo = ? AND contrasena = ?";
            ps = con.prepareStatement(sql);
            ps.setString(1, usr.getCorreo());
            ps.setString(2, usr.getContraseña());
            rs = ps.executeQuery();
            
            if (rs.next()){
               id = rs.getInt(1);
               usr.setRol(rs.getString(2));
            }
        }catch (SQLException ex){
        }
        return id;
    }
    
    public boolean ingresar (Usuario usr) throws SQLException{
        PreparedStatement ps = null;
        ResultSet rs = null;
        int id = obtenerId (usr);
        if (id == -1){
            return false;
        }
        else{
            String sql = "SELECT nombre, apellido, telefono, correo FROM cliente WHERE id_cliente = ?";
            try{
                Connection con = conectar();
                ps = con.prepareStatement(sql);
                ps.setInt(1, id);
                rs = ps.executeQuery();

                if (rs.next()){
                    usr.setNombre (rs.getString(1));
                    usr.setApellido(rs.getString(2));
                    usr.setTelefono(rs.getString(3));
                    usr.setCorreo(rs.getString(4));
                    return true;
                }else
                    return false;
            }catch (SQLException ex){
                return false;
             }
        }
    }
    
    public int existe (String usuario) throws SQLException{
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = "SELECT count(id_usuario) FROM usuario WHERE correo = ?";
        
        try{
            Connection con = conectar();
            ps = con.prepareStatement(sql);
            ps.setString(1, usuario);
            rs = ps.executeQuery();
            
            if (rs.next()){
                return rs.getInt(1);
            }
            return 1;
        }catch (SQLException ex){
            return 1;
         }
    }
}
