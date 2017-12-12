package xestiontitoria;

public class DatosPersoais {
    private String direccion;
    private String telefono;
    
    //CONSTRUCTORES
    public DatosPersoais(){
        
    }
    public DatosPersoais(String direccion,String telefono){
        this.direccion=direccion;
        this.telefono=telefono;
    }
    
    //M. ACCESO
    public String getDireccion(){
        return direccion;
    }
    public String getTelefono(){
        return telefono;
    }
    public void setDireccion(String direccion){
        this.direccion=direccion;
    }
    public void setTelefono(String telefono){
        this.telefono=telefono;
    }
    
    //METODOS
    public void visualizarDatosPersoais(){
        System.out.println("Direccion: "+direccion+"\nTelefono: "+telefono);
    }
}
