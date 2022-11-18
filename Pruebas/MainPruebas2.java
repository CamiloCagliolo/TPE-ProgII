package TPE.Pruebas;
import TPE.Lista.VinculatedList;

public class MainPruebas2 {

    public static void main(String[] args){
        VinculatedList<String> l1 = new VinculatedList<>(new ComparadorStringMayorAMenor());
        l1.add("Objeto 1");
        l1.add("Objeto 2");
        l1.add("Objeto 3");
        l1.add("Objeto 7");
        l1.add("Objeto 7");
        l1.add("Objeto 7");
        l1.add("Objeto 9");

        System.out.println("Imprimo la lista que armé: ");
        System.out.println(l1);

        System.out.println("\nLe cambio el orden: ");
        l1.setNewComparator(new ComparadorString());
        System.out.println(l1);

        System.out.println("\nMe fijo el elemento en la posición 1: ");
        System.out.println("Elemento en la posición 1: " + l1.get(1));
        System.out.println("\nMe fijo la posición en la que está el Objeto 1: ");
        System.out.println(l1.getPosition("Objeto 1"));


        System.out.println("\nBorro el elemento en la posición 0: ");
        l1.deleteByPosition(0);
        System.out.println(l1);

        System.out.println("\nBorro el Objeto 9");
        l1.delete("Objeto 9");
        System.out.println(l1);
        System.out.println("\nBorro el Objeto 7");
        l1.delete("Objeto 7");
        System.out.println(l1);

        for(String s: l1){
            System.out.println(s);
        }
    }

}
