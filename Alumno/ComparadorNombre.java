package TPE.Alumno;

import java.util.Comparator;

public class ComparadorNombre implements Comparator {

    public int compare(Object o1, Object o2){
        Alumno a1 = (Alumno) o1;
        Alumno a2 = (Alumno) o2;
        return a1.getNombre().compareTo(a2.getNombre());
    }
}
