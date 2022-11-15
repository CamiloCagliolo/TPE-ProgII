package TPE.Universidad;

import TPE.Lista.Lista;

import java.util.Comparator;

public class UniversidadOGrupo {
    protected Lista entidades;

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
}
