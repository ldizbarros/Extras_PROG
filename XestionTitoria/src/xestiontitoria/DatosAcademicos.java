package xestiontitoria;

public class DatosAcademicos {
    private String referencia;
    private int nota;
    
    //CONSTRUCTORES
    public DatosAcademicos(){
        
    }
    public DatosAcademicos(String referencia,int nota){
        this.referencia=referencia;
        this.nota=nota;
    }
    
    //M. ACCESO
    public String getReferencia(){
        return referencia;
    }
    public int getNota(){
        return nota;
    }
    public void setReferencia(String referencia){
        this.referencia=referencia;
    }
    public void setNota(int nota){
        this.nota=nota;
    }
    
    //METODOS
    public void visualizarDatosAcademicos(){
        System.out.println("Referencia: "+referencia+"\nNota: "+nota);
    }
}
