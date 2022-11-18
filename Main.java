package TPE;

import TPE.Comparadores.ComparadorIntegers;
import TPE.Comparadores.ComparadorInverso;
import TPE.Comparadores.ComparadorStrings;
import TPE.Lista.VinculatedList;
import TPE.Universidad.AlumnoUni;
import TPE.Universidad.Comparadores.ComparadorCantidadAlumnos;
import TPE.Universidad.EnteUni;
import TPE.Universidad.GrupoUni;

import java.util.Comparator;

public class Main {

    public static void main(String[] args){
        /*INCISO a)*/
        System.out.println("Inciso a): Crear la lista con los elementos 10, 21, 1, 5 y 11.");
        VinculatedList<Integer> l1 = new VinculatedList<>(new ComparadorIntegers());
        l1.add(10);
        l1.add(21);
        l1.add(1);
        l1.add(5);
        l1.add(11);
        System.out.println(l1);

        /*INCISO b): */
        System.out.println("\nInciso b): usar un foreach para recorrer la lista.");
        for(Integer i: l1){
            System.out.println(i);
        }

        /*INCISO c)*/
        System.out.println("\nInciso c): borrar el elemento en la posición 0 y los elementos 5 y 11. Recorrer de nuevo la lista.");
        l1.deleteByPosition(0);
        l1.delete(5);
        l1.delete(11);
        for(Integer i: l1){
            System.out.println(i);
        }
        System.out.println(l1);

        /*INCISO d)*/
        System.out.println("\nInciso d): Crear una lista de Strings en el siguiente orden: Fácil, Es, Parcial, Prog 2.");
        VinculatedList<String> l2 = new VinculatedList<>(new ComparadorStrings());
        l2.add("Fácil");
        l2.add("Es");
        l2.add("Parcial");
        l2.add("Prog 2");
        System.out.println(l2);

        /*INCISO e)*/
        System.out.println("\nInciso e): Recorrer la lista creada con un foreach e imprimir los valores por consola.");
        for(String s: l2){
            System.out.println(s);
        }

        /*INCISO f)*/
        System.out.println("\nInciso f): Imprimir por consola en qué posición se encuentra la palabra Parcial.");
        System.out.println("Parcial está en: " + l2.getPosition("Parcial"));

        /*INCISO g)*/
        System.out.println("\nInciso g): lo mismo con Recuperatorio.");
        System.out.println("Recuperatorio está en: " + l2.getPosition("Recuperatorio"));

        /*INCISO h)*/
        System.out.println("\nInciso h): Cambiar el orden de la lista de Strings para que queden ordenados descendentemente.");
        l2.setNewComparator(new ComparadorInverso(new ComparadorStrings()));
        System.out.println(l2);

        /*INCISO i)*/
        System.out.println("\nInciso i): Implementar dos estructuras e insertarlas en una lista vinculada, ordenada por cantidad de alumnos, de mayor a menor.");
        /*CONSTRUCCIÓN DE LA UNICEN*/

        Comparator c = new ComparadorInverso(new ComparadorCantidadAlumnos());

        AlumnoUni john = new AlumnoUni("John", "Doe", 1200000, 31);
        john.addInteres("intercambio");


        AlumnoUni federico = new AlumnoUni("Federico", "Lopez", 35999888, 23);
        federico.addInteres("redes");
        federico.addInteres("php");
        federico.addInteres("java");
        federico.addInteres("Python");

        AlumnoUni juana = new AlumnoUni("Juana", "Garcia", 27123455, 22);
        juana.addInteres("programación");
        juana.addInteres("php");
        juana.addInteres("java");

        GrupoUni exactas = new GrupoUni("Exactas", c);

        exactas.addEnte(federico);
        exactas.addEnte(juana);

        AlumnoUni flora = new AlumnoUni("Flora", "Rivas", 34555111, 25);
        flora.addInteres("historia");
        flora.addInteres("antigua");

        AlumnoUni martin = new AlumnoUni("Martin", "Gómez", 34111222, 21);
        martin.addInteres("romanos");
        martin.addInteres("egipcios");
        martin.addInteres("griegos");

        AlumnoUni roman = new AlumnoUni("Román", "Bazán", 32555111, 27);
        roman.addInteres("argentina");

        GrupoUni historia = new GrupoUni("Historia", c);

        historia.addEnte(flora);
        historia.addEnte(martin);
        historia.addEnte(roman);

        AlumnoUni mora = new AlumnoUni("Mora", "Díaz", 37124425, 22);
        mora.addInteres("psicologia");
        mora.addInteres("Freud");

        GrupoUni humanas = new GrupoUni("Humanas", c);

        humanas.addEnte(mora);
        humanas.addEnte(historia);

        GrupoUni uni = new GrupoUni("UNICEN", c);

        uni.addEnte(exactas);
        uni.addEnte(humanas);
        uni.addEnte(john);

        /*CONSTRUCCIÓN DE LA OLIMPIADA DE MATEMÁTICAS*/

        AlumnoUni benardino = new AlumnoUni("Benardino", "Rivas", 30987654, 18);
        benardino.addInteres("matemáticas");

        AlumnoUni jose = new AlumnoUni("José", "Paso", 33322112, 20);
        jose.addInteres("problemas");

        AlumnoUni newton = new AlumnoUni("Isaac", "Newton", 12343565, 379);
        newton.addInteres("sucesiones");

        GrupoUni fibo = new GrupoUni("Los Fibo", c);
        fibo.addEnte(benardino);
        fibo.addEnte(jose);
        fibo.addEnte(newton);

        AlumnoUni juan = new AlumnoUni("Juan", "Juárez", 33222444, 30);
        juan.addInteres("sucesiones");
        juan.addInteres("álgebra");

        AlumnoUni julio = new AlumnoUni("Julio", "César", 33222111, 2122);
        julio.addInteres("sucesiones");
        julio.addInteres("álgebra");

        GrupoUni mate = new GrupoUni("Matea2", c);
        mate.addEnte(julio);
        mate.addEnte(juan);

        GrupoUni olimpiadas = new GrupoUni("Olimpíadas Matemáticas", c);
        olimpiadas.addEnte(fibo);
        olimpiadas.addEnte(mate);

        VinculatedList<EnteUni> l = new VinculatedList<>(c);
        l.add(uni);
        l.add(olimpiadas);

        System.out.println(l);
    }
}
