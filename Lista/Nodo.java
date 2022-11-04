package TPE.Lista;

class Nodo {
    private Object valor;
    private Nodo siguiente;
    public Nodo(Object o){
        this.valor = o;
    }

    public Nodo(Nodo n){
        this.valor = n.getValor();
        this.siguiente = n.getSiguiente();
    }

    public void deleteSiguiente(int indice, int iteracion){
        if(indice == iteracion){
            this.siguiente = this.siguiente.getSiguiente();
        }
        else{
            this.siguiente.deleteSiguiente(indice, iteracion+1);
        }
    }

    public void deleteElemento(Object o){
        if(this.siguiente.getValor().equals(o)){
            this.siguiente = this.siguiente.getSiguiente();
        }
        if(this.siguiente != null) {
            this.siguiente.deleteElemento(o);
        }
    }

    public int buscarPosicion(Object o, int indice){
        if(this.siguiente.getValor().equals(o)){
            return indice;
        }
        indice++;
        return this.siguiente.buscarPosicion(o, indice);
    }

    public Object verSiSiguienteTiene(int indice, int iteracion){
        if(indice == iteracion){
            return this.siguiente.getValor();
        }
        iteracion++;
        return this.siguiente.verSiSiguienteTiene(indice, iteracion);
    }

    public int calcularLength(int iteracion){
        if(this.siguiente == null){
            return iteracion;
        }
        iteracion++;
        return this.siguiente.calcularLength(iteracion);
    }

    public void setSiguiente(Nodo n){
        if(this.siguiente == null){
            this.siguiente = n;
            return;
        }
        siguiente.setSiguiente(n);
    }

    public Object getValor(){
        return this.valor;
    }

    public Nodo getSiguiente(){
        if(this.siguiente != null){
            return new Nodo(this.siguiente);
        }
        return null;
    }
}
