package TPE.Universidad;
import TPE.Alumno.Alumno;

public class AlumnoUniversitario extends Alumno implements EntidadUniversitaria{

    public AlumnoUniversitario(String n, String a, int dni, int e){
        super(n,a,dni,e);
    }

    public int getCantidadAlumnos(){
        return 1;
    }

    @Override
    public String toString(){
        return this.getNombre() + " " + this.getApellido();
    }
}
