package xestiontitoria;

public class Alumno {
    private String nome;
    private DatosAcademicos academicos = new DatosAcademicos();
    private DatosPersoais persoais = new DatosPersoais();
    
    //CONSTRUCTORES
    public Alumno (){
        
    }
    public Alumno(String nome, DatosAcademicos academicos,DatosPersoais persoais){
        this.nome=nome;
        this.academicos=academicos;
        this.persoais=persoais;
    }
    
    //M. ACCESO
    public String getNome(){
        return nome;
    }
    public DatosAcademicos getAcademicos(){
        return academicos;
    }
    public DatosPersoais getPersoais(){
        return persoais;
    }
    public void setNome(String nome){
        this.nome=nome;
    }
    public void setAcademicos(DatosAcademicos academicos){
        this.academicos=academicos;
    }
    public void setPersoais(DatosPersoais persoais){
        this.persoais=persoais;
    }
    
    //METODOS
    public void visualizarAlumno(){
        System.out.println("DATOS ALUMNO");
        System.out.println("Nome: "+nome);
        academicos.visualizarDatosAcademicos();
        persoais.visualizarDatosPersoais();
    }
}
