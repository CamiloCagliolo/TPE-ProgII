package TPE.Lista;

class Node<T>{
    private Node<T> next;
    private T value;

    Node(T v){
        setValue(v);
    }

    Node<T> getNext() {
        return next;
    }

    T getValue() {
        return value;
    }

    void setNext(Node<T> next) {
        this.next = next;
    }

    void setValue(T value) {
        this.value = value;
    }




}
