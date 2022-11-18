package TPE.Alumno;

import TPE.Lista.VinculatedList;
import java.util.Comparator;

public class ComparadorCantidadIntereses implements Comparator<Alumno> {

    public int compare(Alumno a1, Alumno a2){
        VinculatedList<String> intereses1 = a1.getIntereses();
        VinculatedList<String> intereses2 = a2.getIntereses();
        return intereses1.size() - intereses2.size();
    }
}
