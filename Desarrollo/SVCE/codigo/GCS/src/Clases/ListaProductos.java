/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.util.ArrayList;
import java.util.List;

public class ListaProductos {
    protected static List <Producto> articulos = new ArrayList<>(); 
    
    private ListaProductos(){
        //Constructor
    }
    
    public static List<Producto> getDataList() {
        return articulos;
    }

    public static void addProducto(Producto data) {
        articulos.add(data);
    }
    
    public static int getId(String descripcion){
        for (int i = 0; i < articulos.size(); i++){
            if (articulos.get(i).getDescripcion().equals(descripcion))
                return articulos.get(i).getId_producto();
        }
        return -1;
    }
}
