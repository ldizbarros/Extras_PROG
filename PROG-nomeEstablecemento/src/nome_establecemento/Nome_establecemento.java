
package nome_establecemento;

import java.util.Scanner;


public class Nome_establecemento {

   
    public static void main(String[] args) {

        Scanner cs= new Scanner(System.in);
        
        int cocacola, pcoca=7;
        int auga, pauga=2;
        int entregado;
                
        System.out.println("Nome establecemento");
        
        System.out.println("cantidade cocacolas");
        cocacola= cs.nextInt();
 
        System.out.println("cantidade augas");
        auga= cs.nextInt();
        
        System.out.println("total= "+(cocacola*pcoca+auga*pauga));
        
        System.out.println("entregado");
        entregado= cs.nextInt();
        
        System.out.println("devolve "+(entregado-(cocacola*pcoca+auga*pauga)));

        System.out.println("Grazas por vir");
        
        System.out.println("Laura no me copies");
        
        System.out.println("Que no pesada no te copio");
    }
    
}