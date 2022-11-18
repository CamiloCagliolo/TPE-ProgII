package TPE.Lista;
import java.util.Iterator;

class IteratorHelper<T> implements Iterator {
    private Node<T> pointer;

    public IteratorHelper(Node<T> n){
        pointer = n;
    }

    public Node<T> getPointer(){
        return pointer;
    }

    @Override
    public boolean hasNext() {
        return this.pointer != null;
    }

    @Override
    public T next() {
        T value = pointer.getValue();
        pointer = pointer.getNext();
        return value;
    }
}
