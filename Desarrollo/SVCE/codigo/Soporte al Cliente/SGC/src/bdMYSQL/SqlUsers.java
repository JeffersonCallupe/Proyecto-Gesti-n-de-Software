package bdMYSQL;

import Clases.Usuario;
import java.sql.*;
import javax.swing.JOptionPane;
        
public class SqlUsers extends ConexionBD{
    
    public boolean registrar(Usuario usr) {
    String insertCliente = "INSERT INTO cliente (nombre, apellido, dni ,telefono, correo) VALUES (?, ?, ?, ?, ?)";
    String insertUsuario = "INSERT INTO usuario (id_cliente, correo, contrasena, rol) VALUES (?, ?, ?, ?)";

    try (PreparedStatement psCliente = conn.prepareStatement(insertCliente, PreparedStatement.RETURN_GENERATED_KEYS);
         PreparedStatement psUsuario = conn.prepareStatement(insertUsuario)) {
        psCliente.setString(1, usr.getNombre());
        psCliente.setString(2, usr.getApellido());
        psCliente.setString(3, usr.getDni());
        psCliente.setString(4, usr.getTelefono());
        psCliente.setString(5, usr.getCorreo());

        int affectedRows = psCliente.executeUpdate();
        if (affectedRows == 0) {
            throw new SQLException("No se pudo insertar el cliente.");
        }

        try (ResultSet generatedKeys = psCliente.getGeneratedKeys()) {
            if (generatedKeys.next()) {
                usr.setId_cliente(generatedKeys.getInt(1));
            } else {
                throw new SQLException("No se pudo obtener el ID del cliente generado.");
            }
        }

        psUsuario.setInt(1, usr.getId_cliente());
        psUsuario.setString(2, usr.getCorreo());
        psUsuario.setString(3, usr.getContraseña());
        psUsuario.setString(4, usr.getRol());

        int rowsInserted = psUsuario.executeUpdate();
        return rowsInserted > 0;
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al registrar.\n" + ex, "Error de registro", JOptionPane.ERROR_MESSAGE);
        return false;
    }
}
public boolean ingresar(Usuario usr) throws SQLException {
    String obtenerIdSql = "SELECT u.id_cliente, u.rol, c.nombre, c.apellido, c.dni, c.telefono FROM usuario u LEFT JOIN cliente c ON u.id_cliente = c.id_cliente WHERE u.correo = ? AND u.contrasena = ?";
    
    try (Connection con = conectar();
         PreparedStatement ps = con.prepareStatement(obtenerIdSql)) {
        ps.setString(1, usr.getCorreo());
        ps.setString(2, usr.getContraseña());

        try (ResultSet rs = ps.executeQuery()) {
            if (rs.next()) {
                int idCliente = rs.getInt("id_cliente");
                String rol = rs.getString("rol");
                
                if (idCliente == -1 || idCliente == 0) {
                    // Es un administrador sin datos en la tabla "cliente"
                    usr.setRol(rol);
                } else {
                    // Es un cliente con datos en la tabla "cliente"
                    usr.setId_cliente(idCliente);
                    usr.setRol(rol);
                    usr.setNombre(rs.getString("nombre"));
                    usr.setApellido(rs.getString("apellido"));
                    usr.setDni(rs.getString("dni"));
                    usr.setTelefono(rs.getString("telefono"));
                }
                return true;
            } else {
                return false;
            }
        }
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al ingresar.\n" + ex, "Error de ingreso", JOptionPane.ERROR_MESSAGE);
        return false;
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
