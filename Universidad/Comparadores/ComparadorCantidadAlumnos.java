package TPE.Universidad.Comparadores;
import TPE.Universidad.EnteUni;

import java.util.Comparator;

public class ComparadorCantidadAlumnos implements Comparator<EnteUni> {

    public int compare(EnteUni e1, EnteUni e2){
        return e1.getCantidadAlumnos() - e2.getCantidadAlumnos();
    }
}
