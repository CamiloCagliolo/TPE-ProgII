package TPE.Lista;

public class NodoComparable extends Nodo{
    private NodoComparable nodo;
    private Comparable valor;

    public NodoComparable(Comparable o) {
        super(o);
        valor = o;
    }

    @Override
    public Comparable getValor(){
        return this.valor;
    }

    @Override
    public NodoComparable getSiguiente(){
        return (NodoComparable) super.getSiguiente();
    }
}
