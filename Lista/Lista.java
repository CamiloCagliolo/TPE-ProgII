package TPE.Lista;
import java.util.Comparator;

public class Lista extends ElementoLista{
    private Comparator comparador;

    public Lista(){
        this.comparador = null;
    }

    public Lista(Comparator c){
        this.comparador = c;
    }

    public void setComparador(Comparator c){
        if(c != null){
            for(int i = 0; i < this.length(); i++){
                this.sort(c);
            }
        }
        else{
            try {
                for (int i = 0; i < this.length(); i++) {
                    this.sort();
                }
            }
            catch(Exception ex){
                System.out.println("Una lista de objetos no comparables no puede no tener comparador.");
                return;
            }
        }
        this.comparador = c;
    }

    @Override
    public String toString(){
        int iteracion = 1;
        if(this.nodo != null){
            return "([0]=> " + this.nodo.getValor().toString() + this.nodo.construirSalida(iteracion);
        }
        return "()";
    }

    public void add(Object o){
        if(comparador != null){
            Nodo n = new Nodo(o);
            checkOrden(n, this.comparador);
        }
        else{
            try{
                NodoComparable n = new NodoComparable((Comparable) o);
                checkOrden(n);
            }
            catch(Exception ex){
                System.out.println("El objeto no es comparable.");
                System.out.println(ex);
            }

        }
    }

    public int length(){
        int iteracion = 0;
        return length(iteracion);
    }

    public Object get(int indice){
        int iteracion = 0;
        return buscarNodo(indice, iteracion);
    }

    public void deleteNodo(int indice){
        int iteracion = 0;
        deleteNodo(indice, iteracion);
    }

    public void deleteElemento(Object o){
        super.deleteElemento(o);
    }

    public int buscarPosicion(Object o) {
        int indice = 0;
        return buscarPosicion(o, indice);
    }

    public Comparator getComparador(){
        return this.comparador;
    }

}
