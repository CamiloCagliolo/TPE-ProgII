package TPE.Universidad;
import TPE.Alumno.Alumno;

public class AlumnoUni extends Alumno implements EnteUni{

    public AlumnoUni(String n, String a, int dni, int e){
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
