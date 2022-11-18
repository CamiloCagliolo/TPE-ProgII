package TPE.Comparadores;
import java.util.Comparator;

public class ComparadorIntegers implements Comparator<Integer> {
    public int compare(Integer i1, Integer i2){
        return i1.compareTo(i2);
    }
}
