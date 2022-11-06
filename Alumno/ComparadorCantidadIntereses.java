package TPE.Alumno;

import TPE.Lista.Lista;

import java.util.Comparator;

public class ComparadorCantidadIntereses implements Comparator {

    public int compare(Object o1, Object o2){
        Alumno a1 = (Alumno) o1;
        Alumno a2 = (Alumno) o2;

        Lista intereses1 = a1.getIntereses();
        Lista intereses2 = a2.getIntereses();

        return intereses1.length() - intereses2.length();
    }
}
