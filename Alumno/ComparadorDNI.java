package TPE.Alumno;

import java.util.Comparator;

public class ComparadorDNI implements Comparator {

    public int compare(Object o1, Object o2){
        Alumno a1 = (Alumno) o1;
        Alumno a2 = (Alumno) o2;
        return a1.getDni() - a2.getDni();
    }
}
