package TPE.Lista;

import java.util.Comparator;

class Nodo extends ElementoLista{
    private Object valor;
    public Nodo(Object o){
        this.valor = o;
    }

    public void setSiguiente(Nodo s){
        this.nodo = s;
    }

    public Object getValor(){
        return this.valor;
    }

    public Nodo getSiguiente(){
        if(this.nodo != null){
            return this.nodo;
        }
        return null;
    }

    public String construirSalida(int iteracion){
        if(this.nodo != null){
            String str = ", [" + iteracion + "]=> " + this.nodo.getValor().toString();
            iteracion++;
            return str + this.nodo.construirSalida(iteracion);
        }
        return ")";
    }


}
