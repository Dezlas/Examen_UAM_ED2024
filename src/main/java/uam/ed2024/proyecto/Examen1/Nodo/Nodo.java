/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uam.ed2024.proyecto.Examen1.Nodo;

/**
 *
 * @author Josue
 */
public class Nodo<T> {
    //consultar
    public T datos;
    public Nodo siguiente;
    
    //no defino Null, 
    public Nodo(T datos, Nodo siguiente)
    {
        this.datos = datos;
        this.siguiente = siguiente;
    }
}
