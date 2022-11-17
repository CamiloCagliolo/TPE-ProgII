package TPE.Universidad;
import TPE.Lista.Lista;
import java.util.Comparator;

public class GrupoUniversitario implements EntidadUniversitaria{
    private String nombre;
    private Lista entidades;

    public GrupoUniversitario(String n, Comparator c){
        nombre = n;
        entidades = new Lista(c);
    }

    public GrupoUniversitario(String n){
        nombre = n;
        entidades = new Lista();
    }

    public void setNombre(String n){
        nombre = n;
    }

    public String getNombre(){
        return this.nombre;
    }


    public void addEntidad(EntidadUniversitaria e){
        try{
            Comparator c = entidades.getComparador();
            GrupoUniversitario g = (GrupoUniversitario) e;
            g.setComparador(c);
            entidades.add(g);
        }
        catch (Exception ex){
            entidades.add(e);
        }
    }

    public void setComparador(Comparator c){
        entidades.setComparador(c);
    }

    public int getCantidadAlumnos(){
        int sum = 0;
        for(int i = 0; i < entidades.length(); i++){
            EntidadUniversitaria aux = (EntidadUniversitaria) entidades.get(i);
            sum += aux.getCantidadAlumnos();
        }
        return sum;
    }

    public void deleteEntidad(EntidadUniversitaria e){
        entidades.deleteElemento(e);
        for(int i = 0; i < entidades.length(); i++){
            if(isGroup(entidades.get(i))){
                ((GrupoUniversitario) entidades.get(i)).deleteEntidad(e);
            }
        }
    }

    protected boolean isGroup(Object o){
        try{
            GrupoUniversitario g = (GrupoUniversitario) o;
            return true;
        }
        catch (Exception ex){
            return false;
        }
    }

    @Override
    public String toString(){
        String auxStr = "";
        EntidadUniversitaria aux;
        for(int i = 0; i < entidades.length(); i++){
            aux = (EntidadUniversitaria) entidades.get(i);
            if(i == 0 && entidades.length() != 1){
                auxStr += this.nombre + ": " + aux.getNombre() + ", ";
            } else if (i == 0 && entidades.length() == 1) {
                auxStr += this.nombre + ": " + aux.getNombre();
            }
            else if (i == entidades.length() - 1){
                auxStr += aux.getNombre();
            }
            else{
                auxStr += aux.getNombre() + ", ";
            }

        }
        return auxStr;
    }
}
