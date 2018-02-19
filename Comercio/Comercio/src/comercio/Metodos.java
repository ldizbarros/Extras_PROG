package comercio;

import java.util.Arrays;
import javax.swing.JOptionPane;

public class Metodos{
    
    static String producto;
    static float precio;
    
    public void crearTicket(Ventas[] ventas, Producto[] productos, Precio[] precios, Ticket[] ticket){
        String numeroVenta,referenciaProducto,referenciaPrecio,nombre;
        float precio,cantidad;

        for(int i=0;i<ventas.length;i++){
            numeroVenta=ventas[i].getNumeroVenta();
            ticket[i].setNumeroVenta(numeroVenta);
            referenciaProducto=ventas[i].getReferenciaProducto();
            cantidad=ventas[i].getCantidade();
            for(int u=0;u<productos.length;u++){
                if(referenciaProducto.equals(productos[u].getReferenciaProducto())){
                    nombre=productos[u].getNombreProducto();
                    referenciaPrecio=productos[u].getReferenciaPrecio();
                    ticket[i].setNombre(nombre);
                    for(int x=0;x<precios.length;x++){
                        if(referenciaPrecio.equals(precios[x].getReferenciaPrecio())){
                            precio=precios[x].getPrecio();
                            ticket[i].setPrecioTotal(precio*cantidad);
                        }
                    }
                }
            }
            System.out.println("Ticket "+(i+1)+": \n"+(ticket[i].toString())+"\n");
        }
    }
    
    public void mostrarProductos(Ventas[] ventas, Producto[] productos, Precio[] precios){
        String numVenta = JOptionPane.showInputDialog("Introduce el numero de venta");
        
        for (int i=0;i<ventas.length;i++){
            if (numVenta.equalsIgnoreCase(ventas[i].getNumeroVenta())){
                for (int j=0;j<productos.length;j++){
                    if (ventas[i].getReferenciaProducto().equals(productos[j].getReferenciaProducto())){
                        producto=productos[j].getNombreProducto();
                        for (int k=0;k<precios.length;k++){
                            if(productos[j].getReferenciaPrecio().equalsIgnoreCase(precios[k].getReferenciaPrecio())){
                                precio=precios[k].getPrecio();
                            }
                        }
                    }
                }
            }
        }
    }
}
