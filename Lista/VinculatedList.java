package TPE.Lista;

import java.util.Comparator;

public class VinculatedList<T>{
    private Node<T> first;
    private Comparator<T> c;

    public VinculatedList (Comparator c){
        this.c = c;
    }

    public void add(T ob){
        Node<T> n = new Node<>(ob);
        /*Si no hay primero, entonces el item se añade al primer nodo.*/
        if(first == null){
            first = n;
            return;
        }
        /*Si es menor al primer nodo, entonces el item se añade al primer nodo.*/
        if(c.compare(ob, first.getValue()) < 0){
            n.setNext(first);
            first = n;
            return;
        }

        IteratorHelper<T> it = new IteratorHelper<>(first);

        while(it.hasNext()){
            /*Compara el valor del objeto que se intenta añadir y el del valor del siguiente nodo. Si es mayor, avanza. Si es menor, entonces lo acomoda en ese lugar.*/
            if(c.compare(ob, it.getPointer().getNext().getValue()) > 0){
                it.next();
            }
            else{
                Node<T> pointed = it.getPointer();
                n.setNext(pointed.getNext());
                pointed.setNext(n);
                return;
            }
        }

        /*Si llegó hasta el final, lo coloca en el final.*/
        Node<T> pointed = it.getPointer();
        pointed.setNext(n);
    }

    public T get(int index){
        IteratorHelper<T> it = new IteratorHelper<>(first);

        int aux = 0;
        while(it.hasNext()){
            if(aux == index){
                return it.getPointer().getValue();
            }
            else{
                it.next();
                aux++;
            }
        }
        return null;
    }

    public int getPosition(T ob){
        IteratorHelper<T> it = new IteratorHelper<>(first);
        int aux = 0;
        while(it.hasNext()){
            if(it.getPointer().getValue().equals(ob)){
                return aux;
            }
            else{
                it.next();
                aux++;
            }
        }
        return -1;
    }

    public int size(){
        int aux = 0;
        IteratorHelper<T> it = new IteratorHelper<>(first);
        while(it.hasNext()){
            aux++;
            it.next();
        }
        return aux;
    }

    @Override
    public String toString(){
        String aux = "(";
        int i = 0;
        IteratorHelper<T> it = new IteratorHelper<>(first);
        while(it.hasNext()){
            aux += "[" + i + "]=> " + it.next().toString();
            if(it.hasNext()){
                aux += "; ";
            }
            i++;
        }
        aux += ")";
        return aux;
    }
}
