/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bdMYSQL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import Clases.Promocion;

/**
 *
 * @author CRISTHIAN
 */
public class SqlPromocion extends ConexionBD{
    
    public SqlPromocion(){
        //Constructor de SqlPromocion
    }
        
     public List<Promocion> obtenerPromociones() {
        List<Promocion> promociones = new ArrayList<>();
        ResultSet rs;
        Connection con = conectar();
        String query = "SELECT * FROM promocion";

        try (PreparedStatement ps = con.prepareStatement(query)){
            rs = ps.executeQuery();
            while (rs.next()) {
                Promocion promocion = new Promocion();
                promocion.setIdPromocion(rs.getInt("id_promocion"));
                promocion.setTipo(rs.getString("tipo_promocion"));
                promocion.setFechaInicio(rs.getDate("fecha_inicio").toLocalDate());
                promocion.setFechaFin(rs.getDate("fecha_fin").toLocalDate());
                promocion.setDescuento(rs.getInt("descuento"));
                promociones.add(promocion);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al obtener las promociones.\n" + ex, "Error de consulta", JOptionPane.ERROR_MESSAGE);
        }

        return promociones;
     }

    public int insertarPromocion(Promocion promocion) throws SQLException{
    String insertSql = "INSERT INTO promocion (tipo_promocion, fecha_inicio, fecha_fin, descuento) VALUES (?, ?, ?, ?)";
    
    try (Connection con = conectar();
         PreparedStatement ps = con.prepareStatement(insertSql, java.sql.Statement.RETURN_GENERATED_KEYS)) {
        
        ps.setString(1, promocion.getTipo());
        ps.setDate(2, java.sql.Date.valueOf(promocion.getFechaInicio()));
        ps.setDate(3, java.sql.Date.valueOf(promocion.getFechaFin()));
        ps.setInt(4, promocion.getDescuento());
        
        int rowsAffected = ps.executeUpdate();
        
        if (rowsAffected == 0) {
            throw new SQLException("No se pudo insertar la promoción.");
        }
        
        try (ResultSet generatedKeys = ps.getGeneratedKeys()) {
            if (generatedKeys.next()) {
                return generatedKeys.getInt(1);
            } else {
                throw new SQLException("No se pudo obtener el ID de la promoción generada.");
            }
        }
        
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al insertar la promoción.\n" + ex.getMessage(), "Error de inserción", JOptionPane.ERROR_MESSAGE);
        return -1;
    }
}
    
    public Promocion buscarPromocion (int idPromocion){
        String sql = "SELECT * FROM promocion WHERE id_promocion = ?";
        Promocion promocion = null;

        try (PreparedStatement ps = conectar().prepareStatement(sql)) {
            ps.setInt(1, idPromocion);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                promocion = new Promocion();
                promocion.setIdPromocion(rs.getInt("id_promocion"));
                promocion.setTipo(rs.getString("tipo_promocion"));
                promocion.setFechaInicio(rs.getDate("fecha_inicio").toLocalDate());
                promocion.setFechaFin(rs.getDate("fecha_fin").toLocalDate());
                promocion.setDescuento(rs.getInt("descuento"));
            }
                
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al buscar la promoción.\n" + ex, "Error de búsqueda", JOptionPane.ERROR_MESSAGE);
        }

        return promocion;
}
}
