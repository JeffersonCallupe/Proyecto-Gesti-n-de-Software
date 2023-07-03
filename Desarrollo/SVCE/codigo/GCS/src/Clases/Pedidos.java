package Clases;

import java.time.LocalDate;

public class Pedidos {
    protected LocalDate fecha;
    protected int cantidad;
    protected int idCliente;
    protected int idVenta;
    protected int idProducto;

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getIdUsuario() {
        return idCliente;
    }

    public void setIdUsuario(int idUsuario) {
        this.idCliente = idUsuario;
    }

    public int getIdPedido() {
        return idVenta;
    }

    public void setIdPedido(int idPedido) {
        this.idVenta = idPedido;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }
}
