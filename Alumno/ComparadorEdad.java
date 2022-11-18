package TPE.Alumno;

import java.util.Comparator;

public class ComparadorEdad implements Comparator<Alumno> {

    public int compare(Alumno a1, Alumno a2){
        return a1.getEdad() - a2.getEdad();
    }
}
