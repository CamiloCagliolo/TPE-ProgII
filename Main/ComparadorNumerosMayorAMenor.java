package TPE.Main;

import java.util.Comparator;

public class ComparadorNumerosMayorAMenor implements Comparator {


    @Override
    public int compare(Object o1, Object o2) {
        int n1 = (int) o1;
        int n2 = (int) o2;
        return n2-n1;
    }
}
