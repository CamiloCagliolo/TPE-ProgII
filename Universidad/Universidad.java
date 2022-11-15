package TPE.Universidad;

import TPE.Lista.Lista;
import java.util.Comparator;

public class Universidad extends UniversidadOGrupo{

    public Universidad(Comparator c){
        entidades = new Lista(c);
    }


}
