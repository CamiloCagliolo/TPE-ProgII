package TPE.Main;
import TPE.Alumno.Alumno;
import TPE.Alumno.ComparadorInverso;
import TPE.Lista.Lista;
import TPE.Universidad.AlumnoUniversitario;
import TPE.Universidad.Comparadores.ComparadorCantidadAlumnos;
import TPE.Universidad.GrupoUniversitario;


public class Main {

    public static void main(String[] args){
        /*INCISO a)*/
        System.out.println("Inciso a):");
        Lista l1 = new Lista();
        l1.add(10);
        l1.add(21);
        l1.add(1);
        l1.add(5);
        l1.add(11);
        System.out.println(l1);

        /*INCISO b): cómo hago el foreach?*/

        /*INCISO c)*/
        System.out.println("\nInciso c):");
        l1.deleteNodo(0);
        l1.deleteElemento(5);
        l1.deleteElemento(11);
        System.out.println(l1);

        /*INCISO d)*/
        System.out.println("\nInciso d):");
        Lista l2 = new Lista();
        l2.add("Fácil");
        l2.add("Es");
        l2.add("Parcial");
        l2.add("Prog 2");
        System.out.println(l2);

        /*INCISO e)*/
        System.out.println("\nInciso e):");
        for(int i = 0; i < l2.length(); i++){
            System.out.println(l2.get(i));
        }

        /*INCISO f)*/
        System.out.println("\nInciso f):");
        System.out.println(l2.buscarPosicion("Parcial"));

        /*INCISO g)*/
        System.out.println("\nInciso g):");
        System.out.println(l2.buscarPosicion("Recuperatorio"));

        /*INCISO h)*/
        System.out.println("\nInciso h):");
        l2.setComparador(new ComparadorStringReverso());
        System.out.println(l2);

        /*INCISO i)*/
        System.out.println("\nInciso i):");
        /*CONSTRUCCIÓN DE LA UNICEN*/

        ComparadorInverso c = new ComparadorInverso(new ComparadorCantidadAlumnos());

        AlumnoUniversitario john = new AlumnoUniversitario("John", "Doe", 1200000, 31);
        john.addInteres("intercambio");


        AlumnoUniversitario federico = new AlumnoUniversitario("Federico", "Lopez", 35999888, 23);
        federico.addInteres("redes");
        federico.addInteres("php");
        federico.addInteres("java");
        federico.addInteres("Python");

        AlumnoUniversitario juana = new AlumnoUniversitario("Juana", "Garcia", 27123455, 22);
        juana.addInteres("programación");
        juana.addInteres("php");
        juana.addInteres("java");

        GrupoUniversitario exactas = new GrupoUniversitario("Exactas", c);

        exactas.addEntidad(federico);
        exactas.addEntidad(juana);

        AlumnoUniversitario flora = new AlumnoUniversitario("Flora", "Rivas", 34555111, 25);
        flora.addInteres("historia");
        flora.addInteres("antigua");

        AlumnoUniversitario martin = new AlumnoUniversitario("Martin", "Gómez", 34111222, 21);
        martin.addInteres("romanos");
        martin.addInteres("egipcios");
        martin.addInteres("griegos");

        AlumnoUniversitario roman = new AlumnoUniversitario("Román", "Bazán", 32555111, 27);
        roman.addInteres("argentina");

        GrupoUniversitario historia = new GrupoUniversitario("Historia", c);

        historia.addEntidad(flora);
        historia.addEntidad(martin);
        historia.addEntidad(roman);

        AlumnoUniversitario mora = new AlumnoUniversitario("Mora", "Díaz", 37124425, 22);
        mora.addInteres("psicologia");
        mora.addInteres("Freud");

        GrupoUniversitario humanas = new GrupoUniversitario("Humanas", c);

        humanas.addEntidad(mora);
        humanas.addEntidad(historia);

        GrupoUniversitario uni = new GrupoUniversitario("UNICEN", c);

        uni.addEntidad(exactas);
        uni.addEntidad(humanas);
        uni.addEntidad(john);

        /*CONSTRUCCIÓN DE LA OLIMPIADA DE MATEMÁTICAS*/

        AlumnoUniversitario benardino = new AlumnoUniversitario("Benardino", "Rivas", 30987654, 18);
        benardino.addInteres("matemáticas");

        AlumnoUniversitario jose = new AlumnoUniversitario("José", "Paso", 33322112, 20);
        jose.addInteres("problemas");

        AlumnoUniversitario newton = new AlumnoUniversitario("Isaac", "Newton", 12343565, 379);
        newton.addInteres("sucesiones");

        GrupoUniversitario fibo = new GrupoUniversitario("Los Fibo", c);
        fibo.addEntidad(benardino);
        fibo.addEntidad(jose);
        fibo.addEntidad(newton);

        AlumnoUniversitario juan = new AlumnoUniversitario("Juan", "Juárez", 33222444, 30);
        juan.addInteres("sucesiones");
        juan.addInteres("álgebra");

        AlumnoUniversitario julio = new AlumnoUniversitario("Julio", "César", 33222111, 2122);
        julio.addInteres("sucesiones");
        julio.addInteres("álgebra");

        GrupoUniversitario mate = new GrupoUniversitario("Matea2", c);
        mate.addEntidad(julio);
        mate.addEntidad(juan);

        GrupoUniversitario olimpiadas = new GrupoUniversitario("Olimpíadas Matemáticas", c);
        olimpiadas.addEntidad(fibo);
        olimpiadas.addEntidad(mate);

        Lista l = new Lista(c);
        l.add(uni);
        l.add(olimpiadas);

        System.out.println(l);



    }
}
