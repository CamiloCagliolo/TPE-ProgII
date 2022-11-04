package TPE.Main;
import TPE.Lista.Lista;

public class Main {

    public static void main(String[] args){
        Lista lista = new Lista();

        for(int i = 0; i < 15; i++){
            lista.addNodo("Objeto " + i);
        }

        System.out.println(lista.get(4));
    }
}
