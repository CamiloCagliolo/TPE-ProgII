package TPE.Pruebas;
import TPE.Lista.VinculatedList;

public class MainPruebas2 {

    public static void main(String[] args){
        VinculatedList<Integer> l1 = new VinculatedList<>(new ComparadorNumerosMayorAMenor());
        l1.add(1);
        l1.add(4);
        l1.add(2);
        l1.add(10);
        l1.add(8);

        System.out.println(l1);
        System.out.println(l1.get(1));
        System.out.println(l1.getPosition(2));
    }

}
