package TPE.Lista;

import java.util.Comparator;

public class ElementoLista {
    protected Nodo nodo;

    /**
     * Método para reordenar la lista si la lista original tenía comparador.
     */
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

    /**
     * Método para reordenar la lista si no hay comparador disponible
     * (asume que entonces los elementos de la lista son comparables).
     * Este método es llamado desde setComparador() en Lista, cuando el comparador
     * es null. Si los objetos de la lista no fuesen comparables entonces
     * arrojará un error que será capturado por el bloque try dentro de setComparador(),
     * alertando de que una lista de objetos no comparables no puede no tener comparador.
    */
    public void sort(){
        NodoComparable aux = (NodoComparable) this.nodo;
        NodoComparable n2 = (NodoComparable) this.nodo.getSiguiente();
        if(this.nodo != null && this.nodo.getSiguiente() != null){
            if(aux.getValor().compareTo(n2.getValor()) > 0){
                this.nodo = n2;
                aux.setSiguiente(this.nodo.getSiguiente());
                this.nodo.setSiguiente(aux);
            }
        }
        else{
            return;
        }
        this.nodo.sort();
    }

    /**
     * Borra un nodo de la lista dado un determinado indice.
     */
    protected void deleteNodo(int indice, int iteracion){
        if(indice == iteracion){
            this.nodo = this.nodo.getSiguiente();
        }
        else{
            this.nodo.deleteNodo(indice, iteracion+1);
        }
    }

    /**
     * Método de los nodos para chequear si el siguiente nodo tiene el índice
     * adecuado. En ese caso retorna el objeto almacenado en el nodo.
     */
    protected Object buscarNodo(int indice, int iteracion){
        if(indice == iteracion && this.nodo != null) {
            return this.nodo.getValor();
        }
        if(this.nodo != null) {
            iteracion++;
            return this.nodo.buscarNodo(indice, iteracion);
        }
        return null;
    }

    /**
     * Dado un determinado objeto, se busca entre los nodos. Si el siguiente nodo
     * contiene el objeto, se lo quita de la cadena y se chequea que el que viene
     * después no contenga también ese objeto. Al ser una lista ordenada, se quitan
     * todos los objetos repetidos, que deberían estar uno al lado del otro.
     */
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

    /**
     * Calcula el largo de la lista, recorriendo todos los nodos y sumando una
     * iteración por cada uno. Una vez que llega al último retorna la cantidad de
     * iteraciones.
     */
    protected int length(int iteracion){
        if(this.nodo == null){
            return iteracion;
        }
        return this.nodo.length(iteracion+1);
    }

    /**
     * Busca la posición de un objeto en la lista. Cada nodo pregunta si el siguiente
     * tiene el valor; si es así retorna el número de iteración. Esto permite encontrar
     * sólo la primera ocurrencia, ya que corta la cadena al primer encuentro.
     */
    protected int buscarPosicion(Object o, int indice){
        if(this.nodo != null && this.nodo.getValor().equals(o)){
            return indice;
        }
        if(this.nodo != null) {
            return this.nodo.buscarPosicion(o, indice+1);
        }
        return -1;
    }

    /**
     * Método para, dado un nuevo nodo y un comparador, comprobar en qué posición
     * de la lista debe colocarse. Compara entre el valor del nodo nuevo y el
     * valor del siguiente. Si es mayor lo pasa al siguiente, si es menor entonces
     * reasigna las direcciones de memoria de los distintos objetos.
     */
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

    /**
     * Similar al checkOrden con un comparador, pero este método asume que el nodo
     * nuevo es comparable y en vez de usar un comparador utiliza su método compareTo.
     * Esto debería funcionar siempre porque este método se lo llama desde el método
     * add() de Lista, que hace un try donde castea el nodo a NodoComparable y el
     * objeto a Comparable, y si no funciona simplemente arroja error.
     */
    protected void checkOrden(NodoComparable n){
        if(nodo == null) {
            this.nodo = n;
            return;
        }
        int resultado = n.getValor().compareTo(this.nodo.getValor());
        if(resultado > 0){
            this.nodo.checkOrden(n);
        }
        else{
            NodoComparable aux = (NodoComparable) this.nodo;
            this.nodo = n;
            this.nodo.setSiguiente(aux);
        }
    }
}
