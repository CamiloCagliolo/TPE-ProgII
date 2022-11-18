package TPE.Alumno;

import java.util.Comparator;

public class ComparadorCompuesto implements Comparator{
    private Comparator c1;
    private Comparator c2;

    public ComparadorCompuesto(Comparator c1, Comparator c2){
        this.c1 = c1;
        this.c2 = c2;
    }
    public int compare(Object o1, Object o2){
        if(c1.compare(o1, o2) != 0){
            return c1.compare(o1,o2);
        }
        else{
            return c2.compare(o1,o2);
        }
    }
}
