/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uam.ed2024.proyecto.Examen1.clases;

/**
 *
 * @author Josue
 */
public class Producto extends ProductoPadre {
       
      public Producto(String nombre, String descripcion, double precio, String tamano, String color, String modelo) {
        super(nombre, descripcion, precio);
            this.tamano = tamano;
            this.color = color;
            this.modelo = modelo;
    }    

}
