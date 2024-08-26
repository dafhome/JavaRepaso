public class Cursos {


    private String escuela;
    private String localidadEscuela;
    private double precioCurso;
    private boolean cursoNocturno;

    public Cursos(String escuela, String localidadEscuela, double precioCurso, boolean cursoNocturno) {
        this.escuela = escuela;
        this.localidadEscuela = localidadEscuela;
        this.precioCurso = precioCurso;
        this.cursoNocturno = cursoNocturno;
    }

    public Cursos() {
    }

    public String getEscuela() {
        return escuela;
    }
    public void setEscuela(String escuela) {
        this.escuela = escuela;
    }
    public String getLocalidadEscuela() {
        return localidadEscuela;
    }
    public void setLocalidadEscula(String localidadEscuela) {
        this.localidadEscuela = localidadEscuela;
    }
    public double getPrecioCurso() {
        return precioCurso;
    }
    public void setPrecioCurso(double precioCurso) {
        this.precioCurso = precioCurso;
    }
    public boolean isCursoNocturno() {
        return cursoNocturno;
    }
    public void setCursoNocturno(boolean cursoNocturno) {
        this.cursoNocturno = cursoNocturno;
    }
    @Override
    public String toString() {
        String nocturno;
        if (cursoNocturno) {
            nocturno = "tiene";
        }
        else{
            nocturno = "no tiene";
        }
        return "El curso de Java en la escuela " + escuela + " en la localidad " + localidadEscuela + " tiene un precio de " + precioCurso
                + "€ y " + nocturno + " modalidad nocturna.";
    }

    

    
}
