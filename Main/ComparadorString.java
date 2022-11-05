package TPE.Main;

import java.util.Comparator;

public class ComparadorString implements Comparator {

    public int compare(Object s1, Object s2){
        String st1 = (String) s1;
        String st2 = (String) s2;
        st1 = st1.replace("Objeto ", "");
        st2 = st2.replace("Objeto ", "");

        int n1 = Integer.valueOf(st1);
        int n2 = Integer.valueOf(st2);
        return n1 - n2;
    }
}
