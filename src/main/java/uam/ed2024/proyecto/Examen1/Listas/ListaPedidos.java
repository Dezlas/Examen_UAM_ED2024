/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uam.ed2024.proyecto.Examen1.Listas;
import javax.swing.JOptionPane;
import  uam.ed2024.proyecto.Examen1.clases.Pedidos;
import  uam.ed2024.proyecto.Examen1.Nodo.Nodo;

/**
 *
 * @author Josue
 */
    
public class ListaPedidos {
    
    Nodo<Pedidos> root = null;
    private int NumeroPedido = 0;
    
 //Metodos   
    public void EditarNodo(String valor){
        int comprobador = BuscarNodo(valor);
            if (comprobador == 0){
              return;
            }
        int IDpedido = Integer.parseInt(JOptionPane.showInputDialog("Por favor, digite el Numero_Pedido que desea modificar"));
        Nodo<Pedidos> tempRoot = root;
        //String concatenado = "";
        //boolean comprobador = false;
        while(tempRoot != null){
            if(IDpedido == tempRoot.datos.getNumeroPedido()){
                int Opcion = 0;
                do{  
                    Opcion = Integer.parseInt(JOptionPane.showInputDialog(tempRoot.datos.toString() + " \n"
                    + " \n"
                    + "***Por favor, seleccione la opción deseada:***\n"
                    + " \n"       
                    + "1 = Modificar Direccion del pedido\n"
                    + "2 = Modificar Cantidad del pedido\n"
                    + "3 = Salir\n"
                    + " \n"));  
                    switch (Opcion) {
                        case 1:
                           String nuevaDireccion = JOptionPane.showInputDialog("Por favor, digite la nueva direccion del pedido"); 
                           tempRoot.datos.setDireccionEnvio(nuevaDireccion);
                           JOptionPane.showMessageDialog(null, "La Dirección se actualizó correctamente");
                        break;
                        case 2:   
                            double nuevaCantidad = Double.parseDouble(JOptionPane.showInputDialog("Por favor, seleccione la nueva cantidad")); 
                            while (nuevaCantidad <= 0) {
                                nuevaCantidad = Double.parseDouble(JOptionPane.showInputDialog("Por favor, seleccione un número mayor que 0"));
                            }
                            tempRoot.datos.setCantidad(nuevaCantidad);
                            JOptionPane.showMessageDialog(null, "La cantidad se actualizó correctamente");
                        break;
                        case 3:
                            JOptionPane.showMessageDialog(null, "Saliendo...");
                        break; 
                        default:
                            JOptionPane.showMessageDialog(null, "Por favor, elija una opción del menú");
                    } 
                }while (Opcion != 3);
                return;
            } else {
                tempRoot = tempRoot.siguiente;
            }
        }
        JOptionPane.showMessageDialog(null, "El Numero_Pedido no corresponde a ningun pedido del sistema");            
    }
    
