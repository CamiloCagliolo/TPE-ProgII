package TPE.Main;
import TPE.Alumno.*;
import TPE.Lista.Lista;
import TPE.Lista.NodoComparable;

import java.util.Comparator;

public class Main {

    public static void main(String[] args){
        /*Lista lista = new Lista(new ComparadorStringMayorAMenor());

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

        System.out.println("Pruebo crear una lista con enteros, sin comparador, y agrego varios elementos de forma desordenada:");
        Lista l1 = new Lista();

        l1.add(3);
        l1.add(21);
        l1.add(22);
        l1.add(11);
        l1.add(4);
        l1.add(5);
        l1.add(48);
        l1.add(101);
        l1.add(2);
        l1.add(0);

        System.out.println(l1);

        System.out.println("Agrego un comparador que los ordena de mayor a menor: ");
        l1.setComparador(new ComparadorNumerosMayorAMenor());
        System.out.println(l1);

        System.out.println("Quito el comparador (ahora es null): ");
        l1.setComparador(null);
        System.out.println(l1);*/

        Lista alumnos = new Lista();
        Alumno a1 = new Alumno("Ricardo", "Milos", 1234567, 24);
        Alumno a2 = new Alumno("Camilo", "Cagliolo", 43867925, 24);
        Alumno a3 = new Alumno("Juan", "Pérez", 15684321, 26);
        Alumno a4 = new Alumno("Mequedé", "Sinideas", 9999999, 15);
        Alumno a5 = new Alumno("Jesús", "De Nazareth", 0000000, 33);
        Alumno a6 = new Alumno("Camilo", "Cagliolo", 42867924, 24);

        System.out.println("Veo si salta el error por querer agregar un objeto no comparable cuando no tengo comparador: ");
        alumnos.add(a1);
        alumnos.setComparador(new ComparadorNombre());
        alumnos.add(a1);
        alumnos.add(a2);
        alumnos.add(a3);
        alumnos.add(a4);
        alumnos.add(a5);
        alumnos.add(a6);

        System.out.println(alumnos);

        System.out.println("Cambio el orden según DNI");
        alumnos.setComparador(new ComparadorDNI());
        System.out.println(alumnos);

        System.out.println("Cambio el orden según edad");
        alumnos.setComparador(new ComparadorEdad());
        System.out.println(alumnos);

        System.out.println("Genero un comparador compuesto: primero ordena edad, luego nombre, luego apellido, luego DNI");
        Comparator comp1 = new ComparadorCompuesto(new ComparadorApellido(), new ComparadorDNI());
        Comparator comp2 = new ComparadorCompuesto(new ComparadorNombre(), comp1);
        Comparator comp3 = new ComparadorCompuesto(new ComparadorEdad(), comp2);

        alumnos.setComparador(comp3);
        System.out.println(alumnos);




    }
}
