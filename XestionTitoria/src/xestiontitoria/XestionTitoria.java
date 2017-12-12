package xestiontitoria;

public class XestionTitoria {

    public static void main(String[] args) {
        DatosAcademicos dAc1 = new DatosAcademicos("DC-1234",7);
        DatosPersoais dPe1 = new DatosPersoais("C/ la candelosa","698523147");
        Alumno al1 = new Alumno("David Martinez",dAc1,dPe1);
        
        al1.visualizarAlumno();
    }
    
}
