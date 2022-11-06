package TPE.Alumno;

import java.util.Comparator;

public class ComparadorInverso implements Comparator {
    private Comparator c;

    public ComparadorInverso(Comparator c){
        this.c = c;
    }

    public int compare(Object o1, Object o2){
        return -c.compare(o1,o2);
    }
}
