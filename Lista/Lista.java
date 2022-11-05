package TPE.Lista;
import java.util.Comparator;

public class Lista extends ElementoLista{
    private Comparator comparador;

    public Lista(Comparator c){
        this.comparador = c;
    }

    public void setComparador(Comparator c){
        this.comparador = c;

        for(int i = 0; i < this.length(); i++){
            this.sort(c);
        }
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
        Nodo n = new Nodo(o);
        super.checkOrden(n,this.comparador);
    }

    public int length(){
        int iteracion = 0;
        return super.length(iteracion);
    }

    public Object get(int indice){
        int iteracion = 0;
        return super.verSiSiguienteTiene(indice, iteracion);
    }

    public void deleteNodo(int indice){
        int iteracion = 0;
        super.deleteNodo(indice, iteracion);
    }

    public void deleteElemento(Object o){
        super.deleteElemento(o);
    }

    public int buscarPosicion(Object o) {
        int indice = 0;
        return super.buscarPosicion(o, indice);
    }

}
