package TPE.Lista;

import java.util.Comparator;

public class ElementoLista {
    protected Nodo nodo;

    protected void sort(Comparator c){
        if(this.nodo != null && this.nodo.getSiguiente() != null){
            int resultado = c.compare(this.nodo.getValor(), this.nodo.getSiguiente().getValor());
            if(resultado > 0){
                Nodo aux = this.nodo;
                this.nodo = this.nodo.getSiguiente();
                aux.setSiguiente(this.nodo.getSiguiente());
                this.nodo.setSiguiente(aux);
            }
        }
        else{
            return;
        }
        this.nodo.sort(c);
    }

    protected void deleteNodo(int indice, int iteracion){
        if(indice == iteracion){
            this.nodo = this.nodo.getSiguiente();
        }
        else{
            this.nodo.deleteNodo(indice, iteracion+1);
        }
    }

    protected Object verSiSiguienteTiene(int indice, int iteracion){
        if(indice == iteracion && this.nodo != null) {
            return this.nodo.getValor();
        }
        if(this.nodo != null) {
            iteracion++;
            return this.nodo.verSiSiguienteTiene(indice, iteracion);
        }
        return null;
    }

    protected void deleteElemento(Object o){
        if(this.nodo != null && this.nodo.getValor().equals(o)){
            while(this.nodo.getValor().equals(o)){
                this.nodo = this.nodo.getSiguiente();
            }
        }
        else if(this.nodo != null){
            this.nodo.deleteElemento(o);
        }
    }

    protected int length(int iteracion){
        if(this.nodo == null){
            return iteracion;
        }
        iteracion++;
        return this.nodo.length(iteracion);
    }

    protected int buscarPosicion(Object o, int indice){
        if(this.nodo != null && this.nodo.getValor().equals(o)){
            return indice;
        }
        indice++;
        if(this.nodo != null) {
            return this.nodo.buscarPosicion(o, indice);
        }
        return -1;
    }

    protected void checkOrden(Nodo n, Comparator c){
        if(nodo == null) {
            this.nodo = n;
            return;
        }
        int resultado = c.compare(n.getValor(), this.nodo.getValor());
        if(resultado > 0){
            this.nodo.checkOrden(n, c);
        }
        else{
            Nodo aux = this.nodo;
            this.nodo = n;
            this.nodo.setSiguiente(aux);
        }
    }
}
