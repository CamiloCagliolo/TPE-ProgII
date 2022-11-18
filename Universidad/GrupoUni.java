package TPE.Universidad;
import TPE.Lista.VinculatedList;
import java.util.Comparator;

public class GrupoUni implements EnteUni{
    private String nombre;
    private VinculatedList<EnteUni> entes;

    public GrupoUni(String n, Comparator c){
        nombre = n;
        entes = new VinculatedList<>(c);
    }

    public void setNombre(String n){
        nombre = n;
    }

    public String getNombre(){
        return this.nombre;
    }


    public void addEnte(EnteUni e){
        entes.add(e);
    }

    public void setComparador(Comparator c){
        entes.setNewComparator(c);
    }

    public int getCantidadAlumnos(){
        int sum = 0;
        for(EnteUni e: entes){
            sum += e.getCantidadAlumnos();
        }
        return sum;
    }

    @Override
    public String toString(){
        String auxStr = "";
        EnteUni aux;
        int size = entes.size();
        for(int i = 0; i < size; i++){
            aux = entes.get(i);
            if(i == 0 && aux != null){
                auxStr += this.nombre + ": " + aux.getNombre() + ", ";
            }
            else if (i == size - 1){
                auxStr += aux.getNombre();
            }
            else{
                auxStr += aux.getNombre() + ", ";
            }

        }
        return auxStr;
    }
}
