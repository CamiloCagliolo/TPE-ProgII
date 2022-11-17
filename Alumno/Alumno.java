package TPE.Alumno;
import TPE.Lista.Lista;

public class Alumno {
    protected String nombre;
    protected String apellido;
    protected int dni;
    protected int edad;
    protected Lista intereses;

    public Alumno(String n, String a, int dni, int e){
        nombre = n;
        apellido = a;
        this.dni = dni;
        edad = e;
        intereses = new Lista();
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

    public void addInteres(String s){
        intereses.add(s);
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
            return "(Alumno: " + this.nombre + " " + this.apellido + " DNI: " + this.dni + " Edad: " + this.edad + " Intereses: " + this.intereses.toString()+")";
        }
        else{
            return "(Alumno: " + this.nombre + " " + this.apellido + ", DNI: " + this.dni + ", Edad: " + this.edad + ". Sin intereses.)";
        }
    }


}
