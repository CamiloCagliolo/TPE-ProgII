package TPE.Universidad.Comparadores;
import TPE.Universidad.AlumnoUniversitario;
import TPE.Universidad.EntidadUniversitaria;

import java.util.Comparator;

public class ComparadorEntidades implements Comparator {
    private Comparator compAlumnos;
    private Comparator compEntidades;


    public ComparadorEntidades(Comparator c1, Comparator c2){
        compAlumnos = c1;
        compEntidades = c2;
    }

    public int compare(Object o1, Object o2){
        if(compEntidades.compare(o1, o2) != 0){
            return compEntidades.compare(o1,o2);
        }
        try{
            AlumnoUniversitario a1 = (AlumnoUniversitario) o1;
            AlumnoUniversitario a2 = (AlumnoUniversitario) o2;
            return compAlumnos.compare(a1, a2);
        }
        catch(Exception ex){
            EntidadUniversitaria e1 = (EntidadUniversitaria) o1;
            EntidadUniversitaria e2 = (EntidadUniversitaria) o2;
            return e1.getNombre().compareTo(e2.getNombre());
        }
    }
}
