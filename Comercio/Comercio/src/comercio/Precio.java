package comercio;

public class Precio{
    
    private String referenciaPrecio;
    float precio;

    public Precio(){
    }

    public Precio(String referenciaPrecio, float precio){
        this.referenciaPrecio=referenciaPrecio;
        this.precio=precio;
    }

    public String getReferenciaPrecio(){
        return referenciaPrecio;
    }

    public void setReferenciaPrecio(String referenciaPrecio){
        this.referenciaPrecio=referenciaPrecio;
    }

    public float getPrecio(){
        return precio;
    }

    public void setPrecio(float precio){
        this.precio=precio;
    }

    @Override
    public String toString(){
        return "Referencia del Precio: "+referenciaPrecio+"\nPrecio:"+precio;
    }
    
    
}
