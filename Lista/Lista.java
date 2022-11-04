package TPE.Lista;

public class Lista {
    private Nodo primero;

    public void addNodo(Object o){
        Nodo n = new Nodo(o);
        if(primero == null) {
            this.primero = n;
            return;
        }
        this.primero.setSiguiente(n);
    }

    public int length(){
        if(this.primero == null){
            return 0;
        }
        int iteracion = 1;
        return this.primero.calcularLength(iteracion);
    }
    public Object get(int indice){
        if(indice == 0){
            return this.primero.getValor();
        }
        int iteracion = 1;
        return this.primero.verSiSiguienteTiene(indice, iteracion);     //Como el primer nodo no tiene el objeto, lo llama
    }                                                                   // para preguntarle si el que viene después tiene el objeto.

    public void deleteNodo(int indice){
        if(indice == 0){
            this.primero = this.primero.getSiguiente();
            return;
        }
        int iteracion = 1;
        this.primero.deleteSiguiente(indice, iteracion);
    }

    public void deleteElemento(Object o){
        if(this.primero.getValor().equals(o)){
            this.primero = this.primero.getSiguiente();
        }
        this.primero.deleteElemento(o);
    }

    public int buscarPosicion(Object o) {
        if (this.primero.getValor().equals(o)) {
            return 0;
        }
        int indice = 1;
        return this.primero.buscarPosicion(o, indice);
    }

    @Override
    public String toString(){
        int iteracion = 1;
        if(this.primero != null){
            return "([0]=> " + this.primero.getValor().toString() + this.primero.construirSalida(iteracion);
        }
        return "[]";
    }
}
