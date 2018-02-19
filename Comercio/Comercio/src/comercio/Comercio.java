package comercio;

import java.util.Arrays;

public class Comercio{

    public static void main(String[] args){
        Producto[] productos={new Producto("PRO3","Uvas","PRE1"),new Producto("PRO1","Peras","PRE3"),new Producto("PRO2","Patatas","PRE2")};
        Precio[] precios={new Precio("PRE2",2),new Precio("PRE1",5),new Precio("PRE3",7)};
        Ventas[] ventas={new Ventas("1","PRO1",7),new Ventas("2","PRO2",9),new Ventas("3","PRO3",4)};
        Ticket[] ticket=new Ticket[3];
        
        for(int i=0;i<ticket.length;i++){
            ticket[i]= new Ticket();
        }
        
        Metodos obx1 = new Metodos();
        //obx1.crearTicket(ventas, productos, precios, ticket);
        
        obx1.mostrarProductos(ventas, productos, precios);
        System.out.println("Producto: "+Metodos.producto+"\nPrecio: "+Metodos.precio); 

    }
    
}
