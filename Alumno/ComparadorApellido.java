package TPE.Alumno;

import java.util.Comparator;

public class ComparadorApellido implements Comparator<Alumno> {

    public int compare(Alumno a1, Alumno a2){
        return a1.getApellido().compareTo(a2.getApellido());
    }
}
