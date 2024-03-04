/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uam.ed2024.proyecto.Examen1.Listas;
import javax.swing.JOptionPane;
import  uam.ed2024.proyecto.Examen1.clases.Producto;
import  uam.ed2024.proyecto.Examen1.Nodo.Nodo;
import uam.ed2024.proyecto.Examen1.clases.Pedidos;
/**
 *
 * @author Josue
 */
public class ListaProductos {
    Nodo<Producto> root = null;
    private int NumeroProducto = 0;
    
        public void AgregarProducto(Producto Datos){
            root= new Nodo(Datos,root);
            NumeroProducto = NumeroProducto+1;
            Datos.setNumeroProducto(NumeroProducto);
        }

        public void MostrarProductos(){
            String concatenado = "";
            Nodo<Producto> tempRoot = root;
            if(tempRoot == null){
                JOptionPane.showMessageDialog(null, "No hay prodcutos enlistados");
            }else{
                JOptionPane.showMessageDialog(null, "Datos encontrados");
                while(tempRoot != null){
                    concatenado += "<html><label>" + tempRoot.datos.toString() + "<br></label></html>" ;
                    tempRoot = tempRoot.siguiente;
                }
            JOptionPane.showMessageDialog(null, concatenado);
            }
        }
    
        public Producto BuscarProducto(String valor){
            Nodo<Producto> tempRoot = root;
            if(tempRoot == null){
                JOptionPane.showMessageDialog(null, "No se encontró producto en la lista de productos.");
                return null;
            }else{
                while(tempRoot != null){
                    if(valor.equals(tempRoot.datos.getNombre())){
                        return tempRoot.datos;
                    }else{
                        tempRoot = tempRoot.siguiente;
                    }
                }
                JOptionPane.showMessageDialog(null, "No hay productos con ese criterio de busqueda");
            }
            return null;
        }
      
    
    
    
}
