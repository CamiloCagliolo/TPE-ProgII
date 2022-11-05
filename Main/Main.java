package TPE.Main;
import TPE.Lista.Lista;
import java.util.Comparator;

public class Main {

    public static void main(String[] args){
        Lista lista = new Lista(new ComparadorStringMayorAMenor());

        for(int i = 0; i < 9; i++){
            lista.add("Objeto " + i);
        }

        System.out.println("Lista original según el comparador que le di: ");
        System.out.println(lista);

        System.out.println("Agrego Objeto 26 a la lista: ");
        lista.add("Objeto " + 26);
        System.out.println(lista);

        System.out.println("Pongo un comparador nuevo: ");
        lista.setComparador(new ComparadorString());
        System.out.println(lista);

        System.out.println("Agrego Objeto 6: ");
        lista.add("Objeto " + 6);
        System.out.println(lista);

        System.out.println("Elimino los Objeto 6: ");
        lista.deleteElemento("Objeto 6");
        System.out.println(lista);

        System.out.println("Busco la posición del Objeto 8.");
        int pos = lista.buscarPosicion("Objeto 8");
        System.out.println("Posición del Objeto 8: " + pos);

        System.out.println("Le pido a la lista el objeto en la posición " + pos);
        System.out.println("El objeto en esa posición es: " + lista.get(pos));

        System.out.println("Borro el objeto en la posición " + pos);
        lista.deleteNodo(pos);
        System.out.println(lista);

     
    }
}
