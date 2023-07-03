/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import gcs.Catalogo;
import java.util.ArrayList;
import java.util.List;

public class ListaCarrito {
    protected static int idCliente;
    protected static double total = 0.0;
    protected static List<Compra> listaCompra = new ArrayList<>();

    
    public static List<Compra> getDataList() {
        return listaCompra;
    }

    public static void addData(Compra data) {
        listaCompra.add(data);
    }
    
    public static int verificarExiste (Producto prod){
        for (int i = 0; i < listaCompra.size(); i++){
            if (listaCompra.get(i).getProducto().equals(prod)){
                return i;
            }
        }
        return -1;
    }
    
    public static void actualizarCant (int cant, int i){
        listaCompra.get(i).setCantidad(cant);
    }
    
    public static int getSize (){
        return listaCompra.size();
    }
    
    public static double getTotal (){
        total = 0.0;
        for (int i = 0; i < listaCompra.size(); i++){
            total += listaCompra.get(i).getProducto().getDescuento()*listaCompra.get(i).cantidad;
        }
        return total;
    }

    public static int getIdCliente() {
        return idCliente;
    }

    public static void setIdCliente(int aidCliente) {
        idCliente = aidCliente;
    }
    public static void deleteCarrito (){
        listaCompra.clear();
        Catalogo cat = Catalogo.getInstance();
        cat.actualizarCarrito();
    }
}
