package TPE.Alumno;

import java.util.Comparator;

public class ComparadorDNI implements Comparator<Alumno> {

    public int compare(Alumno a1, Alumno a2){
        return a1.getDni() - a2.getDni();
    }
}
