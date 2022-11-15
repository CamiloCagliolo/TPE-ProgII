package TPE.Universidad.Comparadores;
import TPE.Universidad.EntidadUniversitaria;

import java.util.Comparator;

public class ComparadorCantidadAlumnos implements Comparator {

    public int compare(Object o1, Object o2){
        EntidadUniversitaria e1 = (EntidadUniversitaria) o1;
        EntidadUniversitaria e2 = (EntidadUniversitaria) o2;

        return e1.getCantidadAlumnos() - e2.getCantidadAlumnos();
    }
}
