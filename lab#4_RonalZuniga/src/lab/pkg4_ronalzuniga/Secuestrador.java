
package lab.pkg4_ronalzuniga;

import java.util.ArrayList;

public class Secuestrador extends Agentes{
    String nombre_victima;
    double rescate;
    ArrayList<Secuestro> s;

    public Secuestrador() {
        super();
    }

    public Secuestrador(String nombre_victima, double rescate, ArrayList<Secuestro> s, String nombre, int edad, String genero, String pais, String descripcion) {
        super(nombre, edad, genero, pais, descripcion);
        this.nombre_victima = nombre_victima;
        this.rescate = rescate;
        this.s = s;
    }


    public String getNombre_victima() {
        return nombre_victima;
    }

    public void setNombre_victima(String nombre_victima) {
        this.nombre_victima = nombre_victima;
    }

    public double getRescate() {
        return rescate;
    }

    public void setRescate(double rescate) {
        this.rescate = rescate;
    }

    @Override
    public String toString() {
        return "Secuestrador{" + "nombre_victima=" + nombre_victima + ", rescate=" + rescate + ", s=" + s + '}';
    }

    @Override
    public void cometer_delito(String c, int n) {
        s.add(new Secuestro(n, c));
    }  
    
}
