package TPE.Universidad;
import TPE.Lista.Lista;
import java.util.Comparator;

public class GrupoUniversitario extends UniversidadOGrupo implements EntidadUniversitaria{
    private String nombre;


    public GrupoUniversitario(String n, Comparator c){
        nombre = n;
        entidades = new Lista(c);
    }

    public void setNombre(String n){
        nombre = n;
    }

    public String getNombre(){
        return this.nombre;
    }
}
