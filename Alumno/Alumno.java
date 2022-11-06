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

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getDni() {
        return dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setIntereses(Lista l){
        this.intereses = new Lista();
        for(int i = 0; i < l.length(); i++){
            intereses.add(l.get(i));
        }
    }

    public Lista getIntereses(){
        Lista aux = new Lista();
        for(int i = 0; i < this.intereses.length(); i++){
            aux.add(this.intereses.get(i));
        }
        return aux;
    }

    public String toString(){
        if(this.intereses != null){
            return "Alumno: " + this.nombre + " " + this.apellido + " DNI: " + this.dni + " Edad: " + this.edad + " Intereses: " + this.intereses.toString();
        }
        else{
            return "Alumno: " + this.nombre + " " + this.apellido + ", DNI: " + this.dni + ", Edad: " + this.edad + ". Sin intereses.";
        }

    }
}
