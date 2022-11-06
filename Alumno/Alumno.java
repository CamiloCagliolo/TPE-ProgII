package TPE.Alumno;
import TPE.Lista.Lista;

public class Alumno {
    private String nombre;
    private String apellido;
    private int dni;
    private int edad;
    private Lista intereses;

    public Alumno(){
        nombre = "Carlitos";
        apellido = "Balá";
        dni = 103;
        edad = 92;
    }

    public Alumno(String n, String a, int dni, int e){
        nombre = n;
        apellido = a;
        this.dni = dni;
        edad = e;
    }
}
