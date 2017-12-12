package dividir;

public class Dividir {

    public static void main(String[] args) {
        DividirSenExcepcion d1 = new DividirSenExcepcion(5,2);
        
        d1.dividirSenExcepcion();
        d1.sumar();
        
        System.out.println("\n********************\n");
        
        DividirSenExcepcion d2 = new DividirSenExcepcion(0,0);
        
        d2.dividirSenExcepcion();
        d2.sumar();
    }
    
}
