/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uam.ed2024.proyecto.Examen1.clases;

/**
 *
 * @author Josue
 */
public class Pedidos {
    
    private Producto producto;
    private double cantidad;
    private String direccionEnvio;
    private String cliente;
    private int NumeroPedido;
    
    //Gets and setters
    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public String getDireccionEnvio() {
        return direccionEnvio;
    }

    public void setDireccionEnvio(String direccionEnvio) {
        this.direccionEnvio = direccionEnvio;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public int getNumeroPedido() {
        return NumeroPedido;
    }
    
    public void setNumeroPedido(int numeropedido) {
        this.NumeroPedido = numeropedido;
    }
    
    //To String
    @Override
    public String toString() {
        return "Numero_Pedido= " + NumeroPedido + ", Producto= " + producto.getNombre() + ", Cantidad= " + cantidad + ", Direccion_Envio= " + direccionEnvio + ", Cliente= " + cliente + " ";
    }









    
}
