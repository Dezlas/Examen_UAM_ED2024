/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package uam.ed2024.proyecto.Examen1;
import javax.swing.JOptionPane;
import uam.ed2024.proyecto.Examen1.clases.Producto;
import uam.ed2024.proyecto.Examen1.clases.Pedidos;
import uam.ed2024.proyecto.Examen1.Listas.ListaPedidos;
import uam.ed2024.proyecto.Examen1.Listas.ListaProductos;

/**
 *
 * @author Josue
 */
public class Main {

    public static void main(String[] args) {
    
    //Definicion Productos que se venden en la empresa.
    Producto Producto1 = new Producto ("papa", "en oferta", 50, "Grande", "Amarillo", "Verdura"); 
    Producto Producto2 = new Producto ("arroz", "del lote pasado", 80, "Pequeño", "Blanco", "Grano"); 
    Producto Producto3 = new Producto ("manzana", "lote entrante", 40, "Mediano", "Verde", "Fruta");
    Producto Producto4 = new Producto ("pera", "Recien Cosechadas", 100, "Pequeño", "Verde", "Fruta"); 
    Producto Producto5 = new Producto ("melon", "lote numero 1454564", 150, "Grande", "Naranja", "Fruta"); 
    Producto Producto6 = new Producto ("sandia", "Exportadas", 200, "Grande", "Verde", "Fruta"); 

    //Enlistado de Productos
    ListaProductos listaDeProductos = new ListaProductos (); 
    listaDeProductos.AgregarProducto(Producto1);
    listaDeProductos.AgregarProducto(Producto2);
    listaDeProductos.AgregarProducto(Producto3);
    listaDeProductos.AgregarProducto(Producto4);
    listaDeProductos.AgregarProducto(Producto5);
    listaDeProductos.AgregarProducto(Producto6);
   
    //Pedidos para predefinidos
    Pedidos Pedido1 = new Pedidos (); 
    Pedido1.setProducto(Producto3);
    Pedido1.setCantidad(20);
    Pedido1.setCliente("Ángel");
    Pedido1.setDireccionEnvio("heredia");
    
    Pedidos Pedido2 = new Pedidos ();
    Pedido2.setProducto(Producto1);
    Pedido2.setCantidad(50);
    Pedido2.setCliente("Josue");
    Pedido2.setDireccionEnvio("cartago");
    
    Pedidos Pedido3 = new Pedidos ();
    Pedido3.setProducto(Producto2);
    Pedido3.setCantidad(60);
    Pedido3.setCliente("Emanuel");
    Pedido3.setDireccionEnvio("san jose");
    
    Pedidos Pedido4 = new Pedidos ();
    Pedido4.setProducto(Producto1);
    Pedido4.setCantidad(100);
    Pedido4.setCliente("Juan");
    Pedido4.setDireccionEnvio("alajuela");

    Pedidos Pedido5 = new Pedidos ();
    Pedido5.setProducto(Producto1);
    Pedido5.setCantidad(100);
    Pedido5.setCliente("Pedro");
    Pedido5.setDireccionEnvio("cartago");

    
//  Lista de pedido predefinida
    ListaPedidos listaDePedidos = new ListaPedidos (); 
    listaDePedidos.AgregarNodo(Pedido1);
    listaDePedidos.AgregarNodo(Pedido2);
    listaDePedidos.AgregarNodo(Pedido3);
    listaDePedidos.AgregarNodo(Pedido4);
    listaDePedidos.AgregarNodo(Pedido5);
    
    //Menú Principal
    int Opcion=0;
    //ListaPedidos listaDePedidos = new ListaPedidos ();
    Pedidos Pedido = new Pedidos (); 
    String ProductoBuscar = "";
    double Cantidad = 0;
    String Cliente = "";
    String Direccion = "";
    String Busqueda = "";
        do{  
        Opcion = Integer.parseInt(JOptionPane.showInputDialog("***SISTEMA DE PEDIDOS*** \n"
            + "\n"
            + "Por favor, seleccione la opción deseada:\n"
            + "\n"    
            + "1 = Ver lista de productos\n"
            + "2 = ver lista de pedidos\n"
            + "3 = Agregar un pedido\n"
            + "4 = Buscar un pedido\n"  
            + "5 = Editar un pedido\n"
            + "6 = Eliminar un pedido\n"
            + "7 = Salir\n"));  
        switch (Opcion) {
            case 1:
                listaDeProductos.MostrarProductos();
            break;
            case 2:   
                listaDePedidos.MostrarNodos();
            break;
            case 3:
                Pedido = new Pedidos ();  
                //Seteo de Producto
                ProductoBuscar = JOptionPane.showInputDialog("Por favor, digite el nombre del producto válido");
                if (listaDeProductos.BuscarProducto(ProductoBuscar.toLowerCase()) == null){
                    break;
                } else {
                    Pedido.setProducto(listaDeProductos.BuscarProducto(ProductoBuscar.toLowerCase()));
                }
                //Seteo de cantidad
                Cantidad = Double.parseDouble(JOptionPane.showInputDialog("Por favor, seleccione la cantidad de producto"));
                    while (Cantidad <= 0) {
                        Cantidad = Double.parseDouble(JOptionPane.showInputDialog("Por favor, seleccione un número mayor que 0, para la cantidad"));
                    }
                Pedido.setCantidad(Cantidad);
                //Seteo de Cliente
                Cliente = JOptionPane.showInputDialog("Por favor, digite el nombre del cliente");
                Pedido.setCliente(Cliente.toLowerCase());
                //Seteo de direccion
                Direccion = JOptionPane.showInputDialog("Por favor, digite la direccion del cliente");
                Pedido.setDireccionEnvio(Direccion.toLowerCase());
                //Agregar pedido a la Lista
                listaDePedidos.AgregarNodo(Pedido);
                //Confirmacion
                JOptionPane.showMessageDialog(null, "El Pedido fue agregado exitosamente \n");
                listaDePedidos.MostrarNodos(); 
            break;
            case 4:
                Busqueda = JOptionPane.showInputDialog("Por favor, digite un criterio de búsqueda [Nombre del cliente / Dirección]");
                listaDePedidos.BuscarNodo(Busqueda.toLowerCase());
            break;
            case 5:
                Busqueda = JOptionPane.showInputDialog("Por favor, digite un criterio de búsqueda [Nombre del cliente / Dirección]");
                listaDePedidos.EditarNodo(Busqueda.toLowerCase());
            break; 
            case 6:
                Busqueda = JOptionPane.showInputDialog("Por favor, digite un criterio de búsqueda [Dirección]");
                //Busqueda.toLowerCase();
                listaDePedidos.EliminarNodo(Busqueda.toLowerCase());
            break; 
            case 7:
                JOptionPane.showMessageDialog(null, "Gracias por usar el sistema");
            break; 
            default:
                JOptionPane.showMessageDialog(null, "Por favor, eljia una opción del menú");
        }
    } while (Opcion != 7); 
    }
}
