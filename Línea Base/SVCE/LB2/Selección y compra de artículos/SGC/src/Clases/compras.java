/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.util.ArrayList;
import java.util.List;

public class compras {
    public static int id_cliente;
    public static List<ListaCompras> productos = new ArrayList<>();
    
     public static List<ListaCompras> getDataList() {
        return productos;
    }

    public static void addData(ListaCompras data) {
        productos.add(data);
    }

    public static void removeData(ListaCompras data) {
        productos.remove(data);
    }
    
}