    public void EliminarNodo(String valor){
        int comprobador = BuscarNodo(valor);
            if (comprobador == 0){
              return;
            }
        int IDpedido = Integer.parseInt(JOptionPane.showInputDialog("Por favor, digite el Numero_Pedido que desea Eliminar"));
        Nodo<Pedidos> tempRoot_actual = root;
        Nodo<Pedidos> tempRoot_aBorrar = root.siguiente;
        if (IDpedido == tempRoot_actual.datos.getNumeroPedido()){
            int Opcion = 0; // root.s.s.da
                do{  
                    Opcion = Integer.parseInt(JOptionPane.showInputDialog("***¿Seguro desea eliminar el siguiente pedido?***\n"
                    + " \n"
                    + tempRoot_actual.datos.toString() + " \n"
                    + " \n"       
                    + "1 = ELIMINAR el pedido\n"
                    + "2 = Salir\n"
                    + " \n"));  
                    switch (Opcion) {
                        case 1:
                           root = root.siguiente;
                           JOptionPane.showMessageDialog(null, "El Pedido ha sido eliminado");
                           MostrarNodos();
                        return;
                        case 2:
                            JOptionPane.showMessageDialog(null, "Saliendo...");
                        break; 
                        default:
                            JOptionPane.showMessageDialog(null, "Por favor, elija una opción del menú");
                    } 
                }while (Opcion != 2);
                return;
        }
        while(tempRoot_aBorrar != null){
            if(IDpedido == tempRoot_aBorrar.datos.getNumeroPedido()){
                int Opcion = 0; // root.s.s.da
                do{  
                    Opcion = Integer.parseInt(JOptionPane.showInputDialog("***¿Seguro desea eliminar el siguiente pedido?***\n"
                    + " \n"
                    + tempRoot_aBorrar.datos.toString() + " \n"
                    + " \n"       
                    + "1 = ELIMINAR el pedido\n"
                    + "2 = Salir\n"
                    + " \n"));  
                    switch (Opcion) {
                        case 1:
                           tempRoot_actual.siguiente = tempRoot_aBorrar.siguiente;
                           JOptionPane.showMessageDialog(null, "El Pedido ha sido eliminado");
                           MostrarNodos();
                        return;
                        case 2:
                            JOptionPane.showMessageDialog(null, "Saliendo...");
                        break; 
                        default:
                            JOptionPane.showMessageDialog(null, "Por favor, elija una opción del menú");
                    } 
                }while (Opcion != 2);
                return;
            } else {
                tempRoot_actual = tempRoot_actual.siguiente;
                tempRoot_aBorrar = tempRoot_aBorrar.siguiente;
            }
        }
        JOptionPane.showMessageDialog(null, "El Numero_Pedido no corresponde a ningun pedido del sistema");
    }

    public void AgregarNodo(Pedidos Datos){
        root= new Nodo(Datos,root);
        NumeroPedido = NumeroPedido+1;
        Datos.setNumeroPedido(NumeroPedido);
    }
    
//        AGREGAR NODO DE FORMA CLASICA    
//        public void AgregarNodoClasico(Pedidos Datos){
//        Nodo<Pedidos> nodoNuevo = new Nodo (Datos, null);
//        if(root == null)
//        {
//            root = nodoNuevo;
//            NumeroPedido = NumeroPedido+1;
//            Datos.setNumeroPedido(NumeroPedido);
//            
//        }else
//        {
//            Nodo<Pedidos> temporal = root;
//            while (temporal.siguiente != null)
//            {
//                temporal = temporal.siguiente;
//            }
//            temporal.siguiente = nodoNuevo;
//            NumeroPedido = NumeroPedido+1;
//            Datos.setNumeroPedido(NumeroPedido);
//        }
//    }
    
    public void MostrarNodos(){
        String concatenado = "";
        Nodo<Pedidos> tempRoot = root;
        if(tempRoot == null){
            JOptionPane.showMessageDialog(null, "No hay pedidos enlistados");
        }else{
            JOptionPane.showMessageDialog(null, "Datos encontrados");
            while(tempRoot != null){
                concatenado += "<html><label>" + tempRoot.datos.toString() + "<br></label></html>" ;
                tempRoot = tempRoot.siguiente;
            }
        JOptionPane.showMessageDialog(null, concatenado);
        }
    }
 
    public int BuscarNodo(String valor){
        Nodo<Pedidos> tempRoot = root;
        String concatenado = "";
        boolean comprobador = false;
        if(tempRoot == null){
            JOptionPane.showMessageDialog(null, "No se encontró pedido, la lista esta vacia.");
            return 0;
        }else{
            while(tempRoot != null){
                if(valor.equals(tempRoot.datos.getCliente()) || valor.equals(tempRoot.datos.getDireccionEnvio())){
                    concatenado += "<html><label>" + tempRoot.datos.toString() + "<br></label></html>";
                    tempRoot = tempRoot.siguiente;
                    comprobador = true;
                }else{
                    tempRoot = tempRoot.siguiente;
                }
            }
            if(comprobador){  
                JOptionPane.showMessageDialog(null, concatenado);
                return 1;
            }else{    
                JOptionPane.showMessageDialog(null, "No hay pedidos con este criterio de busqueda");
                return 0;
            }
        }
    }
}

    
 