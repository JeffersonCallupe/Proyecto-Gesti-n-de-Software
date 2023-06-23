/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bdMYSQL;

import Clases.Reporte;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author CESAR
 */
public class SqlCompra extends ConexionBD{
    public List<Reporte> obtenerPedido(){
        List<Reporte> art = new ArrayList<>();
        ResultSet rs;
        String sql = "SELECT * FROM reporte ";
        Connection con = conectar();
    }

    public List<Reporte> obtenerPedido() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public int size() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
