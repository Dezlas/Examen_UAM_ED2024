/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uam.ed2024.proyecto.Examen1.clases;

/**
 *
 * @author Josue
 */
public abstract class ProductoPadre {
    
    private int NumeroProducto;
    private String nombre;
    private String descripcion;
    private double precio;
    protected String tamano;
    protected String color;
    protected String modelo;
    
    
    //Constructor
    public ProductoPadre(String nombre, String descripcion, double precio)
    {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
    }       


    //Gets and setters

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public int getNumeroProducto() {
        return NumeroProducto;
    }

    public void setNumeroProducto(int NumeroProducto) {
        this.NumeroProducto = NumeroProducto;
    }

    //To String
    @Override
    public String toString() {
        return "Numero_Pedido= " + NumeroProducto + ", Nombre= " + nombre + ", Descripcion= " + descripcion + ", Precio= " + precio + ", Tamano= " + tamano + ", Color= " + color + ", Modelo= " + modelo + " ";
    }
 
}
