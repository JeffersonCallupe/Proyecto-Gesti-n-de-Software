/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bdMYSQL;

import Clases.Reporte;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author CESAR
 */
public class SqlCompra extends ConexionBD{
    public List<Reporte> obtenerPedido() throws SQLException{
        List<Reporte> art = new ArrayList<>();
        ResultSet rs;
        String sql = "SELECT * FROM reporte ";
        Connection con = conectar();
        try (PreparedStatement ps = con.prepareStatement(sql)){
            rs = ps.executeQuery();
            while (rs.next()){
            }
    }

    public List<Reporte> obtenerPedido() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public int size() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
