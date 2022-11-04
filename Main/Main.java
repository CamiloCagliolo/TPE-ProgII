package TPE.Main;
import TPE.Lista.Lista;

public class Main {

    public static void main(String[] args){
        Lista lista = new Lista();

        for(int i = 0; i < 15; i++){
            lista.addNodo("Objeto " + i);
        }
        System.out.println("Lista original: ");
        System.out.println(lista);

        System.out.println("Borro el nodo en el lugar 6: ");
        lista.deleteNodo(6);
        System.out.println(lista);

        System.out.println("Busco la posición del string Objeto 7");
        System.out.println("Posición: " + lista.buscarPosicion("Objeto 7"));

        System.out.println("Borro al Objeto 7 con deleteElemento()");
        lista.deleteElemento("Objeto 7");
        System.out.println(lista);
    }
}
